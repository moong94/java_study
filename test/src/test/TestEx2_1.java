package test;

public class TestEx2_1 {

	public static void main(String[] args) {
//		# ����2)  9�� ����� ���� �ڸ��� 6�� ù��° ��� ���
//		# �� : 63

		int i = 0;
		while(true) {
			if((i % 9 == 0) && (i / 10 == 6)) {
				break;
			}
			i++;
		}
		System.out.println(i);
		
		
//		# ����3) 8�� ������ 5�� ���¼� �� 150���� �������߿� �� ���� �������� ���Ͻÿ�
//		# �� 149
		
		int j = 150;
		while(true) {
			if(j % 8 == 5) {
				break;
			}
			j--;
		}
		System.out.println(j);
		
		
//		# ����4) 50���� 100���� �ڿ����߿��� 9�� ����� ��� ��Դϱ�?
//		# �� 6 (54,63,72,81,90,99)
		
		int cnt = 0;
				
		for(int k = 50; k <= 100; k++) {
			if(k % 9 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
//		# ����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ���Ͻÿ�.
//		# �� 980
		
		int num = 0;
		
		for(int l = 1000; l >= 100; l--) {
			if(l % 28 == 0) {
				num = l;
				break;
			}
		}
		System.out.println(num);
		
//	# ����6) 8�� ����� ���������� 5�� ���
//	# �� : 0,8,16,24,32
		
		int cnt2 = 0;
		int m = 0;
		
		while(cnt2 < 5) {
			if(m % 8 == 0) {
				System.out.print(m + ", ");
				cnt2++;
			}
			m++;
		}
		
		
		
		
		
	}

}
