package whileex;

import java.util.Scanner;

public class WhileEx06 {

	public static void main(String[] args) {
		/*
		 * # �ݺ��� ����(-100)
		 * 1. ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
		 * 2. �Է��� ���ڰ� -100�̸�, ���α׷��� ����ȴ�.
		 */
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while(num != -100){
			num = scan.nextInt();
		}
		
	}

}
