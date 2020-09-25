package array;

import java.util.Scanner;

public class ArrayEx45 {

	public static void main(String[] args) {
		/*
		 * # ���θ� [��ٱ���]
		 * 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
		 * 	1) ���
		 *  2) �ٳ���
		 *  3) ����
		 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
		 * 3. �α��� ȸ���� �ε��� ��ȣ�� �� ���� ù��° ���� �����Ѵ�.
		 * 4. �ش� ȸ���� ������ ��ǰ�� �ε��� ��ȣ�� �� ���� �ι�° ���� �����Ѵ�.
		 * ��)
		 * {
		 * 		{0, 1},				qwerȸ�� 			> �������
		 * 		{1, 2},				javakingȸ�� 		> �ٳ�������
		 * 		{2, 1},				abcdȸ��			> �������
		 * 		{0, 3},				qwerȸ��			> ���ⱸ��
		 * 		...
		 * }
		 */

		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		
		
		String[] items = {"���", "�ٳ���", "����"};
		
		int log = -1;
		
		while(true) {
			
			int error = 0;
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			//�α���
			if(sel == 1) {
				if(log == -1) {
					System.out.print("ȸ�� ID�Է� : ");
					String id = scan.next();
					
					for(int i = 0; i < ids.length; i++) {
						if(id.equals(ids[i])) {
							System.out.print("��й�ȣ �Է� : ");
							String pw = scan.next();
							
							if(pw.equals(pws[i])) {
								System.out.println("�α��� �Ǿ����ϴ�.");
								log = i;
							}
							else {
								System.out.println("��й�ȣ�� Ʋ���ϴ�.");
								continue;
							}
						}
						else {
							error++;
							if(error == ids.length) {
								System.out.println("�������� �ʴ� ID�Դϴ�.");
								continue;
							}
						}
					}
							
				}
				else {
					System.out.println("�α׾ƿ� �� �̿����ּ���.");
					continue;
				}
				
			}
			
			//�α׾ƿ�
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("�α��� �� �̿��ϼ���.");
					continue;
				}
				else {
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					log = -1;
					continue;
				}
			}
			
			//����
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("�α��� �� �̿��ϼ���.");
					continue;
				}
				else {
					for(int i = 0; i < items.length; i++) {
						System.out.println((i + 1) + ")" + items[i]);
					}
					System.out.print("������ ��ǰ ��ȣ �Է� : ");
					int purchase = scan.nextInt();
					if(purchase < 1 || purchase > 3) {
						System.out.println("�Է� ����");
						continue;
					}
					else {
						System.out.println(ids[log] + "ȸ��			> " + items[purchase - 1] + "����");
						jang[count][0] = log;
						jang[count][1] = purchase;
						count++;
					}
				}
			}
			
			//��ٱ���
			else if(sel == 4) {
				if(count == 0) {
					System.out.println("���� ������ �������� �ʽ��ϴ�.");
					continue;
				}
				System.out.println("==========��ٱ��� ���==========");
				for(int i = 0; i < count; i++) {
					System.out.println(ids[jang[i][0]] + "ȸ��			> " + items[jang[i][1] - 1] + "����");					
				}
				
			}
			
			//����
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}


	}

}
