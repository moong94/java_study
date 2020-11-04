package polymorphism_test1;

import java.util.Vector;
import java.util.Random;

public class SkillPowerAttack extends Skill{
	String info = "���Ѹ��� ���ݷ��� 2���� �������� �����ϴ�.";
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
				System.out.printf("[msg] %s �� %s ���� ������ %d �� �����ϴ�." ,unit.name , mon.name , skillPower );
				System.out.println();
				if(mon.currentHp <= 0) {
					mon.currentHp = 0;
					mon.isDead = true;
					System.out.printf("[msg] %s �� ����մϴ�." ,mon.name);
					System.out.println();
				}
				break;
			}
		}		
		
	}

}
