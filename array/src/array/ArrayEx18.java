package array;

import java.util.Scanner;

public class ArrayEx18 {

	public static void main(String[] args) {
		/*
		 * # 미니마블
		 * 1. 플레이어는 p1과 p2 2명이다.
		 * 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다.
		 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
		 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
		 * 4. 먼저 3바퀴를 돌면 이긴다.
		 *    
		 *  [p2]1~3 입력 : 1
		 *  1 2 3 4 5 6 7 8 
		 *  0 1 0 0 0 0 0 0 
		 *  0 0 0 2 0 0 0 0 
		 *  
		 *  [p1]1~3 입력 : 3
		 *  [p1]이 p2를 잡았다!
		 *  1 2 3 4 5 6 7 8 
		 *  0 0 0 0 1 0 0 0 
		 *  2 0 0 0 0 0 0 0 
		 */
		Scanner scan = new Scanner(System.in);
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turnp1 = 0;
		int turnp2 = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;		
		
		while(true) {
			System.out.print("[p1]1~3 입력 : ");
			int p1turn = scan.nextInt();
			
			if(p1turn < 1 || p1turn > 3) {
				System.out.println("1~3사이의 숫자만 입력해주세요");
				continue;
			}
			else {
				p1[idx1] = 0;
				idx1 += p1turn;
				if(idx1 > 7) {
					turnp1++;
					System.out.println("p1이 " + turnp1 + "바퀴 돌았다.");
					idx1 = 0;
					if(turnp1 == 3) {
						System.out.println("p1승리");
						break;
					}
				}
				p1[idx1] = 1;
			}
			
			if(idx1 == idx2) {
				System.out.println("p1이 p2를 잡았다.");
				p2[idx2] = 0;
				idx2 = 0;
				p2[idx2] = 2;
				
			}
			
			System.out.println("1 2 3 4 5 6 7 8");
			for(int i = 0; i < 8; i++) {
				System.out.print(p1[i] + " ");
			}
			System.out.println();
			for(int i = 0; i < 8; i++) {
				System.out.print(p2[i] + " ");
			}
			System.out.println();
			
			
			
			System.out.print("[p2]1~3 입력 : ");
			int p2turn = scan.nextInt();
			
			if(p2turn < 1 || p2turn > 3) {
				System.out.println("1~3사이의 숫자만 입력해주세요");
				continue;
			}
			else {
				p2[idx2] = 0;
				idx2 += p2turn;
				
				if(idx2 > 7) {
					turnp2++;
					System.out.println("p2가 " + turnp2 + "바퀴 돌았다.");
					idx2 = 0;
					if(turnp2 == 3) {
						System.out.println("p2승리");
						break;
					}
				}
				p2[idx2] = 2;
			}
			if(idx2 == idx1) {
				System.out.println("p2가 p1를 잡았다.");
				p1[idx1] = 0;
				idx1 = 0;
				p1[idx1] = 1;
			}
			
			System.out.println("1 2 3 4 5 6 7 8");
			for(int i = 0; i < 8; i++) {
				System.out.print(p1[i] + " ");
			}
			System.out.println();
			
			for(int i = 0; i < 8; i++) {
				System.out.print(p2[i] + " ");
			}
			System.out.println();
			
			
		}


	}

}
