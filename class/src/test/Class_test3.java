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
		#����3
		���� ��¥�� �� ��¥�� �־��� ��,
		 �� ��¥�� ��ĥ��ŭ ������ �ִ���(D-day)�� ���Ϸ� �մϴ�. 
		�̸� ���� ������ ���� 3�ܰ�� ������ ���α׷� ������ �ۼ��߽��ϴ�. 
		(��, ������ ������� �ʽ��ϴ�.)

		~~~
		1�ܰ�. ���� ��¥�� 1�� 1�Ϸκ��� ��ĥ��ŭ ������ �ִ��� ���մϴ�.
		2�ܰ�. �� ��¥�� 1�� 1�Ϸκ��� ��ĥ��ŭ ������ �ִ��� ���մϴ�.
		3�ܰ�. (2�ܰ迡�� ���� ��¥) - (1�ܰ迡�� ���� ��¥)�� ���մϴ�.
		~~~

		���� ��¥�� ��, ���� ��Ÿ���� startMonth, startDay, 
		�� ��¥�� ��, ���� ��Ÿ���� endMonth, endDay�� �Ű������� �־��� ��, 
		���� ��¥�� �� ��¥�� ��ĥ��ŭ ������ �ִ��� 
		return �ϵ��� solution �޼ҵ带 �ۼ��߽��ϴ�.
		 �̶�, �� ������ �����Ͽ� �ߺ��Ǵ� �κ��� func_a��� �޼ҵ�� �ۼ��߽��ϴ�. 
		�ڵ尡 �ùٸ��� ������ �� �ֵ��� ��ĭ�� �˸°� ä���ּ���.

		---
		##### �Ű����� ����
		���� ��¥�� ��, ���� ��Ÿ���� startMonth, startDay, 
		�� ��¥�� ��, ���� ��Ÿ����  endMonth, endDay��
		 solution �޼ҵ��� �Ű������� �־����ϴ�.

		* �߸��� ��¥�� �־����� ���� �����ϴ�.
		* �� ��¥�� �׻� ���� ��¥���� �ڿ� �ִ� ���� �־����ϴ�.
		* �� ��¥�� ���� �ط� �Ѿ�� ���� �־����� �ʽ��ϴ�.
		  * ��, startMonth <= endMonth�� �׻� �����մϴ�.
		  * startMonth = endMonth��� startDay <= endDay�� �׻� �����մϴ�.
		* �� ���� ��¥ ���� 1������ �������
		 [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31] �̸�,
		 ������ ������� �ʽ��ϴ�.

		---
		##### return �� ����
		���� ��¥�� �� ��¥�� ��ĥ��ŭ ������ �ִ��� return ���ּ���.

		---
		##### ����

		| startMonth | startDay | endMonth | endDay | return |
		|-------------|-----------|-----------|---------|--------|
		| 1           | 2         | 2         | 2       | 31     |

		##### ���� ����
		���� ��¥�� 1�� 2���̰�, �� ��¥�� 2�� 2���Դϴ�.

		* 1�� 2���� 1�� 1�Ϸκ��� 1�ϸ�ŭ ���� ���Դϴ�.
		* 2�� 2���� 1�� 1�Ϸκ��� 32�ϸ�ŭ ���� ���Դϴ�.
		* 32 - 1 = 31�Դϴ�.
		* ���� 1�� 2�ϰ� 2�� 2���� 31�ϸ�ŭ ������ �ֽ��ϴ�.

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
