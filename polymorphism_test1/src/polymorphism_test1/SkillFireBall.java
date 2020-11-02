package polymorphism_test1;

import java.util.Random;
import java.util.Vector;

public class SkillFireBall extends Skill{
	String info = "����ü����  ���̾�� �����մϴ�.";
	int skillPower;
	@Override
	void skill(Unit unit) {
		Vector<Unit> monsterList = UnitManager.instance.monsterList;
		Random ran = GameManager.instance.ran;
		skillPower = ran.nextInt(25) + 25;
		System.out.println(info);
		for(Unit mon : monsterList) {
			if(mon.isDead == false) {
				System.out.printf("[msg] %s �� %d�� ���ظ� �Խ��ϴ�.\n",
				                    mon.name , skillPower);
				mon.currentHp -= skillPower;
				if(mon.currentHp <= 0) {
					mon.currentHp = 0;
					mon.isDead = true;
					System.out.printf("[msg] %s �� ����մϴ�." ,mon.name);
					System.out.println();
				}
			}
		}		
	}
}
