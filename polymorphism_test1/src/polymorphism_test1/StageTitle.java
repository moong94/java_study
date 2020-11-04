package polymorphism_test1;

public class StageTitle extends Stage{
	@Override
	void init() {
		
	}

	@Override
	boolean update() {
		System.out.println("=====[타이틀]=====");
		System.out.println("[1.시작] [2.종료]");
		int select = GameManager.instance.scan.nextInt();
		if(select == 1) {
			GameManager.instance.changeStage("Lobby");			
		}else {
			GameManager.instance.changeStage("");			
		}
		return false;
		
	}

}
