package polymorphism_test1;

import java.util.Random;
import java.util.Vector;

public class Monster extends Unit{

	public Monster(String name,  int maxHp, int power) {
		super(name,  maxHp, power);
		
	}
	void attack() {
		Vector<Unit> playerList = UnitManager.instance.playerList;
		Random ran = GameManager.instance.ran;
		while(true) {			
			int index = ran.nextInt(playerList.size());
			Unit  player = playerList.get(index);
			if(player.isDead == false){
				super.attack(player);
				break;
			}
		}		
	}
}
