package benchmark;

public class OperateorJump {

	private double jumprate;
	private double continuerate;
	
	public int JumporNot(){
		jumprate = Math.random();
		
		if( jumprate < 0.05 ){
			System.out.println("Pause");
			return ContinueorBegin();
		}
		
		return 0;
	}
	
	public int ContinueorBegin(){
		continuerate = Math.random();
		
		if( continuerate < 0.9 ){
			System.out.println("Continue");
			return 0;
		}
		else{
			System.out.println("Beginagain");
			return 1;
		}
	}
	
}
