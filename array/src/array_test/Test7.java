package array_test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		//����1) 1~�鸸 ������ ���ڸ� �Է¹ް� ��� ���� ��� 
        //(�� ! ¦���ڸ��� ���� ¦���ڸ���� ���)
		// ��)  123 ==> 2
		// ��)  1234 ==> ¦���� �ڸ��̴�
		// ��)  1 ==> 1
		// ��)  1234567 ==> 4
		
		// ��Ʈ �ڸ����� ���ϰ� �迭�� ������� �ϳ��� ���� 
		// ��) ==> 123 ==> 3 ==> arr[] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		int input = scan.nextInt();
		
		int inputtest = input;
		int cnt = 1;
		
		while(inputtest / 10 != 0) {
			inputtest /= 10;
			cnt++;
		}
		
		int arr[] = new int[cnt];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input % 10;
			input /= 10;
		}
		
		if(arr.length % 2 == 0) {
			System.out.println("¦���� �ڸ��̴�.");
		}
		else {
			System.out.println(arr[arr.length / 2]);
		}
	}

}
