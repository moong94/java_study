package array;

import java.util.Scanner;

public class ArrayEx43 {

	public static void main(String[] args) {
		/*
		 * # ��ٸ� ����
		 * 1. 0�� ������ �Ʒ��� ��������.
		 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
		 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.
		 * 		x = 0	x = 4
		 * 		x = 1	x = 2
		 * 		x = 2	x = 1
		 * 		x = 3	x = 3
		 * 		x = 4	x = 0
		 */
		
		
		int ladder[][]= {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}};
		
		//��ٸ��׸���
		for(int i = 0; i < ladder.length; i++) {
			for(int j = 0; j < ladder[i].length; j++) {
				if(ladder[i][j] == 0) {
					System.out.print("��");
				}
				else if(ladder[i][j] == 1) {
					if(j == 0) {
						System.out.print("��");
					}
					else if(j == ladder[i].length) {
						System.out.print("��");
					}
					else if(ladder[i][j - 1] == 1) {
						System.out.print("��");
					}
					else if(ladder[i][j + 1] == 1) {
						System.out.print("��");
					}
				}
			}
			System.out.println();
		}
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x �Է� : ");
		int input = scan.nextInt();
		
		for(int i = 0; i < ladder.length; i++) {
			for(int j = 0; j < ladder[i].length; j++) {
				if(ladder[i][input] == 0) {
					break;
				}
				else if(ladder[i][input] == 1) {
					
					//���� ���� ���� ��
					if(input == 0) {
						input++;
					}
					//������ ���� ���� ��
					else if(input == ladder[i].length) {
						input--;
					}
					
					//�¿� ���ؼ� 1�� �ִ� ������ �̵� 
					else if(ladder[i][input - 1] == 1) {
						input--;
					}
					else if(ladder[i][input + 1] == 1) {
						input++;
					}
					
				}
			}
		}
		
		System.out.println("������ : " + input);
		
	}

}
