package iff;

import java.util.Random;
import java.util.Scanner;

public class IfEx19 {

	public static void main(String[] args) {
		/*
		 * # ������ ��ȣ ���߱� ����
		 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
		 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
		 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
		 * 	  1) ����	  2)  �E��     3) ����	 4) ������
		 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
		 * ��) 3 ? 4  = 7
		 *    1) + 2) - 3) * 4) %
		 *    ���� : 2��
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int num1 = ran.nextInt(10) + 1;
		int num2 = ran.nextInt(10) + 1;
		int op = ran.nextInt(4) + 1;
		
		if(op == 1) {
			System.out.println(num1 + " ? " + num2 + " = " + (num1 + num2));
			System.out.println("1) + 2) - 3) * 4) %");
			System.out.println("���� : ");
			int ans = scan.nextInt();
			if(ans == op) {
				System.out.println("����");
			}
			else {
				System.out.println("����");
			}
				
		}
		if(op == 2) {
			System.out.println(num1 + " ? " + num2 + " = " + (num1 - num2));
			System.out.println("1) + 2) - 3) * 4) %");
			System.out.println("���� : ");
			int ans = scan.nextInt();
			if(ans == op) {
				System.out.println("����");
			}
			else {
				System.out.println("����");
			}
				
		}
		if(op == 3) {
			System.out.println(num1 + " ? " + num2 + " = " + (num1 * num2));
			System.out.println("1) + 2) - 3) * 4) %");
			System.out.println("���� : ");
			int ans = scan.nextInt();
			if(ans == op) {
				System.out.println("����");
			}
			else {
				System.out.println("����");
			}
				
		}
		if(op == 4) {
			System.out.println(num1 + " ? " + num2 + " = " +(num1 % num2));
			System.out.println("1) + 2) - 3) * 4) %");
			System.out.println("���� : ");
			int ans = scan.nextInt();
			if(ans == op) {
				System.out.println("����");
			}
			else {
				System.out.println("����");
			}
				
		}
	}

}
