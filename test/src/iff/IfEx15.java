package iff;

import java.util.Scanner;

public class IfEx15 {

	public static void main(String[] args) {
		/*
		 * # ATM[1�ܰ�] : ��ü�ϱ�
		 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
		 * 2. ���¹�ȣ�� ��ġ�ϸ�,
		 * 3. ��ü�� �ݾ��� �Է¹޴´�.
		 * 4. ��ü�� �ݾ� <= myMoney	: ��ü����
		 * 			myMoney   - ��ü�� �ݾ�
		 * 			yourMoney + ��ü�� �ݾ�
		 *    ��ü�� �ݾ�  > myMoney 	: ��ü�Ұ�
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "��");
		System.out.println("yourMoney = " + yourMoney + "��");
		
		System.out.println("��ü�� ���¹�ȣ �Է� : ");
		int inputAcc = scan.nextInt();

			if(inputAcc == myAcc) {
				System.out.println("��ü�� �ݾ� �Է� : ");
				int inputMoney = scan.nextInt();
				
				if(inputMoney <= myMoney) {
					System.out.println("��ü ����");
					System.out.println("myMoney - " + inputMoney);
					System.out.println("yourMoney - " + inputMoney);
					System.out.println("myMoney : " + (myMoney - inputMoney));
					System.out.println("yourMoney : " + (yourMoney + inputMoney));
				}
				else {
					System.out.println("��ü �Ұ�");
				}
			}
		
		else {
			System.out.println("���¹�ȣ �Է� ����.");
		}

	}

}
