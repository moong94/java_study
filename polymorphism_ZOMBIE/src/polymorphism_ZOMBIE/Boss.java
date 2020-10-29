package polymorphism_ZOMBIE;

//Boss 클래스는 Zombie 클래스를 상속받는다.
//Boss 클래스는 보호막 shield 멤버변수를 가진다.
//공격 메소드 void attack( Unit enemy ) 
//일반공격 : 1~공격력(max) 사이의 랜덤 값을 공격력으로 사용하여 enemy의 체력 감소시킴 (출력 예 : “보스가 15 의 공격력으로 일반 공격 : 현재 Hero의 hp는 25”)
//필살기 : 25%의 확률로 1~max 사이의 공격력의 2배 만큼으로 상대를 공격하는 기능 (출력 예 : “보스가 30 의 공격력으로 필살기 공격 : 현재 Hero의 hp는 25”)
//Boss 클래스는 생성자를 가짐(현재위치, 체력,공격력, 보호막)

import java.util.*;

public class Boss extends Zombie{
		
	Random r = new Random();
	
	private int shield;
	
	public void setShield(int value) {
		this.shield = value;
	}
	public int getShield() {
		return shield;
	}
	
	public Boss(int pos, int hp, int max, int shield) {
		super(pos, hp, max);
		this.shield = shield;
	}
	
	public void attack(Unit hero) {
		
		int a = r.nextInt(4) + 1;
		if(a == 1) {
			System.out.println("보스의 필살기 발동 2배의 공격력");
			int power = 2 * (r.nextInt(max) + 1);
			hero.setHp(hero.getHp() - power);
			if(hero.getHp() <= 0) {
				hero.setHp(0);
			}
			System.out.println("보스가 " + power + "의 공격력으로 공격 : "
					+ "현재 Hero hp : " + hero.getHp());
		}
		else {
			System.out.println("보스의 일반공격");
			int power = r.nextInt(max) + 1;
			hero.setHp(hero.getHp() - power);
			if(hero.getHp() <= 0) {
				hero.setHp(0);
			}
			System.out.println("보스가 " + power + "의 공격력으로 공격 : "
					+ "현재 Hero hp : " + hero.getHp());
		}
	}

}
