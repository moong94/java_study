package array;

import java.util.Scanner;
import java.util.Random;

public class Sokoban {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		
		int[][] map = new int[SIZE][SIZE];
		
		int wallCount = 0;
		int pY = 0;
		int pX = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;
		
		// 벽 설치
		System.out.print(">>>설치할 벽의 개수를 입력하세요 : ");
		wallCount = scan.nextInt();
		
		int temp = wallCount;
		while(temp != 0) {
			int rY = ran.nextInt(SIZE);
			int rX = ran.nextInt(SIZE);
			
			if(map[rY][rX] == 0) {
				map[rY][rX] = WALL;
				temp = temp - 1;
			}
		}
		
		// 공 설치
		while(true) {
			int rY = ran.nextInt(SIZE - 2) + 1;
			int rX = ran.nextInt(SIZE - 2) + 1;
			
			if(map[rY][rX] == 0) {
				map[rY][rX] = BALL;
				ballY = rY;
				ballX = rX;
				break;
			}
		}
		
		// 골대 설치
		while(true) {
			int rY = ran.nextInt(SIZE);
			int rX = ran.nextInt(SIZE);
			
			if(map[rY][rX] == 0) {
				map[rY][rX] = GOAL;
				goalY = rY;
				goalX = rX;
				break;
			}
		}
		
		// 화면 출력
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		// 플레이어 배치
		while(true) {
			System.out.println(">>>플레이어의 위치를 선택하세요.");
			System.out.print("y좌표 입력 : ");
			pY = scan.nextInt();
			
			System.out.print("x좌표 입력 : ");
			pX = scan.nextInt();
			
			if(map[pY][pX] == 0) {
				map[pY][pX] = PLAYER;
				break;
			}
		}
		
		// 게임 시작
		while(true) {
			// 화면 출력
			System.out.println("---------------");
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(map[i][j] == PLAYER) {
						System.out.print("옷 ");
					}else if(map[i][j] == WALL) {
						System.out.print("벽 ");
					}else if(map[i][j] == GOAL) {
						System.out.print("골 ");
					}else if(map[i][j] == BALL) {
						System.out.print("공 ");
					}else {
						System.out.print(map[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println("---------------");
			
			// 골대에 공을 넣으면 게임 종료
			if(ballY == goalY && ballX == goalX) {
				System.out.println("게임종료");
				break;
			}
			
			System.out.print("상(1)하(2)좌(3)우(4) 입력 : ");
			int move = scan.nextInt();
		
			// 현재위치 저장하기
			int yy = pY;
			int xx = pX;
			
			if(move == 1) { yy = yy - 1; }
			else if(move == 2) { yy = yy + 1; }
			else if(move == 3) { xx = xx - 1; }
			else if(move == 4) { xx = xx + 1; }
			
			// 예외처리
			if(SIZE <= xx || xx < 0) continue;
			if(SIZE <= yy || yy < 0) continue;
			if(map[yy][xx] != 0 && map[yy][xx] != BALL) continue;
			
			// 공을 만나면
			if(map[yy][xx] == BALL) {
				int yyy = ballY;
				int xxx = ballX;
				if(move == 1) { yyy = yyy - 1; }
				else if(move == 2) { yyy = yyy + 1; }
				else if(move == 3) { xxx = xxx - 1; }
				else if(move == 4) { xxx = xxx + 1; }

				// 예외처리
				if(SIZE <= xxx || xxx < 0) continue;
				if(SIZE <= yyy || yyy < 0) continue;
				if(map[yyy][xxx] != 0 && map[yyy][xxx] != GOAL) continue;
				
				// 공 이동시키기
				map[ballY][ballX] = 0;
				ballY = yyy;
				ballX = xxx;
				map[ballY][ballX] = BALL;
			}
			
			// 캐릭터 이동시키기
			map[pY][pX] = 0;
			pY = yy;
			pX = xx;
			map[pY][pX] = PLAYER;
			
		}

	}

}
