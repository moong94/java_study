package array;

import java.util.Scanner;

public class ArrayEx44 {

	public static void main(String[] args) {
		/*
		 * # ���θ� [������]
		 * 1. ī�װ��� �������� �Է¹޾� �Ʒ��� ���ÿ� ���� �����Ѵ�.
		 * 2. ī�װ��� �� ���� ù��° ���� �����Ѵ�.
		 * 3. �������� �� ���� �ι�° ���� �����Ѵ�.
		 *    ��, �������� �������� �߰��� �� �ֵ��� ������(/)�� �����ڷ� �������ش�.
		 * ��)
		 * {
		 * 		{"����", "���/����/"},
		 * 		{"����", "Ȩ����/�ɸ���/"},
		 * 		{"����", "�ݶ�/"},
		 * 		{"����", "�Ұ��/"}
		 * 		...
		 * } 
		 */

		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCount = 0;
		
		while(true) {

			System.out.println("[������ ���]");
			System.out.println("[1]ī�װ� ����");
			System.out.println("[2]�� �� ��  ����");
			System.out.println("[3]��üǰ�� ���");
			
			System.out.print(": ");
			int sel = scan.nextInt();
			
			//ī�װ� ����
			if(sel == 1) {
				System.out.print("����� ī�װ� �Է� : ");
				String category = scan.next();
				
				
				items[itemCount][0] = category;
				itemCount++;
				
				System.out.println(category + "��� �Ϸ�");
				
			}
			
			//������ ����
			else if(sel == 2) {
				
				for(int i = 0; i < items.length; i++) {
					if(i == itemCount) {
						break;
					}
					else {
						System.out.println((i + 1) + ". " + items[i][0]);
					}
				}
				
				System.out.print("�������� ����� ī�װ��� �����ϼ��� : ");
				int selcate = scan.nextInt();
				
				System.out.print("����� �������� �Է��ϼ��� : ");
				String inputitem = scan.next();
				
				items[selcate - 1][1] += (inputitem + "/");
				
			}
			
			//��üǰ�� ���
			else if(sel == 3) {
				for(int i = 0 ; i < items.length; i++) {
					if(i == itemCount) {
						break;
					}
					else {
						System.out.println("{\"" + items[i][0] + "\", \"" + items[i][1] + "\"}");
					}
				}
			}
			
		}
	}

}
