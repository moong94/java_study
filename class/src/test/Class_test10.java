package test;

public class Class_test10 {

	public int solution(int[] data) {
        double total = 0;
        int cnt = 0;
        
        double avg = 0.0;
        
        for(int i = 0; i < data.length; i++) {
        	total += data[i];
        }
        avg = total / data.length;
        
        for(int i = 0; i < data.length; i++) {
        	if(data[i] < avg) {
        		cnt++;
        	}
        }
       
        return cnt;
    }
	public static void main(String[] args) {
		/*
		 * #문제10
		평균은 자료의 합을 자료의 개수로 나눈 값을 의미합니다. 
		자연수가 들어있는 배열의 평균을 구하고, 평균 이하인 숫자는 몇 개 있는지 구하려합니다.

		예를 들어 주어진 배열이 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]이라면,
		 평균은 5.5이므로 배열에서 평균 이하인 값은 5개입니다.


		---

		#####매개변수 설명
		자연수가 들어있는 배열 data가 solution 메소드의 매개변수로 주어집니다.
		* data의 길이는 10 이상 100 이하 정수입니다.
		* data의 원소는 1 이상 1,000 이하의 자연수입니다.

		---

		#####return 값 설명
		평균보다 값이 작은 자연수는 몇개인지 return 해주세요.

		---
		#####예시

		| data                            | return |
		|---------------------------------|--------|
		| [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] | 5      |
		| [1, 1, 1, 1, 1, 1, 1, 1, 1, 10] | 9      |

		---
		#####예시 설명
		예시 #1
		자료의 합은 55이며, 자료의 개수는 10개입니다. 따라서 평균은 55 / 10 = 5.5입니다.
		주어진 배열에서 5.5보다 작은 숫자는 총 5개입니다.

		예시 #2
		자료의 합은 19이며, 자료의 개수는 10개입니다. 따라서 평균은 19 / 10 = 1.9입니다.
		주어진 배열에서 1.9보다 작은 숫자는 총 9개입니다.


		 */
		Class_test10 sol = new Class_test10();
        int[] data1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ret1 = sol.solution(data1);
        System.out.println("답 : " + ret1 + " .");
        
        int[] data2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
        int ret2 = sol.solution(data2);	        
        System.out.println("답 : " + ret2 + " .");
	}

}
