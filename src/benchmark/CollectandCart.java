package benchmark;

public class CollectandCart {
	
	OperateorJump orj = new OperateorJump();
	String item;

	CollectandCart(){

		property.isnormalend = orj.JumporNot();

		if( property.isnormalend == 1 ){
			return;
		}
		//System.out.println("Collect and Cart");
		String behaviour = whatbehaviour();
		if (behaviour != null)
			property.addrecord(behaviour, item);
		nextbehaviour();
	}

	public void nextbehaviour() {
		String item;
		double CollectandCartrate = Math.random();

		if (CollectandCartrate < 0.1) {
			CollectandCart cc = new CollectandCart();
		} else if (CollectandCartrate >= 0.1 && CollectandCartrate < 0.9) {
			if (Math.random() < 0.5) {//从收藏中购买
				item = property.collectQueue.randomremove();
				if (item != null)
					new Buy(item);
			} else {//从购物车购买
				item = property.cartQueue.randomremove();
				if (item != null)
					new Buy(item);
			}
			//return;
		}
		else if( CollectandCartrate >= 0.9 && CollectandCartrate < 1 ){
			SearchandBrowse sb = new SearchandBrowse();
			//		return;
		}
	}

	public String whatbehaviour() {
		double judgerate = Math.random();
		String behaviour = null;
		if (judgerate < 0.25) {
			behaviour = "AddCollect";
			item = property.collectQueue.addpro();
		}
		if (judgerate >= 0.25 && judgerate < 0.5) {
			behaviour = "DeleteCollect";
			item = property.collectQueue.randomremove();
			if (item == null)
				behaviour = null;
		}
		if (judgerate >= 0.5 && judgerate < 0.75) {
			behaviour = "AddCart";
			item = property.cartQueue.addpro();
		}
		if (judgerate >= 0.75) {
			behaviour = "DeleteCart";
			item = property.cartQueue.randomremove();
			if (item == null)
				behaviour = null;
		}
		return behaviour;
	}
}
