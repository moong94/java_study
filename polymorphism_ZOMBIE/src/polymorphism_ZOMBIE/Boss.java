package polymorphism_ZOMBIE;

//Boss Ŭ������ Zombie Ŭ������ ��ӹ޴´�.
//Boss Ŭ������ ��ȣ�� shield ��������� ������.
//���� �޼ҵ� void attack( Unit enemy ) 
//�Ϲݰ��� : 1~���ݷ�(max) ������ ���� ���� ���ݷ����� ����Ͽ� enemy�� ü�� ���ҽ�Ŵ (��� �� : �������� 15 �� ���ݷ����� �Ϲ� ���� : ���� Hero�� hp�� 25��)
//�ʻ�� : 25%�� Ȯ���� 1~max ������ ���ݷ��� 2�� ��ŭ���� ��븦 �����ϴ� ��� (��� �� : �������� 30 �� ���ݷ����� �ʻ�� ���� : ���� Hero�� hp�� 25��)
//Boss Ŭ������ �����ڸ� ����(������ġ, ü��,���ݷ�, ��ȣ��)

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
			System.out.println("������ �ʻ�� �ߵ� 2���� ���ݷ�");
			int power = 2 * (r.nextInt(max) + 1);
			hero.setHp(hero.getHp() - power);
			if(hero.getHp() <= 0) {
				hero.setHp(0);
			}
			System.out.println("������ " + power + "�� ���ݷ����� ���� : "
					+ "���� Hero hp : " + hero.getHp());
		}
		else {
			System.out.println("������ �Ϲݰ���");
			int power = r.nextInt(max) + 1;
			hero.setHp(hero.getHp() - power);
			if(hero.getHp() <= 0) {
				hero.setHp(0);
			}
			System.out.println("������ " + power + "�� ���ݷ����� ���� : "
					+ "���� Hero hp : " + hero.getHp());
		}
	}

}
