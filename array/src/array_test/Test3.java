package array_test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// ���� 1) ���ڸ� �ϳ� �Է¹ް� �Ʒ� �迭�� ������ �ϳ��� �о�� �ǵڿ� ����
		int a[] = { 10,20,30,40,50 };
		// ��)  60 ==> a[5] = {20,30,40,50,60};

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		int input = scan.nextInt();
		
		for(int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = input;
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		// ���� 2) ���ڸ� �ϳ� �Է¹ް� �Ʒ� �迭�� �ڷ� �ϳ��� �о�� �� �տ� ���� 
		int b[] = { 10,20,30,40,50 };
		// ��) 60 ==> b[5] = {60,10,20,30,40};
		
		int tmp[] = null;
		
		tmp = b;
		b = new int[b.length];
		
		System.out.print("�Է� : ");
		int input2 = scan.nextInt();
		
		for(int i = 1; i < b.length; i++) {
			b[i] = tmp[i - 1];
		}
		b[0] = input2;
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
	}

}
