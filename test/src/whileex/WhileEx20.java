package whileex;

import java.util.Scanner;

public class WhileEx20 {

	public static void main(String[] args) {
		/*
		 * # �������
		 * 1. break
		 * . �ݺ��� 1���� ��� ����
		 * 2. continue
		 * . �ݺ����� ���ǽ����� �ٷ� �̵�
		 * . �Ʒ����� �����Ű�� ���� ���� �� ���
		 */

		// break
		for(int i=0; i<15; i++) {
			if(i > 3) {
				break;
			}
			System.out.println(i);
		}
				
		// continue
		Scanner scan = new Scanner(System.in);
				
		boolean run = true;
		while(run) {
			System.out.println("1.�ܹ���");
			System.out.println("2.�ݶ�");
			System.out.println("3.����");
					
			int sel = scan.nextInt();
					
			if(sel != 1 && sel != 2 && sel != 3) {
				continue;
			}
					
			if(sel == 1) {}
			else if(sel == 2) {}
			else if(sel == 3) {}
		}

			
	}

}
