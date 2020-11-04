package polymorphism_test1;

import java.util.Vector;
import java.util.Random;

public class SkillPowerAttack extends Skill{
	String info = "적한명에게 공격력의 2배의 데미지를 입힙니다.";
	int skillPower;
	
	@Override
	void skill(Unit unit) {
		System.out.println(info);
		Vector<Unit> monsterList = UnitManager.instance.monsterList;
		Random ran = GameManager.instance.ran;
		
		skillPower = unit.power * 2;
		
		while(true) {			
			int index = ran.nextInt(monsterList.size());
			Unit  mon = monsterList.get(index);
			if(mon.isDead == false){
				mon.currentHp -= skillPower;
				System.out.printf("[msg] %s 가 %s 에게 데미지 %d 를 입힙니다." ,unit.name , mon.name , skillPower );
				System.out.println();
				if(mon.currentHp <= 0) {
					mon.currentHp = 0;
					mon.isDead = true;
					System.out.printf("[msg] %s 가 사망합니다." ,mon.name);
					System.out.println();
				}
				break;
			}
		}		
		
	}

}
