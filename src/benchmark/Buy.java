package benchmark;

public class Buy {
	
	OperateorJump orj = new OperateorJump();

	Buy(){
		System.out.println("Buy");
		property.isnormalend = orj.JumporNot();
		
		if( property.isnormalend == 1 ){
			return;
		}
		Buy.nextbehaviour();
		//System.out.println("end");
	}
	
	public static void nextbehaviour(){
		return;
	}
}
