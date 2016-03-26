package benchmark;

public class Buy {
	
	OperateorJump orj = new OperateorJump();

	Buy(String item) {
		property.addrecord("Buy", item);
		/*property.isnormalend = orj.JumporNot();
		
		if( property.isnormalend == 1 ){
			return;
		}*/
		Buy.nextbehaviour(item);
	}

	public static void nextbehaviour(String item) {
		//return;
		double rate = Math.random();
		if(rate < 0.5)
			new SearchandBrowse();
		new Comment(item);
	}
}
