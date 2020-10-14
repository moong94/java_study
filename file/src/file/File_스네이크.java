package file;

import java.util.Scanner;
import java.util.Random;

public class File_스네이크 {

	public static void main(String[] args) {
		/*
		 * # 스네이크 게임
		 * 1. 10x10 배열을 0으로 채운다.
		 * 2. 스네이크는 1234로 표시한다.
		 * 3. 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
		 * 4. 자기몸하고 부딪히면, 사망한다.
		 * 5. 랜덤으로 아이템을 생성해
		 *    아이템을 먹으면 꼬리 1개가 자란다.
		 * 6. 꼬리는 최대 8개까지 증가할 수 있다.
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
					System.out.println("벽에 닿아 죽었습니다.");
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
					System.out.println("벽에 닿아 죽었습니다.");
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
					System.out.println("벽에 닿아 죽었습니다.");
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
					System.out.println("벽에 닿아 죽었습니다.");
					break;
				}
				else {
					x[0] = tmp_x[0];
					y[0] = tmp_y[0] + 1;
					
				}
			}
			else {
				System.out.println("입력오류");
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
				System.out.println("몸에 닿아 죽었습니다.");
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
