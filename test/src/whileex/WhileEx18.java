package whileex;

import java.util.Scanner;
import java.util.Random;

public class WhileEx18 {

	public static void main(String[] args) {
		/*
		 * # īī�� �ý�
		 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
		 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
		 * 3. �޴��� �Ʒ��� ����.
		 * 		1) �ӵ����� : 1~3������ ����
		 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
		 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
		 * 4. �Ÿ� 2ĭ �� 50���� �߰��Ǿ� ��ݵ� ����Ѵ�.
		 * ��) 1(50) 2(50) 3(100) 4(100) ...
		 */

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// ������(destination)
		int desX = ran.nextInt(21) - 10;
		int desY = ran.nextInt(21) - 10;
		
		// ���� ��ġ
		int x = 0;
		int y = 0;
		
		// ����(direction)
		int dir = 0;
		
		// �ӵ�
		int speed = 0;
		
		// ���
		int fee = 0;
		
		boolean run = true;
		while(run) {
			
			System.out.println("= īī�� �ý� =");
			System.out.println("������ : " + desX + "," + desY);
			System.out.println("����ġ : " + x + "," + y);
			System.out.println("��   �� : " + dir);
			System.out.println("��   �� : " + speed);
			System.out.println("============");
			
			System.out.println("1.���⼳��");
			System.out.println("2.�ӵ�����");
			System.out.println("3.�̵��ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				boolean opt = true;
				while(opt) {
					System.out.println("��(1), ��(2), ��(3), ��(4)");
					dir = scan.nextInt();
					if(dir < 1 || dir > 4) {
						System.out.println("1���� 4������ ���ڸ� �Է�.");
					}
					else {
						opt = false;
					}
				}
			}
			else if(sel == 2) {
				
				boolean opt = true;
				while(opt) {
					System.out.println("�ӵ� 1~3");
					speed = scan.nextInt();
					if(speed < 1 || speed > 3) {
						System.out.println("1���� 3������ ���ڸ� �Է�.");
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
						System.out.println("������ �����ϼ���.");
						opt = false;
					}
					if(speed == 0) {
						System.out.println("�ӵ��� �����ϼ���.");
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

		System.out.println("��� : " + ((fee / 2) * 50));
	}

}
