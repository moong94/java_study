package array;

import java.util.Scanner;

public class ArrayEx14 {

	public static void main(String[] args) {
		/*
		 * # �����̵�[1�ܰ�]
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
		 */

		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;
		
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;
			}
			System.out.print(game[i] + " ");
		}
		System.out.println();
		
		boolean opt = true;
		
		while(opt) {
			System.out.println("���� 1 �Է½� �� ������, ���� 2 �Է½� ���� ������ �̵�.");
			int sel = scan.nextInt();
			
			
			if(sel == 1) {
				if(player == 0) {
					System.out.println("�� �ʿ� ���� �־� ������ �� �����ϴ�.");
					continue;
				}
				else {
					game[player] = 0;
					player -= 1;
					game[player] = 2;
				}
			}
			else if (sel == 2) {
				if(player == 6) {
					System.out.println("���� �ʿ� ���� �־� ������ �� �����ϴ�.");
					continue;
				}

				game[player] = 0;
				player += 1;
				game[player] = 2;
			}
			
			else {
				System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���.");
				continue;
			}
			
			
			
			for(int i = 0; i < 7; i++) {
				System.out.print(game[i] + " ");
			}
			
		}

	}

}
