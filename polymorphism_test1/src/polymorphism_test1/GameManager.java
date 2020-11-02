package polymorphism_test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GameManager {
	static GameManager instance = new GameManager();
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	Map<String, Stage> stageList = new HashMap<String, Stage>();
	String currentStageName = "";
	String nextStageName = "";
	void init() {
		UnitManager.instance.init();
		stageList.put("Title", new StageTitle());
		stageList.put("Lobby", new StageLobby());
		stageList.put("Battle", new StageBattle());
		nextStageName = "Title";
		update();
	}
	void update() {
		while(!changeStage(nextStageName)) {
			break;
		}
		System.out.println("[게임종료]");
	}
	boolean changeStage(String nextStageName) {
		if(nextStageName.equals("")) return false;
		if(currentStageName.equals(nextStageName)) return true;
		currentStageName = nextStageName;
		Stage currentStage = stageList.get(currentStageName);
		currentStage.init();
		while(true) {
			if(!currentStage.update()) break;
		}		
		return true;
	}
	
}
