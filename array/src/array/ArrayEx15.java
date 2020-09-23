package array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx15 {

	public static void main(String[] args) {
		/*
		 * # ���� ����
		 * 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�.
		 * 2. ������ ���߸� back�� �ش� ���ڸ� ������,
		 *    back�� ��� ���� ä������ ������ ����ȴ�.
		 * ��)
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		 * �Է�1 : 0
		 * �Է�2 : 1
		 * 
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
		 */

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		// ����(shuffle)
		int i = 0;
		while(i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			i += 1;
		}
		
		for(int j=0; j<10; j++) {
			System.out.print(front[j] + " ");
		}
		System.out.println();

		int cnt = 0;
		
		while(cnt < 5) {
			
				System.out.print("�Է� 1 :");
				int input1 = scan.nextInt();
		
				System.out.print("�Է� 2 :");
				int input2 = scan.nextInt();
				
		
			if(front[input1] == front[input2]) {
				System.out.println("����!");
				back[input1] = back[input2] = front[input1];
				for(int k = 0; k < 10; k ++) {
					System.out.print(back[k] + " ");
				}
				cnt++;
				System.out.println();
			}
			else {
				System.out.println("����!");
				
			}
			
		}
		System.out.println("CLEAR!");
	}

}
