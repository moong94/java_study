package iff;

import java.util.Scanner;

public class IfEx18 {

	public static void main(String[] args) {
		/*
		 * # ����ö ��� ���
		 * 1. �̿��� ������ ���� �Է¹޴´�.
		 * 2. ������ ���� ������ ���� ���� ����� ����ȴ�.
		 * 3. ���ǥ
		 * 1) 1~5	: 500��
		 * 2) 6~10	: 600��
		 * 3) 11,12 : 650�� (10���������Ĵ� 2�����帶�� 50���߰�)
		 * 4) 13,14 : 700�� (10���������Ĵ� 2�����帶�� 50���߰�)
		 * 5) 15,16 : 750�� (10���������Ĵ� 2�����帶�� 50���߰�)
		 * ... 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̿��� ������ �� �Է� : ");
		int num = scan.nextInt();
		
		int defcharge = 500;
		
		if(num >= 1 && num <= 5) {
			System.out.println(defcharge + "��");
		}
		else if(num <= 10) {
			System.out.println((defcharge+100) + "��");	
		}
		else {
			int extra = (num - 11) / 2 + 1;
			System.out.println((defcharge + 100 + (50 * extra)) + "��");
		}
		
	}

}
