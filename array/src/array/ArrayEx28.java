package array;

import java.util.Random;

public class ArrayEx28 {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[2�ܰ�]
		 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
		 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
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
