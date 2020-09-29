package array;

import java.util.Scanner;
import java.util.Random;

public class Bingo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];
		
		int[] temp = new int[maxNum*maxNum];
		int size = 50;

		int win = 0;
		
		//�ߺ�����
		for(int i=0; i<temp.length; i++) {
			temp[i] = ran.nextInt(size) + 1;
			for(int j=0; j<i; j++) {
				if(temp[i] == temp[j]) {
					i -= 1;
				}
			}
		}
		
		//�ߺ����� ���� �迭
		int k = 0;
		for(int i=0; i<maxNum; i++) {
			for(int j=0; j<maxNum; j++) {
				bingo[i][j] = temp[k];
				k+=1;
			}
		}
		
		while(true) {
			System.out.println("=============== BINGO GAME ===============");
			System.out.print("\t");
			for(int i=0; i<maxNum; i++) {
				System.out.print(i + "\t");
			}
			System.out.println("\n");
			for(int i=0; i<maxNum; i++) {
				System.out.print(i + "\t");
				for(int j=0; j<maxNum; j++) {
					if(mark[i][j] == 0) {
						System.out.print(bingo[i][j] + "\t");
					}else {
						System.out.print("O\t");
					}
				}
				System.out.println("\n");
			}

			if(win == 1) {
				System.out.println("��������");
				break;
			}
			
			System.out.print("y��ǥ �Է� : ");
			int meY = scan.nextInt();
			System.out.print("x��ǥ �Է� : ");
			int meX = scan.nextInt();
			
			if(mark[meY][meX] == 0) {
				mark[meY][meX] = 1;
			}
			
			// ���ΰ˻�
			for(int i=0; i<maxNum; i++) {
				int cnt = 0;
				for(int j=0; j<maxNum; j++) {
					if(mark[i][j] == 1) {
						cnt += 1;
					}
				}
				if(cnt == 5) {
					win = 1;
					break;
				}
			}
			
			// ���ΰ˻�
			for(int j=0; j<maxNum; j++) {
				int cnt = 0;
				for(int i=0; i<maxNum; i++) {
					if(mark[i][j] == 1) {
						cnt += 1;
					}
				}
				if(cnt == 5) {
					win = 1;
					break;
				}
			}
			
			// �밢�� �˻�
			int cnt = 0;
			for(int i=0; i<maxNum; i++) {
				if(mark[i][i] == 1) {
					cnt += 1;
				}
			}
			if(cnt == 5) {
				win = 1;
			}
			
			cnt = 0;
			for(int i=0; i<maxNum; i++) {
				if(mark[i][(maxNum-1)-i] == 1) {
					cnt += 1;
				}
			}
			if(cnt == 5) {
				win = 1;
			}
			
		}

	}

}
