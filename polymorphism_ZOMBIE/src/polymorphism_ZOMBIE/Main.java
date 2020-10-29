package polymorphism_ZOMBIE;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		Hero hero = new Hero(1, 200, 20, 2);
		Zombie zombie = new Zombie(5, 100, 10);
		Boss boss = new Boss(9, 300, 20, 100);
		
		int pos = 1;
		hero.setPos(pos);
		while(true) {
			System.out.println("���� ��ġ  = " + pos);
			
			System.out.println("������ �̵��ϱ�(1), �����ϱ�(2)");
			
			int move = s.nextInt();
			
			if(move == 1) {
				pos++;
				hero.setPos(pos);
				
				if(hero.getPos() == 5) {
					System.out.println("���� �������ϴ�.");
					
					while(true) {
						System.out.print("�����ϱ�(1), ���Ǹ��ñ�(2) : ");
						int sel = s.nextInt();
						
						if(sel == 1) {
							zombie.attack(hero);
							hero.attack(zombie);
							
							
						}
						else if(sel == 2) {
							hero.recovery();
						}
						
						if(hero.getHp() <= 0) {
							System.out.println("Hero�� �׾����ϴ�. ���ӿ��� �����ϴ�.");
							break;
						}
						else if(zombie.getHp() == 0) {
							System.out.println("Zombie�� �׾����ϴ�.");
							break;
						}
					}
				}
				else if(hero.getPos() == 9) {
					System.out.println("������ �������ϴ�.");
					while(true) {
						System.out.print("�����ϱ�(1), ���Ǹ��ñ�(2) : ");
						int sel = s.nextInt();
						
						if(sel == 1) {
							hero.attack(boss);
							boss.attack(hero);
						}
						else if(sel == 2) {
							hero.recovery();
						}
						
						if(hero.getHp() == 0) {
							System.out.println("Hero�� �׾����ϴ�. ���ӿ��� �����ϴ�.");
							break;
						}
						else if(boss.getHp() == 0) {
							System.out.println("Boss�� �׾����ϴ�.");
							break;
						}
					}
					if(hero.getHp() == 0) {
						break;
					}
				}
				if(hero.getPos() == 10) {
					System.out.println("���ӿ��� �¸��Ͽ����ϴ�.");
					break;
				}
				
			}
			else if(move == 2){
				System.out.println("���� ����");
				break;
			}
		}
		
	}

}
