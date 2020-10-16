package test;

import java.util.Arrays;

public class Class_test5 {
	
	public int[] solution(int[] arr) {
		int tmp[] = new int[arr.length];
		int j = arr.length - 1;
		
		for(int i = 0; i < arr.length; i++) {
			tmp[j] = arr[i];
			j--;
		}

		return tmp;
	}

	public static void main(String[] args) {
		/*
		 * #문제5
		주어진 배열의 순서를 뒤집으려고 합니다.

		예를 들어 주어진 배열이 [1, 4, 2, 3]이면, 순서를 뒤집은 배열은 [3, 2, 4, 1]입니다.

		정수가 들어있는 배열 arr가 매개변수로 주어졌을 때,
		arr를 뒤집어서 return 하도록 solution 메소드를 작성하려 합니다.
		 빈칸을 채워 전체 코드를 완성해주세요.

		---
		##### 매개변수 설명
		정수가 들어있는 배열 arr가 solution 메소드의 매개변수로 주어집니다.
		* arr의 길이는 1 이상 100 이하입니다.
		* arr의 원소는 -100 이상 100 이하의 정수입니다.

		---
		##### return 값 설명
		배열 arr의 순서를 뒤집어서 return 해주세요.

		---
		##### 예시

		| arr          | return       |
		|--------------|--------------|
		| [1, 4, 2, 3] | [3, 2, 4, 1] |

		##### 예시 설명
		[1, 4, 2, 3]을 뒤에서부터 읽으면 3, 2, 4, 1입니다. 
		따라서 [1, 4, 2, 3]의 순서를 뒤집은 결과는 [3, 2, 4, 1]이 됩니다.
		 */
		
		Class_test5 sol = new Class_test5();
		int[] arr = { 1, 4, 2, 3 };
		int[] ret = sol.solution(arr);

		
		System.out.println("답 : " + Arrays.toString(ret) + " .");
	}

}
