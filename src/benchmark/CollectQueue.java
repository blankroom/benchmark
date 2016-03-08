package benchmark;

public class CollectQueue extends ShopQueue{
	public CollectQueue(){
		maxsize = 5;
	}

	public String addpro() {
		String e = getItemFromOtherQueue();
		if (isFull())
			remove(0);
		add(e);
		return e;
	}

	public String getItemFromOtherQueue() {
		double rate = Math.random();
		String item;
		if (rate < 0.5) {
			item = property.browseQueue.randomget();
			property.browseQueue.remove(item);
		} else if (property.cartQueue.isEmpty()) {
			item = property.browseQueue.randomget();
			property.browseQueue.remove(item);
		} else {
			item = property.cartQueue.randomget();
			property.cartQueue.remove(item);
		}
		return item;
	}
}
