package classEx;

import java.util.Scanner;

class Ex14{
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,0,0,0,0},
			{0,0,1,1,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	String[] menu = {"�ҽ�������", "CU������", "������", "���õ��", "���θ���"};
}

public class Class_��ٸ� {

	public static void main(String[] args) {
		/*
		 * # ��ٸ� ����
		 * 1. 0�� ������ �Ʒ��� ��������.
		 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
		 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.

		 */
		
		Ex14 e = new Ex14();		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("12345");
		for(int i = 0 ; i < e.ladder.length; i++) {
			for(int j = 0; j < e.ladder[i].length; j++) {
				if(e.ladder[i][j] == 0) {
					System.out.print("��");
				}
				else if(j == 0 && e.ladder[i][j] == 1) {
					System.out.print("��");
				}
				else if(j == e.ladder[i].length -1 && e.ladder[i][j] == 1) {
					System.out.print("��");
				}
				else if(e.ladder[i][j] == 1 && e.ladder[i][j + 1] == 1) {
					System.out.print("��");
				
				}
				else if(e.ladder[i][j] == 1 && e.ladder[i][j - 1] == 1) {
					System.out.print("��");
				
				}
				
				
				
			}
			System.out.println();
		}
		
		System.out.println("����������");
		System.out.println("���ҽ������� ��CU������ �������� �����õ�� �����θ���");		
		
		System.out.print("��ȣ ���� : ");
		int input = scan.nextInt();
	
		e.x = input - 1;
		
		while(true) {
			
			if(e.y == e.ladder.length) {
				System.out.println(e.menu[e.x]);
				break;
			}
		
			if(e.ladder[e.y][e.x] == 0) {
				e.y++;
			}
			else if(e.x == 0 && e.ladder[e.y][e.x] == 1) {
				e.x++;
				e.y++;
			}
			else if(e.x == e.ladder[e.x].length -1 && e.ladder[e.y][e.x] == 1) {
				e.x--;
				e.y++;
				
			}
			else if(e.ladder[e.y][e.x] == 1 && e.ladder[e.y][e.x + 1] == 1) {
				e.x++;
				e.y++;
			}
			else if(e.ladder[e.y][e.x] == 1 && e.ladder[e.y][e.x - 1] == 1) {
				e.x--;
				e.y++;
			}
		}
	}

}
