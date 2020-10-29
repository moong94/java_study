package polymorphism_ZOMBIE;

public class Zombie extends Unit{

	int power;
	
	public Zombie(int pos, int hp, int max) {
		super(pos, hp, max);
	}
	
	public void attack(Unit hero) {
		power = r.nextInt(max) + 1;
		
		
		hero.setHp(hero.getHp() - power);
		if(hero.getHp() <= 0) {
			hero.setHp(0);
		}
		int orihp = this.getHp();
		int heal = power / 2;
		this.setHp(this.getHp() + heal);
		
		System.out.println("����" + power + "�� ���ݷ����� ���� : "
				+ "���� Hero hp : " + hero.getHp() + ", ���� ü�� ȸ�� : " + orihp + " + " + heal);
	}
}
