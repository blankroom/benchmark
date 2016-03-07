package benchmark;

public class CollectandCart {
	
	OperateorJump orj = new OperateorJump();

	CollectandCart(){

		property.isnormalend = orj.JumporNot();

		if( property.isnormalend == 1 ){
			return;
		}
		//System.out.println("Collect and Cart");
		property.addrecord(whatbehaviour());
		nextbehaviour();
	}

	public void nextbehaviour() {
		double CollectandCartrate = Math.random();

		if (CollectandCartrate < 0.1) {
			CollectandCart cc = new CollectandCart();
			return;
		} else if (CollectandCartrate >= 0.1 && CollectandCartrate < 0.9) {
			Buy buy = new Buy();
			return;
		}
		else if( CollectandCartrate >= 0.9 && CollectandCartrate < 1 ){
			SearchandBrowse sb = new SearchandBrowse();
			return;
		}
	}

	public String whatbehaviour() {
		double judgerate = Math.random();
		String behaviour = null;
		if (judgerate < 0.25) {
			behaviour = "AddCollect";
			property.collectQueue.addpro();
		}
		if (judgerate >= 0.25 && judgerate < 0.5) {
			behaviour = "DeleteCollect";
			property.collectQueue.randomremove();
		}
		if (judgerate >= 0.5 && judgerate < 0.75) {
			behaviour = "AddCart";
			property.cartQueue.addpro();
		}
		if (judgerate >= 0.75) {
			behaviour = "DeleteCart";
			property.cartQueue.randomremove();
		}
		return behaviour;
	}
}
