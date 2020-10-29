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
			System.out.println("현재 위치  = " + pos);
			
			System.out.println("앞으로 이동하기(1), 종료하기(2)");
			
			int move = s.nextInt();
			
			if(move == 1) {
				pos++;
				hero.setPos(pos);
				
				if(hero.getPos() == 5) {
					System.out.println("좀비를 만났습니다.");
					
					while(true) {
						System.out.print("공격하기(1), 포션마시기(2) : ");
						int sel = s.nextInt();
						
						if(sel == 1) {
							zombie.attack(hero);
							hero.attack(zombie);
							
							
						}
						else if(sel == 2) {
							hero.recovery();
						}
						
						if(hero.getHp() <= 0) {
							System.out.println("Hero가 죽었습니다. 게임에서 졌습니다.");
							break;
						}
						else if(zombie.getHp() == 0) {
							System.out.println("Zombie가 죽었습니다.");
							break;
						}
					}
				}
				else if(hero.getPos() == 9) {
					System.out.println("보스를 만났습니다.");
					while(true) {
						System.out.print("공격하기(1), 포션마시기(2) : ");
						int sel = s.nextInt();
						
						if(sel == 1) {
							hero.attack(boss);
							boss.attack(hero);
						}
						else if(sel == 2) {
							hero.recovery();
						}
						
						if(hero.getHp() == 0) {
							System.out.println("Hero가 죽었습니다. 게임에서 졌습니다.");
							break;
						}
						else if(boss.getHp() == 0) {
							System.out.println("Boss가 죽었습니다.");
							break;
						}
					}
					if(hero.getHp() == 0) {
						break;
					}
				}
				if(hero.getPos() == 10) {
					System.out.println("게임에서 승리하였습니다.");
					break;
				}
				
			}
			else if(move == 2){
				System.out.println("게임 종료");
				break;
			}
		}
		
	}

}
