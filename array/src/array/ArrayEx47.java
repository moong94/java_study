package array;

import java.util.Scanner;

public class ArrayEx47 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30};
		arr =null;
		
		int darr[][] = new int[3][3];
		darr[1] = arr;
		
		/*
		 * # 2�����迭[����]
		 * . �̸��� ��ȣ�� �Է¹޾� �����ϱ�
		 * ��)
		 * �Է� : ö��	1
		 * ���� : ���
		 * 
		 * �Է� : ö�� 2
		 * ���� : �ٳ���
		 */

		String[][] jang = {
				{"ö��", "�Ұ��"},
				{"ö��", "���"},
				{"����", "��ġ"},
				{"ö��", "�ٳ���"},
				{"ö��", "�����"},
				{"����", "��¡��"},
				{"����", "����"}
			};

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� �Է� : ");
		String inputname = scan.next();
		
		System.out.print("��ȣ �Է� : ");
		int inputnum = scan.nextInt();
		
		int count = -1;
		
		for(int i = 0; i < jang.length; i++) {
			if(jang[i][0].equals(inputname)) {
				count++;
			}
			if(count == inputnum) {
				System.out.println("���� : " + jang[i][1]);
				
				String tmp[][] = jang;
				jang = new String[tmp.length - 1][2];

				System.out.println("jang.length : " + jang.length);
				System.out.println("tmp.length : " + tmp.length);
				
				int l = 0;
				for(int j = 0; j < jang.length; j++) {
					if(j == count) {
						
						l++;
					}	
					for(int k = 0; k < jang[j].length; k++) {
						jang[j][k] = tmp[l][k];
					}
					l++;
					System.out.println();
				}
				
				
//				jang[jang.length - 1] = null;
//				
//				break;
			}
				
		}
		if(count == -1) {
			System.out.println("�̸� �Է� ����.");
		}		
		
		for(int i = 0; i < jang.length; i++) {
			for(int j = 0; j < jang[i].length; j++) {
				System.out.print(jang[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
