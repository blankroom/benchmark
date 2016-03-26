package benchmark;

import java.util.Date;

public class Begin {

	//OperateorJump orj = new OperateorJump();

	Begin(){
		//property.addrecord("Begin");
		/*property.isnormalend = orj.JumporNot();

		while (property.isnormalend == 1) {
			//System.out.println("Wait");
			property.addrecord("Wait");
			property.isnormalend = orj.JumporNot();
		}*/
		nextbehaviour();
	}

	public void nextbehaviour() {
		double Beginrate = Math.random();
		while (Beginrate < 0.5) {
			property.time = new Date(property.time.getTime() + 1000 * 60 * 60 * 2);
			Beginrate = Math.random();
		}
		property.addrecord("Begin", " ");
		SearchandBrowse sb = new SearchandBrowse();
	}
}
