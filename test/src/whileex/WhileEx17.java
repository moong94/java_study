package whileex;

import java.util.Scanner;

public class WhileEx17 {

	public static void main(String[] args) {
		/*
		 * # ���θ� �ڷΰ���
		 * 1. �����Ƿ�
		 * 		1) Ƽ����
		 * 		2) ����
		 * 		3) �ڷΰ���
		 * 2. �����Ƿ�
		 * 		1) �����
		 * 		2) ġ��
		 * 		3) �ڷΰ���
		 * 3. ����
		 */

		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				boolean exit = true;
				while(exit) {
					System.out.println("1)Ƽ����");
					System.out.println("2)����");
					System.out.println("3)�ڷΰ���");
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice == 3) {
						exit = false;
					}
				}
			}
			else if(sel == 2) {
				boolean exit = true;
				while(exit) {
					System.out.println("1)�����");
					System.out.println("2)ġ��");
					System.out.println("3)�ڷΰ���");
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice == 3) {
						exit = false;
					}
				}
			}
			else if(sel == 3) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}

	}

}
