package classEx;

import java.util.Scanner;

class Ex09{
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// ������ ���� Ƚ��
}

public class Class_���°��� {

	public static void main(String[] args) {
		/*
		 * # ���� ���� : Ŭ���� + ����
		 * 1. front �迭 ī�� 10���� ���´�.
		 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
		 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
		 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
		 */
		
		Ex09 e = new Ex09();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			for(int i = 0; i < e.back.length; i++) {
				System.out.print(e.back[i] + " ");
			}
			System.out.println();
			
			if(e.cnt == 5) {
				System.out.println("clear");
				break;
			}
			
			System.out.print("ù ��° ��ġ �Է� : ");
			int input1 = scan.nextInt();
			
			if(e.back[input1] != 0) {
				System.out.println("�̹� Ȯ�� �� ī��");
				continue;
			}
			
			if(input1 < 0 || input1 >= e.back.length) {
				System.out.println("�Է� ����");
				continue;
			}
			
			System.out.print("�� ��° ��ġ �Է� : ");
			int input2 = scan.nextInt();
			
			if(e.back[input2] != 0) {
				System.out.println("�̹� Ȯ�� �� ī��");
				continue;
			}
			
			if(input1 == input2 || input2 < 0 || input2 >= e.back.length) {
				System.out.println("�Է� ����");
				continue;
			}
			
			if(e.front[input1] == e.front[input2]) {
				e.back[input1] = e.front[input1];
				e.back[input2] = e.front[input2];
				e.cnt++;
			}
			
			else {
				continue;
			}
			
		}
	}

}
