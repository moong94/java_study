package array_test;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		int b[] = new int[5];
		
		// ���ڸ� 5�� �Է¹ް� arr �迭�ȿ� �Է��Ѱ��� ���������� 
		// b�迭�ȿ� �ش� ���� �ε����� ���ʴ�� �����ҷ��� �Ѵ�. 
		// ����) ���࿡ �Է��� ���ڰ� arr �� ������ �ε��� ��� -1 ���� 
	
		// ��) 10, 20, 10, 1, 50
		//  b ={0,1,0,-1,4}
		
		// ��)  30, 40, 1, 10, 2
		
		// b = {2,3,-1,0,-1}

		int check = -1;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			
			check = -1;
			
			System.out.print("�Է� : ");
			int input = scan.nextInt();
			
			for(int j = 0; j < arr.length; j++) {
				if(input == arr[j]) {
					b[i] = j;
				}
				else {
					check++;
				}
				
				if(check == 4) {
					b[i] = -1;
				}
			}
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
