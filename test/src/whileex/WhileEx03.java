package whileex;

public class WhileEx03 {

	public static void main(String[] args) {

		// ����1) 1~5������ �� ���
		// ���� 1) 15
		int i = 1;
		int sum = 0;
		while(i <= 5) {
			sum += i;
			i += 1;
		}
		System.out.println(sum);
		
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10
		int j = 1;
		while(j <= 10) {
			if(j < 3 || j >=7) {
				System.out.print(j + ", ");
			}
			j += 1;
		}
		System.out.println();
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		// ����3) 37
		j = 1;
		sum = 0;
		while(j <= 10) {
			if(j < 3 || j >=7) {
				sum += j;
			}
			j += 1;
		}
		System.out.println(sum);
		
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		// ����4) 6
		j = 1;
		int cnt = 1;
		while(j <= 10) {
			if(j < 3 || j >=7) {
				cnt += 1;
			}
			j += 1;
		}
		System.out.println(cnt);

		
	}

}
