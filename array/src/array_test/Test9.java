package array_test;

import java.util.Random;

public class Test9 {

	public static void main(String[] args) {
		/*
		 * # 1���� 5������ ���� ���ڸ� 2���� arr �迭�� �����ϱ�
		 * ��) 1 3 2 1 4 4 5 2 3 5
		 * �߰� ����) ���÷� ��������
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
