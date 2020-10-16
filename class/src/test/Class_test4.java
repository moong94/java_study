package test;

public class Class_test4 {

	int cnt = 0;
	int newarr[];
	int counter[];
	
	int func_a(int[] arr) {
		int ret = 0;
		for(int i = 0; i < this.cnt; i++) {
			if(ret < this.counter[i]) {
				ret = this.counter[i];
			}
		}
		return ret;
	}
	int func_b(int[] arr) {
		int ret = this.counter[0];
		
		for(int i = 0 ; i < this.cnt; i++) {
			if(ret > this.counter[i]) {
				ret = this.counter[i];
			}
		}
		
		return ret;
	}
	public int solution(int[] arr) {
		
		this.newarr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			int check = 0;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					check++;
				}
			}
			if(check == 0) {
				newarr[this.cnt] = arr[i];
				this.cnt++;
			}
		}
		this.counter = new int[cnt];
		
		for(int i = 0; i < this.cnt; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(this.newarr[i] == arr[j]) {
					this.counter[i]++;
				}
			}
		}
		
		int maxCnt = func_a(arr);
		int minCnt = func_b(arr);
		return maxCnt / minCnt;
	}
	
	public static void main(String[] args) {
		/*
		 * 
		#문제4
		자연수가 들어있는 배열이 있습니다.
		 이 배열에서 가장 많이 등장하는 숫자의 개수는 
		가장 적게 등장하는 숫자 개수의 몇 배인지 구하려 합니다.
		 이를 위해 다음과 같이 간단히 프로그램 구조를 작성했습니다.

		~~~
		1단계. 배열에 들어있는 각 자연수의 개수를 셉니다.
		2단계. 가장 많이 등장하는 수의 개수를 구합니다.
		3단계. 가장 적게 등장하는 수의 개수를 구합니다.
		4단계. 가장 많이 등장하는 수가 가장 적게 등장하는 수보다 몇 배 더 많은지 구합니다.
		~~~

		단, 몇 배 더 많은지 구할 때는 소수 부분은 버리고 정수 부분만 구하면 됩니다.

		자연수가 들어있는 배열 arr가 매개변수로 주어질 때, 
		가장 많이 등장하는 숫자가 가장 적게 등장하는 숫자보다 몇 배 더 많은지
		 return 하도록 solution 메소드를 작성하려 합니다. 
		위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 
		func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

		---
		##### 매개변수 설명
		자연수가 들어있는 배열 arr가 solution 메소드의 매개변수로 주어집니다.
		* arr의 길이는 3 이상 1,000 이하입니다.
		* arr에는 1 이상 1,000이하의 자연수가 들어있습니다.

		---
		##### return 값 설명
		배열에서 가장 많이 등장하는 숫자가 
		가장 적게 등장하는 숫자보다 몇 배 이상 많은지 return 해주세요.

		* 가장 많이 들어있는 수의 개수와 
		가장 적게 들어있는 수의 개수가 같은 경우에는 1을 return 합니다.

		---
		##### 예시

		| arr                   | return |
		|-----------------------|--------|
		| [1,2,3,3,1,3,3,2,3,2] | 2      |

		##### 예시 설명
		배열에 1이 2개, 2가 3개, 3이 5개 들어있습니다.

		* 가장 적게 들어있는 숫자 : 1 (2개)
		* 가장 많이 들어있는 숫자 : 3 (5개)

		3이 1보다 2.5배 많이 들어있으며, 소수 부분을 버리고 2를 return 하면 됩니다.

		 */
		Class_test4 sol = new Class_test4();
		int[] arr = { 1, 2, 3, 3, 1, 3, 3, 2, 3, 2 };
		int ret = sol.solution(arr);

		System.out.println("답 : " + ret + " .");
	}

}
