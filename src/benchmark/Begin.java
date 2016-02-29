package benchmark;

public class Begin {
	
	OperateorJump orj = new OperateorJump();

	Begin(){
		//System.out.println("Begin");
		//property.record += (++ property.number) + "|" + property.id + "|" + property.name + "|" + property.time;
		//System.out.println(property.record);
		property.addrecord("Begin");
		property.isnormalend = orj.JumporNot();

		while (property.isnormalend == 1) {
			//System.out.println("Wait");
			property.addrecord("Wait");
			property.isnormalend = orj.JumporNot();
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
	}
}
