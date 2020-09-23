package array;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// 문제2) 4의 배수만 출력
		// 정답2) 20 40
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println();
		
		// 문제3) 4의 배수의 합 출력
		// 정답3) 60
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		
		System.out.println();
		
		// 문제4) 4의 배수의 개수 출력
		// 정답4) 2
		
		int cnt = 0;
		
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		System.out.println();
		
		// 문제5) 짝수의 개수 출력
		// 정답5) 5
		
		int evencnt = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 2 == 0) {
				evencnt++;
			}
		}
			System.out.println(evencnt);
	}
}
