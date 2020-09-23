package array;

import java.util.Scanner;

public class ArrayEx18 {

	public static void main(String[] args) {
		/*
		 * # �̴ϸ���
		 * 1. �÷��̾�� p1�� p2 2���̴�.
		 * 2. �����ư��� 1~3 ������ ���ڸ� �Է��� �̵��Ѵ�.
		 * 3. �̵��ϴٰ� ���� �÷��̾�� ���� ��ġ�� ���̰� �Ǹ�,
		 *    ��� �÷��̾�� ������ �Ǿ� �������� �ǵ��ư���.
		 * 4. ���� 3������ ���� �̱��.
		 *    
		 *  [p2]1~3 �Է� : 1
		 *  1 2 3 4 5 6 7 8 
		 *  0 1 0 0 0 0 0 0 
		 *  0 0 0 2 0 0 0 0 
		 *  
		 *  [p1]1~3 �Է� : 3
		 *  [p1]�� p2�� ��Ҵ�!
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
			System.out.print("[p1]1~3 �Է� : ");
			int p1turn = scan.nextInt();
			
			if(p1turn < 1 || p1turn > 3) {
				System.out.println("1~3������ ���ڸ� �Է����ּ���");
				continue;
			}
			else {
				p1[idx1] = 0;
				idx1 += p1turn;
				if(idx1 > 7) {
					turnp1++;
					System.out.println("p1�� " + turnp1 + "���� ���Ҵ�.");
					idx1 = 0;
					if(turnp1 == 3) {
						System.out.println("p1�¸�");
						break;
					}
				}
				p1[idx1] = 1;
			}
			
			if(idx1 == idx2) {
				System.out.println("p1�� p2�� ��Ҵ�.");
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
			
			
			
			System.out.print("[p2]1~3 �Է� : ");
			int p2turn = scan.nextInt();
			
			if(p2turn < 1 || p2turn > 3) {
				System.out.println("1~3������ ���ڸ� �Է����ּ���");
				continue;
			}
			else {
				p2[idx2] = 0;
				idx2 += p2turn;
				
				if(idx2 > 7) {
					turnp2++;
					System.out.println("p2�� " + turnp2 + "���� ���Ҵ�.");
					idx2 = 0;
					if(turnp2 == 3) {
						System.out.println("p2�¸�");
						break;
					}
				}
				p2[idx2] = 2;
			}
			if(idx2 == idx1) {
				System.out.println("p2�� p1�� ��Ҵ�.");
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
