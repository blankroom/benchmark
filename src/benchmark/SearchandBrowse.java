package benchmark;

public class SearchandBrowse {

	private OperateorJump orj = new OperateorJump();

	SearchandBrowse(){
		property.isnormalend = orj.JumporNot();
		
		if( property.isnormalend == 1 ){
			return;
		}
		nextbehaviour();
	}

	public void nextbehaviour(){
		//property.browseQueue.addpro();
		String item = chooseNewOrOld();
		double SearchorBrowse = Math.random();
		if (SearchorBrowse < 0.5)
			//System.out.println("Search");
			property.addrecord("Search", item);
		else {
			//System.out.println("Browse");
			property.addrecord("Browse", item);
		}

		nextnextbehaviour(item);
	}

	public void nextnextbehaviour(String item) {
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
			Buy buy = new Buy(item);
		}
	}

	public String chooseNewOrOld() {
		double rate = Math.random();
		if (rate < 0.6 || property.browseQueue.isEmpty())
			return property.browseQueue.addpro();
		else
			return property.browseQueue.randomget();
	}
	
}
