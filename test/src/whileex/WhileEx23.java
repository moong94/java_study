package whileex;

import java.util.Scanner;

public class WhileEx23 {

	public static void main(String[] args) {
		/*
		 * # �Ҽ�ã��[2�ܰ�]
		 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
		 * ��)
		 * �Է� : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int inputnum = scan.nextInt();
		
		
		for(int i = 2; i <= inputnum; i++) {
			int cnt = 0;
			
			for(int j = 2; j <= i; j++) {
				if((i % j) == 0) {
					cnt++;
				}
			} 
			if(cnt == 1) {
				System.out.print(i + ", ");
				
			}
		}
		
	}

}
