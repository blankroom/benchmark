package benchmark;

public class CollectandCart {
	
	OperateorJump orj = new OperateorJump();

	CollectandCart(){

		property.isnormalend = orj.JumporNot();
		
		if( property.isnormalend == 1 ){
			return;
		}
		//System.out.println("Collect and Cart");
		property.addrecord("Collect and Cart");
		CollectandCart.nextbehaviour();
	}
	
	public static void nextbehaviour(){
		double CollectandCartrate = Math.random();
		
		if( CollectandCartrate < 0.9 ){
			Buy buy = new Buy();
			return;
		}
		else if( CollectandCartrate >= 0.9 && CollectandCartrate < 1 ){
			SearchandBrowse sb = new SearchandBrowse();
			return;
		}
	}
}
