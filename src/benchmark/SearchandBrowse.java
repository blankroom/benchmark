package benchmark;

public class SearchandBrowse {

	private OperateorJump orj = new OperateorJump();

	SearchandBrowse(){
		property.isnormalend = orj.JumporNot();
		
		if( property.isnormalend == 1 ){
			return;
		}

		//System.out.println("Search and Browse");
		nextbehaviour();
	}

	public void nextbehaviour(){
		double SearchorBrowse = Math.random();
		if (SearchorBrowse < 0.5)
			//System.out.println("Search");
			property.addrecord("Search");
		else {
			//System.out.println("Browse");
			property.addrecord("Browse");
			property.browseQueue.addpro();
		}

		nextnextbehaviour();
	}

	public void nextnextbehaviour() {
		double SearchandBrowserate = Math.random();
		if (SearchandBrowserate < 0.6) {
			/*System.out.println("Search and Browse");
			SearchandBrowserate = Math.random();*/
			SearchandBrowse sb = new SearchandBrowse();
		}
		if ( SearchandBrowserate >= 0.6 && SearchandBrowserate < 0.7 ){
			CollectandCart cc = new CollectandCart();
		}
		else if( SearchandBrowserate >= 0.7 && SearchandBrowserate < 1 ){
			Buy buy = new Buy();
		}
	}
	
}
