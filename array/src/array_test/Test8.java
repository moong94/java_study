package array_test;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		/*
		 * # �Ҽ� ã��[3�ܰ�]
		 * 1. ���ڸ� �� �� �Է¹޴´�.
		 * 2. �Է¹��� ���ں��� ū ù ��° �Ҽ��� ����Ѵ�.
		 * 
		 * ��) Enter Number ? 1000
		 *    1000���� ū ù���� �Ҽ��� 1009
		 * ��) Enter Number ? 500
		 *    500���� ū ù��° �Ҽ��� 503
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int input = scan.nextInt();
		
		int check = input;
		
		int cnt = 0;
		
		while(cnt != 2) {
			
			input++;
			cnt = 0;
			
			for(int i = 1; i <= input; i++) {
				if(input % i == 0) {
					cnt++;
				}
			}
		}
		System.out.println(check + "���� ū ù��° �Ҽ��� " + input);
		
	}

}
