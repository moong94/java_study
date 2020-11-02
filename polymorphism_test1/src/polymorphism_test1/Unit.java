package polymorphism_test1;

public class Unit {
	String name;
	int currentHp;
	int maxHp;
	int power;
	boolean isDead;
	public Unit(String name, int maxHp, int power) {
		super();
		this.name = name;
		this.currentHp = maxHp;
		this.maxHp = maxHp;
		this.power = power;
		isDead = false;
	}
	void printUnit() {
		System.out.printf("[이름 : %s][체력 : %d/%d][공격력 : %d]"
				, name , currentHp , maxHp , power);
		System.out.println();
	}
	void attack(Unit unit) {
		unit.currentHp -= this.power;
		System.out.printf("[msg] %s 가 %s 에게 데미지 %d 를 입힙니다." ,name , unit.name , power );
		System.out.println();
		if(unit.currentHp <= 0) {
			unit.currentHp = 0;
			unit.isDead = true;
			System.out.printf("[msg] %s 가 사망합니다." ,unit.name);
			System.out.println();
		}
	}
}
