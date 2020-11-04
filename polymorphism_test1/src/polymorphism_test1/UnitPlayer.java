package polymorphism_test1;

import java.util.Random;
import java.util.Vector;
public class UnitPlayer extends Unit{
	Skill mySkill;
	public UnitPlayer(String name, int maxHp, int power , Skill skill) {
		super(name,  maxHp, power);		
		this.mySkill = skill;
	}
	void normalAttack() {
		Vector<Unit> monList = UnitManager.instance.monsterList;
		Random ran = GameManager.instance.ran;
		while(true) {			
			int index = ran.nextInt(monList.size());
			Unit  mon = monList.get(index);
			if(mon.isDead == false){
				super.attack(mon);
				break;
			}
		}		
	}
	void skillAttack(Unit player) {
		mySkill.skill(player);
	}
	
}
