package random;

import java.util.Random;
import java.util.Scanner;

public class RandomEx06 {

	public static void main(String[] args) {
		/*
		 * # ����(0)����(1)��(2) ����[2�ܰ�]
		 * 1. com�� 0~2 ������ ������ ���ڸ� �����Ѵ�.
		 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
		 * 3. com�� me�� ����,
		 * 		1) ����.
		 * 		2) ���� �̰��.
		 * 		3) ���� ����.			�� ����Ѵ�.
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		System.out.println("0~2������ ���� �Է� : ");
		int me = scan.nextInt();
		
		if(com == me) {
			System.out.println("����.");
		}
		
		if(com == 0 && me == 1) {
			System.out.println("���� �̰��.");
		}
		if(com == 1 && me == 2) {
			System.out.println("���� �̰��.");
		}
		if(com == 2 && me == 0) {
			System.out.println("���� �̰��.");
		}
		
		if(com == 0 && me == 2) {
			System.out.println("���� ����.");
		}
		if(com == 1 && me == 0) {
			System.out.println("���� ����.");
		}
		if(com == 2 && me == 1) {
			System.out.println("���� ����.");
		}


		System.out.println("me = " + me + "    com = " + com);
		
		
	}
}
