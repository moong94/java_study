package whileex;

import java.util.Scanner;

public class WhileEx08 {

	public static void main(String[] args) {
		/*
		 * # ATM[2�ܰ�]
		 * 1. �α���
		 * . �α��� �� �� �α��� �Ұ�
		 * . �α׾ƿ� ���¿����� �̿� ����
		 * 2. �α׾ƿ�
		 * . �α��� �� �̿밡��
		 */

		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;			// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					System.out.print("Id �Է� : ");
					int logAcc = scan.nextInt();
					if(logAcc == dbAcc1) {
						System.out.print("Pw �Է� : ");
						int logPw = scan.nextInt();
						if(logPw == dbPw1) {
							System.out.println("�α���");
							log = 1;
						}
					}
					if(logAcc == dbAcc2) {
						System.out.print("Pw �Է� : ");
						int logPw = scan.nextInt();
						if(logPw == dbPw2) {
							System.out.println("�α���");
							log = 2;
						}
						
					}
				}
				else {
					System.out.println("�α׾ƿ� �� �̿�.");
				}
			}
			else if(sel == 2) {
				if(log == 1 || log == 2) {
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					log = -1;
				}
				else {
					System.out.println("�α��� �� �̿�.");
				}
			}
			
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}

	}

}
