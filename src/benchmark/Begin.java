package benchmark;

public class Begin {
	
	OperateorJump orj = new OperateorJump();

	Begin(){
		System.out.println("Begin");
		property.isnormalend = orj.JumporNot();
		
		if( property.isnormalend == 1 ){
			return;
		}
		nextbehaviour();
	}
	
	public  void nextbehaviour(){
		double Beginrate = Math.random();
		if( Beginrate < 0.5 ){
			SearchandBrowse sb = new SearchandBrowse();
			return;
		}
		else
			return;
			//end.end(0);
	}
}
