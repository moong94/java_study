package test;

public class Class_test3 {

	public int func_a(int month, int day){
        int monthList[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daysum = 0;
        for(int i = 1; i < month; i++) {
        	daysum += monthList[i - 1];
        }
        daysum += day - 1;
        
        
        return daysum;
    }
    public int solution(int startMonth, int startDay, int endMonth, int endDay) {
        int startTotal = func_a(startMonth, startDay);
        int endTotal = func_a(endMonth, endDay);
        return endTotal - startTotal;
    }
    
	public static void main(String[] args) {
		/*
		 * 
		#문제3
		시작 날짜와 끝 날짜가 주어질 때,
		 두 날짜가 며칠만큼 떨어져 있는지(D-day)를 구하려 합니다. 
		이를 위해 다음과 같이 3단계로 간단히 프로그램 구조를 작성했습니다. 
		(단, 윤년은 고려하지 않습니다.)

		~~~
		1단계. 시작 날짜가 1월 1일로부터 며칠만큼 떨어져 있는지 구합니다.
		2단계. 끝 날짜가 1월 1일로부터 며칠만큼 떨어져 있는지 구합니다.
		3단계. (2단계에서 구한 날짜) - (1단계에서 구한 날짜)를 구합니다.
		~~~

		시작 날짜의 월, 일을 나타내는 startMonth, startDay, 
		끝 날짜의 월, 일을 나타내는 endMonth, endDay가 매개변수로 주어질 때, 
		시작 날짜와 끝 날짜가 며칠만큼 떨어져 있는지 
		return 하도록 solution 메소드를 작성했습니다.
		 이때, 위 구조를 참고하여 중복되는 부분은 func_a라는 메소드로 작성했습니다. 
		코드가 올바르게 동작할 수 있도록 빈칸을 알맞게 채워주세요.

		---
		##### 매개변수 설명
		시작 날짜의 월, 일을 나타내는 startMonth, startDay, 
		끝 날짜의 월, 일을 나타내는  endMonth, endDay가
		 solution 메소드의 매개변수로 주어집니다.

		* 잘못된 날짜가 주어지는 경우는 없습니다.
		* 끝 날짜는 항상 시작 날짜보다 뒤에 있는 날이 주어집니다.
		* 끝 날짜가 다음 해로 넘어가는 경우는 주어지지 않습니다.
		  * 즉, startMonth <= endMonth를 항상 만족합니다.
		  * startMonth = endMonth라면 startDay <= endDay를 항상 만족합니다.
		* 각 달의 날짜 수는 1월부터 순서대로
		 [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31] 이며,
		 윤년은 고려하지 않습니다.

		---
		##### return 값 설명
		시작 날짜와 끝 날짜가 며칠만큼 떨어져 있는지 return 해주세요.

		---
		##### 예시

		| startMonth | startDay | endMonth | endDay | return |
		|-------------|-----------|-----------|---------|--------|
		| 1           | 2         | 2         | 2       | 31     |

		##### 예시 설명
		시작 날짜는 1월 2일이고, 끝 날짜는 2월 2일입니다.

		* 1월 2일은 1월 1일로부터 1일만큼 지난 날입니다.
		* 2월 2일은 1월 1일로부터 32일만큼 지난 날입니다.
		* 32 - 1 = 31입니다.
		* 따라서 1월 2일과 2월 2일은 31일만큼 떨어져 있습니다.

		 */

		Class_test3 sol = new Class_test3();
        int startMonth = 1;
        int startDay = 2;
        int endMonth = 2;
        int endDay = 2;
        int ret = sol.solution(startMonth, startDay, endMonth, endDay);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
        
	}

}
