package iff;

import java.util.Random;
import java.util.Scanner;

public class IfEx14 {

	public static void main(String[] args) {
		/*
		 * # ����(0)����(1)��(2) ����[2�ܰ�]
		 * # ���������� ����[2�ܰ�]��
		 *   if - else if �������� �����غ���.
		 */
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		
		System.out.println("0~2 ������ ���� �Է� : ");
		int me = scan.nextInt();
		
		if(me == com) {
			System.out.println("����.");
		}
		else if(me == 2 && com == 0) {
			System.out.println("���� ����.");
		}
		else if(me == 0 && com == 2) {
			System.out.println("���� �̰��.");
		}
		else if(me > com) {
			System.out.println("���� �̰��.");
		}
		else {
			System.out.println("���� ����.");
		}
	}
}
