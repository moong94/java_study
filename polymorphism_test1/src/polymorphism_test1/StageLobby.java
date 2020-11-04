package polymorphism_test1;

public class StageLobby extends Stage{

	@Override
	void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	boolean update() {
		while(true) {
			System.out.println("=====[로비]=====");
			System.out.println("1.던전 2.종료");
			int select = GameManager.instance.scan.nextInt();
			if(select==1) {
				GameManager.instance.changeStage("Battle");	
				return false;
			}else if(select == 2){
				GameManager.instance.changeStage("Title");
				return false;
			}		
		}			
	}
}
