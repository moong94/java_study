package polymorphism_ZOMBIE;

public class Hero extends Unit {
	int power;
	int count;
	
	public Hero(int pos, int hp, int max, int count) {
		super(pos, hp, max);
		this.count = count;
	}
	
	public void attack(Unit enemy) {
		
		if(enemy instanceof Boss) {
			Boss boss = (Boss)enemy;
			power = r.nextInt(max) + 1;
			if(boss.getShield() > 0) {
				int r = boss.getShield() - power;
				if(r >= 0) {
					boss.setShield(boss.getShield() - power);
				}
				else {
					boss.setShield(0);
					boss.setHp(boss.getHp() + r);
				}
			}
			else {
				boss.setHp(boss.getHp() - power);
			}
			
			if(boss.getHp() <= 0) {
				boss.setHp(0);
			}
			System.out.println("히어로가 " + power + "의 공격력으로 공격 : "
					+ "현재 Boss hp : " + boss.getHp());
		}
		else {
			power = r.nextInt(max) + 1;
			enemy.setHp(enemy.getHp() - power);
			if(enemy.getHp() <= 0) {
				enemy.setHp(0);
			}
			System.out.println("히어로가 " + power + "의 공격력으로 공격 : "
					+ "현재 Zombie hp : " + enemy.getHp());
		}
	}
	
	public void recovery() {
		if(count > 0) {
			setHp(getHp() + 100);
			System.out.println("체력을 회복해서 " + getHp() + "이 되었습니다.");
			count--;
		}
		else if(count == 0) {
			System.out.println("물약을 모두 사용했습니다.");
		}
	}
}
