package array;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// ����2) 4�� ����� ���
		// ����2) 20 40
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println();
		
		// ����3) 4�� ����� �� ���
		// ����3) 60
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		
		System.out.println();
		
		// ����4) 4�� ����� ���� ���
		// ����4) 2
		
		int cnt = 0;
		
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		System.out.println();
		
		// ����5) ¦���� ���� ���
		// ����5) 5
		
		int evencnt = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 2 == 0) {
				evencnt++;
			}
		}
			System.out.println(evencnt);
	}
}
