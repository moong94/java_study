package whileex;

import java.util.Scanner;
import java.util.Random;

public class WhileEx18 {

	public static void main(String[] args) {
		/*
		 * # 카카오 택시
		 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
		 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
		 * 3. 메뉴는 아래와 같다.
		 * 		1) 속도설정 : 1~3까지만 가능
		 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
		 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
		 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
		 * 예) 1(50) 2(50) 3(100) 4(100) ...
		 */

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// 목적지(destination)
		int desX = ran.nextInt(21) - 10;
		int desY = ran.nextInt(21) - 10;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		
		// 요금
		int fee = 0;
		
		boolean run = true;
		while(run) {
			
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				boolean opt = true;
				while(opt) {
					System.out.println("동(1), 서(2), 남(3), 북(4)");
					dir = scan.nextInt();
					if(dir < 1 || dir > 4) {
						System.out.println("1부터 4까지의 숫자만 입력.");
					}
					else {
						opt = false;
					}
				}
			}
			else if(sel == 2) {
				
				boolean opt = true;
				while(opt) {
					System.out.println("속도 1~3");
					speed = scan.nextInt();
					if(speed < 1 || speed > 3) {
						System.out.println("1부터 3까지의 숫자만 입력.");
					}
					else {
						opt = false;
					}
				}
			}
			else if(sel == 3) {
				boolean opt = true;
				while(opt) {
					if(dir == 0) {
						System.out.println("방향을 설정하세요.");
						opt = false;
					}
					if(speed == 0) {
						System.out.println("속도를 설정하세요.");
						opt = false;
					}
					if(dir == 1) {
						x += speed;
						fee += speed;
						opt = false;
					}
					else if(dir == 2) {
						x -= speed;
						fee += speed;
						opt = false;
					}
					else if(dir == 3) {
						y -= speed;
						fee += speed;
						opt = false;
					}
					else if(dir == 4) {
						y += speed;
						fee += speed;
						opt = false;
					}
					
				}
				
			}
			
			if(desX == x && desY == y) {
				run = false;
			}
		}

		System.out.println("요금 : " + ((fee / 2) * 50));
	}

}
