package whileex;

import java.util.Scanner;

public class WhileEx09 {

	public static void main(String[] args) {
		/*
		 * # ATM[2�ܰ�]
		 * 1. �Ա�
		 * . �Ա��� �ݾ��� �Է¹޾�, myMoney�� �Ա�
		 * 2. ���
		 * . ����� �ݾ��� �Է¹޾�, myMoney���� ���
		 * . ��, ����� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ݺҰ�
		 * 3. ��ü
		 * . yourAcc ���¹�ȣ�� �Է¹޾�, ��ü
		 * . ��ü�� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ü �Ұ�
		 * . ��ü �� yourMoney �ܾ� ����
		 * 4. ��ȸ
		 * . myMoney�� yourMoney �ܾ� ��� ���
		 */
			
			Scanner scan = new Scanner(System.in);
			
			int myAcc = 1111;
			int myMoney = 50000;
		
			int yourAcc = 2222;
			int yourMoney = 70000;	
			
			boolean run = true;
			while(run) {
					
				System.out.println("1.�Ա�");
				System.out.println("2.���");
				System.out.println("3.��ü");
				System.out.println("4.��ȸ");
				System.out.println("0.����");
				
				System.out.print("�޴� ���� : ");
				int sel = scan.nextInt();
					
				//�Ա�
				if(sel == 1) {
					System.out.print("�Ա� �ݾ� �Է� : ");
					int addMoney = scan.nextInt();
					myMoney += addMoney;
					System.out.println("�ܾ� : " + myMoney);
				}
				
				//���
				else if(sel == 2) {
					System.out.print("��� �ݾ� �Է� : ");
					int subMoney = scan.nextInt();
					if(subMoney > myMoney) {
						System.out.println("��� �Ұ�.");
					}
					else {
						myMoney -= subMoney;
						System.out.println("�ܾ� : " + myMoney);
					}
				}
				
				//��ü
				else if(sel == 3) {
					System.out.print("��ü ���� �Է� : ");
					int inputAcc = scan.nextInt();
					if(inputAcc != yourAcc) {
						System.out.println("���� �Է� ����");
					}
					else {
						System.out.print("��ü �ݾ� �Է� : ");
						int payMoney = scan.nextInt();
						if(payMoney > myMoney) {
							System.out.println("��ü �Ұ�.");
						}
						else {
							yourMoney += payMoney;
							myMoney -= payMoney;
							System.out.println("�ܾ� : " + myMoney);
						}
					}
					
				}
				
				//��ȸ
				else if(sel == 4) {
					System.out.println("myMoney : " + myMoney);
					System.out.println("yourMoney : " + yourMoney);
				}
				
				//���α׷� ����
				else if(sel == 0) {
					run = false;
					System.out.println("���α׷� ����");
			}
		}
	}
}
