package array_test;

public class Test4 {

	public static void main(String[] args) {
		// ���� 1) �Ʒ� �迭 a �� b �� ���ؼ� ���� ���� ¦�� �϶��� c�� ���� 

		//
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 13, 54, 17, 42, 1 };
		int c[] = { 0,0,0,0,0};

		// ��) c[5] = {74,82,0,0,0}
		int cnt = 0; 
		
		for(int i = 0; i < a.length; i++) {
			int sum = a[i] + b[i];
			if(sum % 2 == 0) {
				c[cnt] = sum;
				cnt++;
			}
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
		System.out.println();
		
		// ����2) �Ʒ��� ������ �̴�. ���迡 �հ��ѻ���� ��ȣ�� win �� ���� (60���̻��հ�)
		int num[] = { 1001, 1002, 1003 };
		int score[] = { 50, 83, 78 };
		int win[] = { 0,0,0 };
		// ��) win[3]= {1002, 1003, 0};
		
		int cnt_2 = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(score[i] >= 60) {
				win[cnt_2] = num[i];
				cnt_2++;
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(win[i] + " ");
		}
		
		System.out.println();

		// ����3) �Ʒ��� ������ �̴� ���迡 �հ��� ����� ��ȣ�� win2 �� ���� (60���̻� �հ�)
		int data[] = { 1001, 80 , 1002, 23, 1003 , 78 };
		int win2[] = { 0,0,0 };
		// ��) win2[3] = {1001, 1003, 0};

		int cnt_3 = 0;
		
		for(int i = 0 ; i < data.length; i++) {
			if(i % 2 == 1) {
				if(data[i] >= 60) {
					win2[cnt_3] = data[i - 1];
					cnt_3++;
				}
			}
		}
		
		for(int i = 0; i < win2.length; i++) {
			System.out.print(win2[i] + " ");
		}

	}

}
