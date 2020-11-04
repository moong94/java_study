package polymorphism_test1;

import java.util.Vector;

public class StageBattle extends Stage{
	boolean turn;
	Vector<Unit> playerList;
	Vector<Unit> monsterList;
	@Override
	void init() {
		UnitManager.instance.setMonster();		
		playerList = UnitManager.instance.playerList;
		monsterList = UnitManager.instance.monsterList;
		turn= true;
	}
	@Override
	boolean update() {		
		boolean run = true;		
		while(run) {
			UnitManager.instance.printMonster();
			UnitManager.instance.printPlayer();	
			boolean allDead = false;
			if(turn) {	
				allDead = playerTurn();
			}else {
				allDead = monsterTurn();
			}
			if(allDead)break;
		}
		GameManager.instance.changeStage("Lobby");
		return false;		
	}
	boolean playerTurn() {
		 
		int playerSize = playerList.size();		
		int playerIndex = 0;
		while(true) {					
			
			UnitPlayer player = (UnitPlayer)playerList.get(playerIndex);
			
			if(allDead(playerList)) {
				System.out.println("생존한 플레이어가 없어 던전에 입장할 수 없습니다.");
				GameManager.instance.changeStage("Lobby");
				return false;
			}
			if(player.isDead) {
			}
			else{
				System.out.printf("[%s turn] " , player.name);
				System.out.println("[1.공격] [2.스킬]");
				int sel = GameManager.instance.scan.nextInt();
				if(sel == 1) {						
					if(player.isDead== false) {
						player.normalAttack();
					}				
				}else if(sel == 2) {
					if(player.isDead== false) {
						player.skillAttack(player);
					}
				}
				if(allDead(monsterList)) return true;	
			}	
			
			playerIndex += 1;
			if(playerIndex >= playerSize) {
				turn = false;
				break;
			}
		}
		return false;
	}
	boolean allDead(Vector<Unit> unitList) {
		int alldead = unitList.size();
		for(Unit unit: unitList) {
			if(unit.isDead == true) {
				alldead -= 1;
			}
		}
		if(alldead == 0) return true;
		return false;
	}
	
	boolean monsterTurn() {
		
		int monsterSize = monsterList.size();		
		int monsterIndex = 0;
		while(true) {
			Monster monster = (Monster)monsterList.get(monsterIndex);
			if(monster.isDead==false) {
				System.out.printf("[%s 턴]",monster.name);
				monster.attack();
			}
			
			if(allDead(playerList)) return true;
			
			monsterIndex += 1;
			if(monsterIndex >= monsterSize) {
				turn = true;
				break;
			}
		}
		return false;
		
	}
}
