package whileex;

import java.util.Scanner;

public class WhileEx11 {

	public static void main(String[] args) {
		/*
		 * # ����Ų���31
		 * 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�.
		 * 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�.
		 * 3. br�� 31�� ������ ������ ����ȴ�.
		 * 4. �¸��ڸ� ����Ѵ�.
		 * 
		 * ��) 
		 * 1�� : p1(2)	br(2)
		 * 2�� : p2(1)	br(3)
		 * 3�� : p1(3)	br(6)
		 * ...
		 */

		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;

		Scanner scan = new Scanner(System.in);
		
		while(br < 31) {
			boolean tf = true;
			
			if(turn % 2 == 0) {
				System.out.print((turn + 1) + "�� : p1 �Է� : ");
				while(tf) {
					int inputp1 = scan.nextInt();
					if(inputp1 > 3 || inputp1 < 1) {
						System.out.print("1~3������ ���� �ٽ� �Է� : ");
					}
					else {
						br += inputp1;
						System.out.println((turn + 1) + "�� : p1(" + inputp1 + ")   br(" + br + ")");
						turn++;
						tf = false;
					}
				}
			}
			else if(turn % 2 == 1) {
				System.out.print((turn + 1) + "�� : p2 �Է� : ");
				while(tf) {
					int inputp2 = scan.nextInt();
					if(inputp2 > 3 || inputp2 < 1) {
						System.out.print("1~3������ ���� �ٽ� �Է� : ");
					}
					else {
						br += inputp2;
						System.out.println((turn + 1) + "�� : p2(" + inputp2 + ")   br(" + br + ")");
						turn++;
						tf = false;
					}
				}
			}
			
		}
		int result = (turn % 2);
		if(result == 1) {
		System.out.print("�¸��� : p2");
		}
		if(result == 0) {
			System.out.print("�¸��� : p1");
		}
	}

}
