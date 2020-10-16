package method;

class TestReturn4{
	int countMuliple4(int[] arr) { 
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt += 1;
			}
		}
		return cnt; 
	}
	
	int[] countMulipleArray(int[] arr) { 
		int cnt = countMuliple4(arr);
		int[] temp = new int[cnt];
		
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				temp[j] = arr[i];
				j += 1;
			}
		}		
		return temp; 
	}
	
	void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

public class MethodReturnTheory04 {

	public static void main(String[] args) {
		
		TestReturn4 test = new TestReturn4();
		
		int[] arr = {87, 12, 21, 56, 100};
		
		// ���� 1) 4�� ����� ������ �������ִ� �޼���
		int cnt = test.countMuliple4(arr);
		System.out.println("cnt = " + cnt);
		
		// ���� 2) 4�� ����� �迭 Ÿ������ �������ִ� �޼���
		int[] temp = test.countMulipleArray(arr);
		test.print(temp);

	}

}
