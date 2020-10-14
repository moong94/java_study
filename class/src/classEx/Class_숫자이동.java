package classEx;

import java.util.Scanner;

class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	int player = -1;
}

public class Class_�����̵� {

	public static void main(String[] args) {
		/*
		 * # �����̵�[3�ܰ�] : Ŭ���� + ����
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
		 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
		 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
		 * ��) 
		 *  0 0 0 0 0 0 0 2 
		 *  ����(1) ������(2) : 2
		 *  
		 *  2 0 0 0 0 0 0 0 
		 */
		
		Ex08 e = new Ex08();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			for(int i = 0 ; i < e.game.length; i++) {
				System.out.print(e.game[i] + " ");
				if(e.game[i] == 2) {
					e.player = i;
				}
			}
			System.out.println();
			
			System.out.print("����(1) ������(2) ����(3) : ");
			int input = scan.nextInt();
			
			if(input == 1) {
				if(e.player != 0) {
					if(e.game[e.player - 1] == 1) {
						System.out.println("���� �־� �������� �� �մϴ�.");
						continue;
					}
				}
				if(e.player == 0) {
					e.game[e.player] = 0;
					e.player = e.game.length - 1;
					e.game[e.player] = 2;
				}
				else {
					e.game[e.player] = 0;
					e.player--;
					e.game[e.player] = 2;
				}
				
			}
			
			else if(input == 2) {
				if(e.player != e.game.length - 1) {
					if(e.game[e.player + 1] == 1) {
						System.out.println("���� �־� �������� �� �մϴ�.");
						continue;
					}
				}
				if(e.player == e.game.length - 1) {
					e.game[e.player] = 0;
					e.player = 0;
					e.game[e.player] = 2;
				}
				else {
					e.game[e.player] = 0;
					e.player++;
					e.game[e.player] = 2;
				}
				
			}
			
			else if(input == 3) {
				if(e.player == 0) {
					if(e.game[e.player + 1] == 1) {
						e.game[e.player + 1] = 0;
					}
				}
				else if(e.player == e.game.length - 1) {
					if(e.game[e.player - 1] == 1) {
						e.game[e.player - 1] = 0;
					}
				}
				else {
					if(e.game[e.player - 1] == 1 || e.game[e.player + 1] == 1) {
						e.game[e.player - 1] = 0;
						e.game[e.player + 1] = 0;
					}
					
				}
				
			}
		
		}
		
	}

}
