package array;

import java.util.Scanner;

public class ArrayEx09 {

	public static void main(String[] args) {
		/*
		 * # ��ȭ�� �¼�����
		 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
		 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
		 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
		 * 4. �� �¼��� ���� ������ 12000���̴�.
		 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
		 * ��)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * �¼����� : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
		 * ----------------------
		 * ����� : 24000��
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int[] seat = new int[7];
		
		int cnt = 0;
		
		boolean run = true;
		while(run) {
			System.out.println("=�ް� ��ȭ��=");
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			
			//�޴� ����
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			//1.�¼� ����
			if(sel == 1) {
				System.out.print("seat = ");
				for(int i = 0; i < 7; i++) {
					System.out.print(seat[i] + " ");
				}
				
				System.out.println();
				System.out.print("�¼� ���� : ");
				int choice = scan.nextInt();
				if(choice < 0 || choice > 6) {
					System.out.println("���� �¼� �Դϴ�.");
					continue;
				}

				if(seat[choice] == 0) {
					seat[choice] = 1;
				}

				else if(seat[choice] == 1) {
					System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
				}
				
				System.out.print("seat = ");
				for(int i = 0; i < 7; i++) {
					System.out.print(seat[i] + " ");
			}
				System.out.println();
			
		}
			
			//2.����
			else if(sel == 2) {
				run = false;
				for(int k = 0; k < 7; k++) {
					if(seat[k] == 1) {
						cnt++;
					}
					
				}
				System.out.print("�� �ݾ� :" + (12000 * cnt) + "��");
			}
			else {
				System.out.println("�ٽ� �Է�");
				continue;
			}
		}


	}

}
