package whileex;

public class WhileEx19 {

	public static void main(String[] args) {
		/*
		 * # �ݺ��� for
		 * 1. �ݺ����� ���� 3����
		 * 1) �ʱ��
		 * 2) ���ǽ�
		 * 3) ������
		 * 2. for���� ����
		 * for(�ʱ��;���ǽ�;������){
		 * 		���ǽ��� ���� ���� ������ ����;
		 * }
		 * 3. for���� �������
		 * �ʱ�� �� ���ǽ� �� ���๮ �� ������ �� ���ǽ� �� ���๮ �� ������ ...
		 */
		
		// 1~5���� ���
		int x = 1;
		while (x <= 5) {
			System.out.println(x);
			x = x + 1;
		}

		System.out.println();

		for (int y = 1; y <= 5; y++) {
			System.out.println(y);
		}

		// ���� 1) 1���� 5���� ���
		// ���� 1) 1, 2, 3, 4, 5
		
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
		}

		// ���� 2) 1���� 10���� �ݺ���, 5~9���� ���
		// ���� 2) 5, 6, 7, 8, 9
		for(int j = 1; j < 10; j++) {
			if(j>=5) {
				System.out.println(j);
			}
		}
		

		// ���� 3) 1���� 10���� �ݺ��� 6~3���� ���
		// ���� 3) 6, 5, 4, 3
		for(int k = 10; k > 0; k--) {
			if(k <= 6 && k >= 3) {
				System.out.println(k);
			}
		}

		// ���� 4) 1���� 10���� �ݺ��� 3�̸� 7�̻� ���
		// ���� 4) 1, 2, 7, 8, 9, 10
		for(int l = 1; l <= 10; l ++) {
			if(l <= 3 || l >=7) {
				System.out.println(l);
			}
		}
		
	}

}
