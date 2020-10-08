package file;

import java.util.Scanner;

public class File_�ı����Ǳ� {

	public static void main(String[] args) {
		// �ı� ���Ǳ� ���α׷� 		
		// 1) ������   2) ����� 
		//������ ==> 1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���
		//����� ==> 1) ���� ==> ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ���� 	
	    //	       2)�ڷΰ���
		// ���� ) ��) �ܵ��� 7600���̴�. 5000������ ������ 1000��¥�� 7����� 
		//ȭ�� 
		// �ı� ���� : 3200�� 
		// �ı� 	  : ??��  (������ ����) 
		// 50000�� : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
		// 1000�� : ?? ��		//  500�� : ?? ��	  	//  100�� : ?? ��
		
		Scanner scan = new Scanner(System.in);
		
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// �ı� ����
		int price = 3200;		// �ı� ����
		
		while(true) {
			
			System.out.println("[1]������");
			System.out.println("[2]�����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(true) {
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("3)�ڷΰ���");
					
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					
					//�ı� ����
					if(choice == 1) {
						System.out.print("���� ���� �Է� : ");
						int inputticket = scan.nextInt();
						
						tickets += inputticket;
						System.out.println("���� �Ϸ�.");
						System.out.println("���� ���� Ƽ�� �� : " + tickets);
						
					}
					
					//�ܵ� ����
					else if(choice == 2) {
						System.out.print("���� �� �� �� �Է� : ");
						int input_money = scan.nextInt();
						
						int check = -1;
						for(int i = 0; i < money.length; i++) {
							
							if(input_money == money[i]) {
								check = i;
								break;
							}
						}
						if(check == -1) {
							System.out.println("(50000��, 10000��, 5000��, 1000��, 500��, 100�� �� �� ��� ����)");
							continue;
						}
						else {
							System.out.print("���� ���� �Է� : ");
							int input_charge = scan.nextInt();
							
							charges[check] += input_charge;
							
							System.out.println("====�ܰ� ��Ȳ====");
							for(int i = 0; i < money.length; i++) {
								System.out.print(money[i] + "��\t");
							}
							System.out.println();
							for(int i = 0; i < charges.length; i++) {
								System.out.print(charges[i] + "��\t");
							}
							System.out.println();
						}
						
					}
					
					//�ڷΰ���
					else if(choice == 3) {
						break;
					}
				}
				
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("1)����");
					System.out.println("2)�ڷΰ���");
					
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					
					//����
					if(choice == 1) {
						System.out.print("�Աݾ� �Է� : ");
						int input_money = scan.nextInt();
						
						System.out.print("������ �ı� ���� �Է� (�� �� 3200��) : ");
						int purchase_ticket = scan.nextInt();
						
						
						int sum = 3200 * purchase_ticket;
						
						if(sum > input_money) { 
							System.out.println("�Աݾ��� �����մϴ�.");
							continue;
						}
						
						int change = input_money - sum;
						
						if(purchase_ticket > tickets) {
							System.out.println("�ı��� " + tickets + "�� ���� �־� ���� �Ұ��մϴ�.");
							continue;
						}
						
						System.out.println("�ı��� " + purchase_ticket + "�� �����ϼ̽��ϴ�.");
						System.out.println("�ܵ� : " + change + "��");
						
						for(int i = 0; i < money.length; i++) {
							if((change / money[i]) != 0 && (change / money[i]) <= charges[i]) {
								System.out.println(money[i] + "�� �� " + (change / money[i]) + "��\t");
								charges[i] -= (change / money[i]);
								change %= money[i];
							}
						}
						
						
						
					}
					
					//�ڷΰ���
					else if(choice == 2) {
						break;
					}
				}
			}
		}
	}

}
