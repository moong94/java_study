package array;

import java.util.Scanner;

public class ArrayEx40 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		Scanner scan = new Scanner(System.in);
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.print("�ε���1 �Է� : ");
		int idx1 = scan.nextInt();
		System.out.print("�ε��� 2 �Է� : ");
		int idx2 = scan.nextInt();
		
		System.out.println("�� ��� : " + arr[idx1][idx2]);
		
		
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		
		int idxx = 0;
		int idxy = 0;
		
		System.out.print("�� �Է� : ");
		int val = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				if(arr[i][j] == val) {
					idxx = i;
					idxy = j;
				}
			}
		}
		System.out.println("�ε���1 ��� : " + idxx + "     �ε���2 ��� : " + idxy);
		
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		int max = 0;
		int idxx2 = 0;
		int idxy2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					idxx2 = i;
					idxy2 = j;
				}
			}
		}
		System.out.println(idxx2 + " " + idxy2);
		
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		System.out.print("��1 �Է� : ");
		int val1 = scan.nextInt();
		
		int val1x = 0;
		int val1y = 0;
		
		System.out.print("��2 �Է� : ");
		int val2 = scan.nextInt();

		int val2x = 0;
		int val2y = 0;
		
		int[][] tmp = new int[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				if(arr[i][j] == val1) {
					val1x = i;
					val1y = j;
				}
				else if(arr[i][j] == val2) {
					val2x = i;
					val2y = j;
				}
			}
		}
		
		tmp[val1x][val1y] = arr[val1x][val1y];
		tmp[val2x][val2y] = arr[val2x][val2y];
		
		arr[val1x][val1y] = tmp[val2x][val2y];
		arr[val2x][val2y] = tmp[val1x][val1y];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	

}
