package iff;

import java.util.Random;
import java.util.Scanner;

public class IfEx16 {

	public static void main(String[] args) {
		/*
		 * # ��� ���� ���߱� ����
		 * 1. 150~250 ������ ���� ���� ����
		 * 2. ���� ������ ��� ���ڸ� ���ߴ� �����̴�.
		 * ��)
		 * 		249		: 4
		 */
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ran.nextInt(101) + 150;
		
		int num2 = num / 10;
		int ans = num2 % 10;
		
		System.out.println("�Է� :");
		int myans = scan.nextInt();
		if (ans != myans) {
			System.out.println("����. �ٽ� �Է� :");
			myans = scan.nextInt();
		}
		else {
			System.out.println(num + "    :    " + myans);
		}
		
	}

}
