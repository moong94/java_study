package array;

import java.util.Scanner;

public class ArrayEx26 {

	public static void main(String[] args) {
		/*
		 * # �����̵�[2�ܰ�]
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
		 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
		 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
		 */

		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		int player = 4;
		
		while(true) {
			for(int i = 0; i < 8; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();
			System.out.println("(1):����          (2):������          (3):�� ����");
			System.out.print("Ŀ�ǵ� �Է� : ");
			int command = scan.nextInt();
			
			
			if(command == 1) {
				player--;
				if(player == -1) {
					System.out.println("�� �̻� �������� �� �� �����ϴ�.");
					player++;
					continue;
				}
				if(game[player] == 1) {
					System.out.println("���� �־� �̵��� �� �����ϴ�.");
					player++;
				}
				game[player + 1] = 0;
				game[player] = 2;
				
				
			}
			else if(command == 2) {
				player++;
				if(player == 8) {
					System.out.println("�� �̻� ���������� �� �� �����ϴ�.");
					player--;
					continue;
				}
				if(game[player] == 1) {
					System.out.println("���� �־� �̵��� �� �����ϴ�.");
					player--;
				}
				game[player - 1] = 0;
				game[player] = 2;
				
				
			}
			else if(command == 3) {
				if(game[player + 1] == 1) {
					System.out.println("���� �����߽��ϴ�!");
					game[player + 1] = 0;
				}
				else if(game[player - 1] == 1) {
					System.out.println("���� �����߽��ϴ�!");
					game[player - 1] = 0;
				}
				else {
					System.out.println("������ ���� �����ϴ�.");
				}
			}
		}
		
	}

}
