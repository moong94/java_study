package array;

import java.util.Scanner;

public class ArrayEx24 {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�[3�ܰ�]
		 * 1. ���� ū ���� ã�� �Է��Ѵ�.
		 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
		 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
		 * ��)
		 * 11, 87, 42, 100, 24
		 * �Է� : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * �Է� : 87
		 * 
		 * 11, 0, 42, 0, 24
		 */

		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};

		
		
		while(true) {
			
			int max = 0;
			int idx = -1;
			int sum = 0;
			
			for(int i = 0 ; i < 5; i++) {	
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		
			
			for(int i = 0; i < 5; i++) {
				sum += arr[i];
			}
			
			if(sum == 0) {
				System.out.println("CLEAR");
				break;
			}
			
			for(int i = 0; i < 5; i++) {
				if(max < arr[i]) {
					max = arr[i];
					idx = i;
				}
			}
			
			System.out.print("�Է� : ");
			int input = scan.nextInt();
		
			if(input == max) {
				arr[idx] = 0;
			}
			else {
				System.out.println("�ִ밪�� �ƴմϴ�.");
				continue;
			}
			
		}

	}

}
