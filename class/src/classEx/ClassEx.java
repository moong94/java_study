package classEx;

class Ex03 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class ClassEx {

	public static void main(String[] args) {
		Ex03 e = new Ex03();
		
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		
		int sum = 0;
		
		for(int i = 0 ; i < e.arr.length; i++) {
			sum += e.arr[i];
		}
		System.out.println(sum);
		
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		
		sum = 0;
		
		for(int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				sum += e.arr[i];
			}
		}
		System.out.println(sum);
		
		
		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3

		int count = 0;
			
		for(int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		
		int odd_count = 0;
		
		for(int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 2 == 0) {
				odd_count++;
			}
		}
		
		System.out.println(odd_count);
	
	}

}
