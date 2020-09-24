package array;

import java.util.Scanner;

public class ArrayEx36 {

	public static void main(String[] args) {
		/*
		 * # �迭 ��Ʈ�ѷ�[2�ܰ�] : ����(Vector)
		 * 1. �߰�
		 * . ���� �Է¹޾� ���������� �߰�
		 * 2. ����(�ε���)
		 * . �ε����� �Է¹޾� �ش� ��ġ�� �� ����
		 * 3. ����(��)
		 * . ���� �Է¹޾� ����
		 * . ���� �� �Է� �� ����ó��
		 * 4. ����
		 * . �ε����� ���� �Է¹޾� ����
		 */
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int count = 0;
		
		while(true) {
			
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰�");
			System.out.println("[2]����(�ε���)");
			System.out.println("[3]����(��)");
			System.out.println("[4]����");
			System.out.println("[0]����");
			
			for(int i = 0; i < count; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println();
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			//�迭�� ���� �Է¹޾� ���������� �߰�
			if(sel == 1) {
				if(count == 0) {
					score = new int[count +  1];
				}
				else if(count > 0) {
					int[] tmp = score;
					score = new int[count + 1];
					
					for(int i = 0; i < count; i++) {
						score[i] = tmp[i];
					}
					
					tmp = null;
				}
				
				System.out.print("�߰��� �� �Է� : ");
				int inputnum = scan.nextInt();
				score[count] = inputnum;
				count++;
			}
			
			//�ε����� �Է¹޾� �ش� ��ġ�� �� ����
			else if(sel == 2) {
				if(count == 0) {
					System.out.println("�迭�� ���� �����ϴ�.");
					continue;
				}
				
				System.out.print("������ ���� �ε��� �Է� : ");
				int delidx = scan.nextInt();
				
				if(delidx < 0 || delidx > count - 1) {
					System.out.println("���� �������� �ʴ� �ε����Դϴ�.");
					continue;
				}
				else {
					if(count == 1) {
						score = null;
					}
					else if(count >= 1) {
						int[] tmp = score;
						score = new int[count - 1];
						for(int i = 0; i < delidx; i++) {
							score[i] = tmp[i];
						}
						for(int i = delidx + 1; i < count; i++) {
							score[i - 1] = tmp[i];
						}
						tmp = null;
					}
					count--;
				}
			}
			
			//���� �Է¹޾� ���� (���� �� �Է½� ���� ó��)
			else if(sel == 3) {
				int exc = -1;
				
				if(count == 0) {
					System.out.println("�迭�� ���� �����ϴ�.");
					continue;
				}
				
				System.out.print("������  �� �Է� : ");
				int delval = scan.nextInt();
				
				for(int i = 0; i < count; i++) {
					if(delval == score[i]) {
						exc = i;
					}
				}
				if(exc == -1) {
					System.out.println("�Է��� ���� �������� �ʽ��ϴ�.");
					continue;
				}
				
				else {
					if(count == 1) {
						score = null;
					}
					else if (count > 1) {
						int[] tmp = score;
						score = new int[count - 1];
						
						for(int i = 0; i < exc; i++) {
							score[i] = tmp[i];
						}
						for(int i = exc + 1; i < count; i++) {
							score[i - 1] = tmp[i];
						}
					}
				}
				count--;
			}
			
			//�ε����� ���� �Է¹޾� ����
			else if(sel == 4) {
				System.out.print("�߰���ų ���� �ε��� �Է� : ");
				int insertidx = scan.nextInt();
				
				if(insertidx < 0 || insertidx > count - 1) {
					System.out.println("�������� �ε����Դϴ�.");
					continue;
				}
				else {
					System.out.print("������ �� �Է� : ");
					int insertval = scan.nextInt();
					
					if(count == 0) {
						score = new int[count + 1];
					}
					else if(count > 0) {
						int[] tmp = score;
						score = new int[count + 1];
						
						for(int i = 0; i < insertidx; i++) {
							score[i] = tmp[i];
						}
						score[insertidx] = insertval;
						
						for(int i = insertidx + 1; i < count + 1; i++) {
							score[i] = tmp[i - 1];
						}
						
						tmp = null;
					}
					count++;
				}
				
			}
			
			//����
			else if(sel == 0) {
				break;
			}
		}
	}
}
