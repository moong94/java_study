package polymorphism_test1;
import java.util.Vector;
public class UnitManager {
	static UnitManager instance = new UnitManager();
	Vector<Unit> playerList = new Vector<>();
	Vector<Unit> monsterList = new Vector<>();
	void init() {
		setPlayer();
	}
	void setPlayer() {	
		playerList.clear();
		playerList.add(new UnitPlayer("파이터" , 100,  30 ,
				new SkillPowerAttack()));
		playerList.add(new UnitPlayer("마법사" , 80,  20 ,
				new SkillFireBall()));
		playerList.add(new UnitPlayer("힐러" ,  60,  10, 
				new SkillHeal()));
	}
	void setMonster() {
		monsterList.clear();
		monsterList.add(new Monster("늑대" , 200,  5));
		monsterList.add(new Monster("늑대" , 200,  5));
		monsterList.add(new Monster("박쥐" , 150,  7));
		monsterList.add(new Monster("박쥐" , 150,  7));
	}
	void printPlayer() {
		System.out.println("=====[플레이어]=====");
		for(Unit player : playerList) {
			player.printUnit();
		}
		System.out.println("==================");
	}
	void printMonster() {
		System.out.println("=====[몬스터]=====");
		for(Unit mon : monsterList) {
			mon.printUnit();
		}
		System.out.println("==================");
	}
	
	
}
