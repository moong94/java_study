package array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx16 {

	public static void main(String[] args) {
		/*
		 * # 1 to 50[1�ܰ�] : 1 to 4
		 * 1. arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
		 * 2. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
		 * 3. ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
		 * ��)
		 * 4 2 3 1
		 * �Է� : 3
		 * 4 2 3 9
		 * �Է� : 1
		 * 4 9 3 9
		 * ...
		 */

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		int num = 1;
		
		
		for(int i = 0; i < 4; i++) {
			
			int rannum = ran.nextInt(4);
				
			if(arr[rannum] == 0) {
				arr[rannum] = num;
				num++;
			}
			else {
				i--;
			}
		}
		for(int i = 0; i < 4; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int checknum = 0;
		
		while(checknum < 4) {
			System.out.print("�Է� : ");
			int input = scan.nextInt();
			
			if(arr[input] == checknum + 1) {
				arr[input] = 9;
				checknum++;
				for(int i = 0; i < 4; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
			else {
				System.out.println("����");
				continue;
			}
			
		}
		System.out.println("CLEAR");
		
		

	}

}
