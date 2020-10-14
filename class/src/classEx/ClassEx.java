package classEx;

class Ex03 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class ClassEx {

	public static void main(String[] args) {
		Ex03 e = new Ex03();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		int sum = 0;
		
		for(int i = 0 ; i < e.arr.length; i++) {
			sum += e.arr[i];
		}
		System.out.println(sum);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		sum = 0;
		
		for(int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				sum += e.arr[i];
			}
		}
		System.out.println(sum);
		
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3

		int count = 0;
			
		for(int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		
		int odd_count = 0;
		
		for(int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 2 == 0) {
				odd_count++;
			}
		}
		
		System.out.println(odd_count);
	
	}

}
