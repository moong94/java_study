package array;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// �й��� ������ �ѽ��̴� 1001:20 , 1002:45  , 1003:54
		
		Scanner scan =new Scanner(System.in);
		
		// ����1) �й��� �Է��ϸ� ���� ��� 
		System.out.print("�й� �Է� : ");
		int num = scan.nextInt();
		
		for(int i = 0; i < 6; i++) {
			if(arr[i] == num) {
				System.out.println(arr[i + 1]);
			}
		}		
		
		// ����2) ������ �Է��ϸ� �й� ��� 
		System.out.print("���� �Է� : ");
		int num2 = scan.nextInt();
		
		for(int i = 0; i < 6; i++) {
			if(arr[i] == num2) {
				System.out.println(arr[i - 1]);
			}
		}		

		int score[] = {1001, 20,43 , 1002 , 54,2 , 1003,76,6};
		
		// �й��� ���� ���� �����̴� 
		// ��) 1001 == (20 , 43)
		//    1002 == (54 , 2)
		//    1003 == (76 , 6)
		// ����3)  ������ ���� �Է��ϸ� ��ȣ ��� 
		// ��)  63 ==> 1001 
		// ��)  56 ==> 1002
		// ��)  82 ==> 1003
		System.out.print("������ �� �Է� : ");
		int sum = scan.nextInt();
		
		for(int i = 0; i < 3; i++) {
			if(score[i+1] + score[i+2] == sum) {
				System.out.println("�й� : " + score[i]);
			}
		}
		

	}

}
