package array;

import java.util.Random;

public class ArrayEx11 {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[1�ܰ�]
		 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
		 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
		 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
		 * 
		 * ��)
		 * �������� : 1
		 * check = {0, 1, 0, 0, 0}
		 * arr   = {1, 0, 0, 0, 0}
		 * �������� : 3
		 * check = {0, 1, 0, 1, 0}
		 * arr   = {1, 3, 0, 0, 0}
		 * �������� : 2
		 * check = {0, 1, 1, 1, 0}
		 * arr   = {1, 3, 2, 0, 0}
		 */
		
		Random ran = new Random();
		
		int[] check = new int[5];
		int[] arr = new int[5];

		for(int i  = 0; i < 5; i++) {
			int checknum = ran.nextInt(5);
			if(check[checknum] == 0) {
				arr[i] = checknum;
				check[checknum] = 1;
				System.out.println("�������� : " + checknum);
				System.out.print("check = { ");
				for(int j = 0; j < 5; j++) {
					System.out.print(check[j] + " ");
				}
				System.out.println("}");
				
				System.out.print("arr = { ");
				for(int j = 0; j < 5; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println("}");
			}
			else if(check[checknum] == 1) {
				i--;
				continue;
			}
		}

	}

}
