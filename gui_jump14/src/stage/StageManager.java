package stage;
import java.awt.Graphics;
public class StageManager {
	
	public static StageManager instance = new StageManager();
	private Stage[] stageList;
	private int currentState;
	
	public static final int STAGE_MENU = 0;
	public static final int STAGE_LEVEL1 = 1;
	public static final int STAGE_MAX = 2;
	public void init() {
		stageList = new Stage[STAGE_MAX];
		currentState = STAGE_MENU;
		loadState(currentState);
	}
	private void loadState(int state) {
		if(state == STAGE_MENU) {
			stageList[state] = new StageMenu();
		}
		else if(state == STAGE_LEVEL1) {
			stageList[state] = new StageLevel1();
		}
		stageList[state].init();
	}
	private void unloadState(int state) {
		stageList[state] = null;
	}
	public void setState(int state) {
		unloadState(currentState);
		currentState = state;
		loadState(currentState);		
	}
	public void update() {
		stageList[currentState].update();
	}
	public void render(Graphics g) {
		stageList[currentState].render(g);
	}
}
