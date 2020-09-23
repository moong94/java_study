package array;

import java.util.Scanner;

public class ArrayEx32 {

	public static void main(String[] args) {
		/*
		 * # ATM[4�ܰ�] : ��ü ��ɱ���
		 * 1. ȸ������
		 * . id�� pw�� �Է¹޾� ����
		 * . ���� �� �� 1000�� �ο�
		 * . id �ߺ�üũ
		 * 2. ȸ��Ż��
		 * . �α��νÿ��� �̿밡��
		 * 3. �α���
		 * . id�� pw�� �Է¹޾� �α���
		 * . �α׾ƿ� ���¿����� �̿밡��
		 * 4. �α׾ƿ�
		 * . �α��νÿ��� �̿밡��
		 * 5. �Ա�
		 * . �α��νÿ��� �̿밡��
		 * 6. ��ü
		 * . �α��νÿ��� �̿밡��
		 * 7. �ܾ���ȸ
		 * . �α��νÿ��� �̿밡��
		 */
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int count = 0;
		int log = -1;		//-1:�α׾ƿ�, 0~5: ���� �α���
		
		String menu = "=== �ް�IT ATM ===\n";
		menu += "1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n";
		menu += "5.�Ա�\n6.��ü\n7.�ܾ���ȸ\n0.����";
		
		while(true) {
			
			for(int i = 0; i < MAX; i++) {
				System.out.print(arId[i] + " ");
			}
			System.out.println();
			for(int i = 0; i < MAX; i++) {
				System.out.print(arPw[i] + " ");
			}
			
			System.out.println(menu);
			System.out.print("�Է� : ");
			int sel = scan.nextInt();
			
			//ȸ������
			if(sel == 1) {
				int check = 1;
				if(count == 5) {
					System.out.println("�� �̻� ���� �� �� �����ϴ�.");
					continue;
				}
				System.out.print("���� ID �Է� : ");
				int id = scan.nextInt();
				
				for(int i = 0; i < MAX; i++) {
					if(id == arId[i]) {					
						check = -1;
					}
				}
				if(check == -1) {
					System.out.println("�̹� ��� �� ID�Դϴ�.");
				}
				else {
					System.out.println("������ ��й�ȣ �Է� : ");
					int pw = scan.nextInt();
						
					arId[count] = id;
					arPw[count] = pw;
					arMoney[count] = 1000;
					count++;
				}	
			}
			
			//ȸ��Ż��
			else if(sel == 2) {
				if(log != -1) {
					System.out.println("ȸ��Ż���Ͻðڽ��ϱ�? (1)��, (2)�ƴϿ�");
					int yn = scan.nextInt();
					
					if(yn == 1) {
						arId[log] = 0;
						arPw[log] = 0;
						for(int i = log; i < MAX - 1; i++) {
							arId[i] = arId[i + 1];
							arPw[i] = arPw[i + 1];
						}
						arId[4] = 0;
						arPw[4] = 0;
						count--;
						log = -1;
					}
					else if(yn == 2) {
						continue;
					}
				}
				else {
					System.out.println("�α��� �� �̿����ּ���.");
					
				}
				
			}
			
			//�α���
			else if(sel == 3) {
				
				int cnt = 0;
				
				if(log != -1) {
					System.out.println("�α׾ƿ� �� �̿��ϼ���.");
				}
				else {
				System.out.print("�α��� ID �Է� : ");
				int logId = scan.nextInt();
				for(int i = 0; i < MAX; i++) {
					if(logId == arId[i]) {
						System.out.print("��й�ȣ �Է� : ");
						int logPw = scan.nextInt();
						
						if(logPw == arPw[i]) {
							log = i;	
							break;
						}
						else {
							System.out.println("��й�ȣ �Է� ����");
							break;
						}
					}
					else if(cnt == 4){
						System.out.println("�������� �ʴ� ID�Դϴ�.");
						continue;
					}
					cnt++;
				}
				}
			}
			
			//�α׾ƿ�
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("�α��� �� �̿����ּ���.");
				}
				else {
					System.out.println("�α׾ƿ� �Ͻðڽ��ϱ�? (1)��, (2)�ƴϿ�");
					int yn = scan.nextInt();
					
					if(yn == 1) {
						log = -1;
						
					}
					else if(yn == 2) {
						
					}
					
				}
				
			}
			
			//�Ա�
			else if(sel == 5) {
				if(log == -1) {
					System.out.println("�α��� �� �̿����ּ���.");
				}
				else {
					System.out.print("�Ա� �ݾ� �Է� : ");
					int insert = scan.nextInt();
					
					arMoney[log] += insert;
				}
				
			}
			
			//��ü
			else if(sel == 6) {
				if(log == -1) {
					System.out.println("�α��� �� �̿����ּ���.");
				}
				else {
					System.out.print("��ü�� ID �Է� : ");
					int acId = scan.nextInt();
					
					for(int i = 0; i < MAX; i++) {
						if(acId == arId[log]) {
							System.out.println("�ڽſ��Դ� ��ü�� �� �����ϴ�.");
							break;
						}
						else if(acId == arId[i]) {
							System.out.println("��ü �ݾ� �Է� : ");
							int acMoney = scan.nextInt();
							
							if(arMoney[log] < acMoney) {
								System.out.println("�ܰ� �����մϴ�.");
								break;
							}
							else {
								arMoney[log] -= acMoney;
								arMoney[i] += acMoney;
								break;
							}
						}
					}
				}
			}
			
			//�ܾ���ȸ
			else if(sel == 7) {
				if(log == -1) {
					System.out.println("�α��� �� �̿����ּ���.");
					continue;
				}
				else {
					System.out.println("�ܾ� : " + arMoney[log]);
					continue;
				}
				
			}
			
			//����
			else if(sel == 0) {
				break;
			}
		}


	}

}
