package benchmark;

public class Buy {
	
	OperateorJump orj = new OperateorJump();

	Buy(){
		property.addrecord("Buy");
		/*property.isnormalend = orj.JumporNot();
		
		if( property.isnormalend == 1 ){
			return;
		}*/
		Buy.nextbehaviour();
	}
	
	public static void nextbehaviour(){
		//return;
		double rate = Math.random();
		if(rate < 0.5)
			new SearchandBrowse();
		new Comment();
	}
}
