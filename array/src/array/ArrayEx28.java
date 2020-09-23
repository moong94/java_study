package array;

import java.util.Random;

public class ArrayEx28 {

	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[2단계]
		 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
		 * 2. 단 중복되는 숫자가 없어야 한다.
		 */
		
		Random ran = new Random();
		
		int[] arr = new int[5];

		for(int i = 0; i < 5; i++) {
			int rannum = ran.nextInt(10) + 1;
			int check = 1;
			for(int j = 0; j < i; j++) {
					if(arr[j] == rannum) {
						check = -1;
					}
			}
			if(check == 1) {
				arr[i] = rannum;
			}
			else {
				i--;
			}
		}
		
		
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
