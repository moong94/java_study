package file;

import java.util.Scanner;
import java.util.Random;

public class File_������ũ {

	public static void main(String[] args) {
		/*
		 * # ������ũ ����
		 * 1. 10x10 �迭�� 0���� ä���.
		 * 2. ������ũ�� 1234�� ǥ���Ѵ�.
		 * 3. �����¿�� �̵��� �����ϸ�, ������ ����´�.
		 * 4. �ڱ���ϰ� �ε�����, ����Ѵ�.
		 * 5. �������� �������� ������
		 *    �������� ������ ���� 1���� �ڶ���.
		 * 6. ������ �ִ� 8������ ������ �� �ִ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int size = 10;
		int[][] map = new int[size][size];
		
		int snakesize = 4;
		
		int itemcount = 0;
		
		int item = 9;
		
		int[] x = new int[snakesize];
		int[] y = new int[snakesize];
		int[] snake = new int[snakesize];
		
		for(int i=0; i<snakesize; i++) {
			x[i] = i;
			map[y[i]][x[i]] = i + 1;
			snake[i] = map[y[i]][x[i]];
			
		} 
		
		while(true) {
			
			
			System.out.println(y[0] + " " + x[0]);
			int tmp_x[] = new int[snakesize];
			
			int tmp_y[] = new int[snakesize];
			
			for(int i = 0; i < snakesize; i++) {
				tmp_x[i] = x[i];
				tmp_y[i] = y[i];
			}
			System.out.println(snakesize);

			x = new int[snakesize];
			y = new int[snakesize];
			snake = new int[snakesize];
			
			for(int i=0; i<snakesize - 1; i++) {
				x[i] = tmp_x[i];
				y[i] = tmp_y[i];
				snake[i] = map[y[i]][x[i]];
			}
			
			
			
			while(itemcount == 0) {
				if(snakesize == 8) {
					itemcount++;
					continue;
				}
				int ran_x = ran.nextInt(size);
				int ran_y = ran.nextInt(size);
				
				if(map[ran_y][ran_x] == 0 ) {
					map[ran_y][ran_x] = item;
					itemcount++;
				}
				
			}
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					if(map[i][j] == item) {
						System.out.print("I ");
					}
					else {
						System.out.print(map[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.print("1)left 2)right 3)up 4)down : ");
			int sel = scan.nextInt();
			
			//left
			if(sel == 1) {
				if(x[0] == 0) {
					System.out.println("���� ��� �׾����ϴ�.");
					break;
				}
				else {
					x[0] = tmp_x[0] - 1;
					y[0] = tmp_y[0];	
				}
				
			}
			
			//right
			else if(sel == 2) {
				if(x[0] == 9) {
					System.out.println("���� ��� �׾����ϴ�.");
					break;
				}
				else {
					x[0] = tmp_x[0] + 1;
					y[0] = tmp_y[0];
					
				}
				
			}
			
			//up
			else if(sel == 3) {
				if(y[0] == 0) {
					System.out.println("���� ��� �׾����ϴ�.");
					break;
				}
				else {
					x[0] = tmp_x[0];
					y[0] = tmp_y[0] - 1;
					
				}
				
			}
			
			//down
			else if(sel == 4) {
				if(y[0] == 9) {
					System.out.println("���� ��� �׾����ϴ�.");
					break;
				}
				else {
					x[0] = tmp_x[0];
					y[0] = tmp_y[0] + 1;
					
				}
			}
			else {
				System.out.println("�Է¿���");
				break;
			}
			
			
			for(int i = 1; i < snakesize; i++) {
				x[i] = tmp_x[i - 1];
				y[i] = tmp_y[i - 1];
				map[y[i]][x[i]] = i + 1;
				snake[i] = map[y[i]][x[i]];
			}
			
			if(map[y[0]][x[0]] == item) {
				int tmp_yy[] = new int[snakesize + 1];
				int tmp_xx[] = new int[snakesize + 1];
				
				int x_init = x[0];
				int y_init = y[0];
				
				
				for(int i = 0; i < snakesize; i++) {
					tmp_xx[i] = x[i];
					tmp_yy[i] = y[i];
				}
				
				map[tmp_y[snakesize - 1]][tmp_x[snakesize - 1]] = snakesize + 1;
				tmp_xx[snakesize] = tmp_x[snakesize - 1];
				tmp_yy[snakesize] = tmp_y[snakesize - 1];
				
				x = new int[snakesize + 1];
				y = new int[snakesize + 1];
				snake = new int[snakesize + 1];
				
				for(int i = 1; i < snakesize + 1; i++) {
					x[i] = tmp_xx[i];
					y[i] = tmp_yy[i];
					map[y[i]][x[i]] = i + 1;
					snake[i] = map[y[i]][x[i]];
				}
				x[0] = x_init;
				y[0] = y_init;
				
				map[y[0]][x[0]] = 1;
				snake[0] = 1;
				
				snakesize++;
				itemcount--;
				continue;
			}
			
			
			else if(map[y[0]][x[0]] != 0 && map[y[0]][x[0]] != item) {
				System.out.println("���� ��� �׾����ϴ�.");
				break;
			}
			else {
				map[tmp_y[snakesize - 1]][tmp_x[snakesize - 1]] = 0;
			}
			
			
			map[y[0]][x[0]] = 1;
			snake[0] = 1;
			
			
			
		}
	}

}
