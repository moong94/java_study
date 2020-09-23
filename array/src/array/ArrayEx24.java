package array;

import java.util.Scanner;

public class ArrayEx24 {

	public static void main(String[] args) {
		/*
		 * # 최대값 구하기[3단계]
		 * 1. 가장 큰 값을 찾아 입력한다.
		 * 2. 정답이면 해당 값을 0으로 변경한다.
		 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
		 * 예)
		 * 11, 87, 42, 100, 24
		 * 입력 : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * 입력 : 87
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
			
			System.out.print("입력 : ");
			int input = scan.nextInt();
		
			if(input == max) {
				arr[idx] = 0;
			}
			else {
				System.out.println("최대값이 아닙니다.");
				continue;
			}
			
		}

	}

}
