package benchmark;

public class SearchandBrowse {
	
	OperateorJump orj = new OperateorJump();

	SearchandBrowse(){
		System.out.println("Search and Browse");
		property.isnormalend = orj.JumporNot();
		
		if( property.isnormalend == 1 ){
			return;
		}
		nextbehaviour();
	}
	
	public void nextbehaviour(){
		double SearchandBrowserate = Math.random();
		while( SearchandBrowserate < 0.6 ){
			System.out.println("Search and Browse");
			SearchandBrowserate = Math.random();
		}
		if ( SearchandBrowserate >= 0.6 && SearchandBrowserate < 0.7 ){
			CollectandCart cc = new CollectandCart();
			return;
		}
		else if( SearchandBrowserate >= 0.7 && SearchandBrowserate < 1 ){
			Buy buy = new Buy();
			return;
		}
	}
	
}
