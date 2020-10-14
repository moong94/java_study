package file;

import java.util.Scanner;

public class File_�����̵��ǰ��� {

	public static void main(String[] args) {
		int game[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,0}
				};
		int yx [][] = new int[10000][2];
		//����1) 0 �� �÷��̾��̴� 
		// 1) left 2)right 3)up 4)down 5)�ǰ���
		//��ȣ�� �Է¹ް� �ش���ġ�� �̵� ==> �̵��Ҷ� ���� ���� ��ȯ�Ѵ�. 
		// ��) 1 ==> 
		/*
		    {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,0,15}		
		 */
		
		//����2) ��ȭ  ==> ��ĭ��ĭ�̵��Ҷ����� yx �� �迭�� �̵��Ѱ�θ� �����ߴٰ� 
		// 5���Է½� ==> �Դ���� �ǵ��ư��� �Ѵ�. 
		
		int p_x = 3;
		int p_y = 3;
		int count = 0;
		
		int y = -1;
		int x = -1;
		
		yx[0][0] = 3;
		yx[0][1] = 3;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			y = p_y;
			x = p_x;
			
			for(int i = 0; i < game.length; i++) {
				for(int j = 0; j < game[i].length; j++) {
					System.out.print(game[i][j] + "\t");
				}
				System.out.println();
			}
			
			
			System.out.println("1) left 2)right 3)up 4)down 5)�ǰ���");
			System.out.print("�Է� : ");
			int input = scan.nextInt();
			
			
			//left
			if(input == 1) {
				x--;
				count++;
			}
			
			//right
			else if(input == 2) {
				x++;
				count++;
			}
			
			//up
			else if(input == 3) {
				y--;
				count++;
			}
			
			//down
			else if(input == 4) {
				y++;
				count++;
			}
			
			//�ǰ���
			else if(input == 5) {
				if(count == 0) {
					System.out.println("�̵��� ����� �����ϴ�.");
					continue;
				}
				else {
					int tmp = game[yx[count - 1][0]][yx[count - 1][1]];
					game[yx[count][0]][yx[count][1]] = tmp;
					game[yx[count - 1][0]][yx[count - 1][1]] = 0;
					count--;
					
					p_y = yx[count][0];
					p_x = yx[count][1];
					
					continue;
				}
				
			}
			
			if(x < 0 || x > 3 || y < 0 || y > 3) {
				System.out.println("�̵� �Ұ�.");
				y = p_y;
				x = p_x;
				count--;
				continue;
			}
			
			int tmp = game[y][x];
			game[p_y][p_x] = tmp;
			game[y][x] = 0;
			
			yx[count][0] = y;
			yx[count][1] = x;
			
			p_y = y;
			p_x = x;
			
			
		}
	}

}
