package benchmark;

public class CartQueue extends CollectQueue {
	public CartQueue(){
		maxsize = 5;
	}

	public String getItemFromOtherQueue() {
		double rate = Math.random();
		String item;
		if (rate < 0.5) {
			item = property.browseQueue.randomget();
			property.browseQueue.remove(item);
		} else if (property.collectQueue.isEmpty()) {
			item = property.browseQueue.randomget();
			property.browseQueue.remove(item);
		} else {
			item = property.collectQueue.randomget();
			property.collectQueue.remove(item);
		}
		return item;
	}
}
