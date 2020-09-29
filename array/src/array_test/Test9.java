package array_test;

import java.util.Random;

public class Test9 {

	public static void main(String[] args) {
		/*
		 * # 1부터 5사이의 랜덤 숫자를 2개씩 arr 배열에 저장하기
		 * 예) 1 3 2 1 4 4 5 2 3 5
		 * 추가 조건) 셔플로 하지말것
		 */
		Random ran = new Random();
		
		int arr[] = new int[10];
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			int num = ran.nextInt(5) + 1;
			
			cnt = 0;
			
			for(int j = 0; j < arr.length; j++) {	
				if(arr[j] == num) {
					cnt++;
				}
			}
			if(cnt < 2) {
				arr[i] = num;
			}
			else {
				i--;
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
