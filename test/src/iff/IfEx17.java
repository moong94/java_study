package iff;

import java.util.Random;

public class IfEx17 {

	public static void main(String[] args) {
		/*
		 * # 369����[1�ܰ�]
		 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
		 * 2. �� ���� 369�� ������
		 * 	1) 2���̸�, ¦¦�� ���
		 *  2) 1���̸�, ¦�� ���
		 *  3) 0���̸�, �ش� ���ڸ� ���
		 * ��)
		 * 		33	 : ¦¦
		 * 		16	 : ¦
		 * 		 7	 : 7
		 */

		Random ran = new Random();
		
		int num = ran.nextInt(50) + 1;
		int denum = num / 10;
		int initnum = num % 10;
		
		System.out.println(num);
		
		if((denum != 0 && denum % 3 ==0) && (initnum != 0 && initnum % 3 == 0)) {
			System.out.println(num + "  :  ¦¦");
		}
		else if((denum != 0 && denum % 3 ==0) || (initnum != 0 && initnum % 3 == 0)) {
			System.out.println(num + "  :  ¦");
		}
		else {
			System.out.println(num + "  :  " + num);
		}
		
	}

}
