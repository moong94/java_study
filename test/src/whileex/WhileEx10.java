package whileex;

import java.util.Scanner;

public class WhileEx10 {

	public static void main(String[] args) {
		/*
		 * # ATM[2�ܰ�]
		 * 1. �α���
		 * . �α��� �� �� �α��� �Ұ�
		 * . �α׾ƿ� ���¿����� �̿� ����
		 * 2. �α׾ƿ�
		 * . �α��� �� �̿밡��
		 * 3. �Ա�
		 * . �α��� �� �̿밡��
		 * 4. ���
		 * . �α��� �� �̿밡��
		 * 5. ��ü
		 * . �α��� �� �̿밡��
		 * 6. ��ȸ
		 * . �α��� �� �̿밡��
		 * 7. ����
		 */
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1;		// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			//�α���
			if(sel == 1) {
				if(log == -1) {
					System.out.print("���� �Է� : ");
					int id = scan.nextInt();
					if(id == dbAcc1) {
						System.out.print("��й�ȣ �Է� : ");
						int pw = scan.nextInt();
						if(pw == dbPw1) {
							System.out.println("�α��� �Ǿ����ϴ�.");
							log = 1;
						}
						else {
							System.out.println("��й�ȣ ����.");
						}
					}
					else if(id == dbAcc2) {
						System.out.print("��й�ȣ �Է� : ");
						int pw = scan.nextInt();
						if(pw == dbPw2) {
							System.out.println("�α��� �Ǿ����ϴ�.");
							log = 2;
						}
						else {
							System.out.println("��й�ȣ ����.");
						}
					}
					else {
						System.out.println("���� �Է� ����.");
					}
				}
				else {
					System.out.println("�α׾ƿ� �� �̿�.");
				}
			}
			
			
			//�α׾ƿ�
			else if(sel == 2) {
				if(log == 1 || log == 2) {
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					log = -1;
				}
				else {
					System.out.println("�α��� �� �̿�.");
				}
			}
			
			//�Ա� �α��� �� �̿밡��
			else if(sel == 3) {
				if(log == 1) {
					System.out.print("�Ա� �ݾ� �Է� : ");
					int addMoney1 = scan.nextInt();
					dbMoney1 += addMoney1;
				}
				else if(log == 2) {
					System.out.print("�Ա� �ݾ� �Է� : ");
					int addMoney2 = scan.nextInt();
					dbMoney2 += addMoney2;
				}
				else {
					System.out.println("�α��� �� �̿�.");
				}
			}
			
			//��� �α��� �� �̿밡��
			else if(sel == 4) {
				if(log == 1) {
					System.out.print("��� �ݾ� �Է� : ");
					int subMoney1 = scan.nextInt();
					if(subMoney1 > dbMoney1) {
						System.out.println("�ѵ��ʰ�.");
					}
					else {
						dbMoney1 -= subMoney1;
					}
				}
				else if(log == 2) {
					System.out.print("��� �ݾ� �Է� : ");
					int subMoney2 = scan.nextInt();
					if(subMoney2 > dbMoney2) {
						System.out.println("�ѵ��ʰ�.");
					}
					else {
						dbMoney2 -= subMoney2;
					}
				}
				else {
					System.out.println("�α��� �� �̿�.");
				}
			}
			
			//��ü �α��� �� �̿밡��
			else if(sel == 5) {
				if(log == 1) {
					System.out.print("��ü ���� �Է� : ");
					int inputAcc = scan.nextInt();
					if(inputAcc == dbAcc2) {
						System.out.println("��ü �ݾ� �Է� : ");
						int sendMoney1 = scan.nextInt();
						
						if(sendMoney1 > dbMoney1) {
							System.out.println("�ѵ� �ʰ�.");
						}
						else {
							dbMoney1 -= sendMoney1;
							dbMoney2 += sendMoney1;
						}
					}
					else {
						System.out.println("���� �Է� ����.");
					}
				}
				if(log == 2) {
					System.out.print("��ü ���� �Է� : ");
					int inputAcc = scan.nextInt();
					if(inputAcc == dbAcc1) {
						System.out.println("��ü �ݾ� �Է� : ");
						int sendMoney2 = scan.nextInt();
						
						if(sendMoney2 > dbMoney2) {
							System.out.println("�ѵ� �ʰ�.");
						}
						else {
							dbMoney2 -= sendMoney2;
							dbMoney1 += sendMoney2;
						}
					}
					else {
						System.out.println("���� �Է� ����.");
					}
				}
				else {
					System.out.println("�α��� �� �̿�.");
				}
			}
			
			//��ȸ �α��� �� �̿밡��
			else if(sel == 6) {
				if(log == 1) {
					System.out.println("�ܰ� : " + dbMoney1);
				}
				else if(log == 2) {
					System.out.println("�ܰ� : " + dbMoney2);
				}
				else {
					System.out.println("�α��� �� �̿�.");
				}
			}
			
			//����
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}

	}

}
