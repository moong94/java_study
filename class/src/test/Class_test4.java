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
		#����4
		�ڿ����� ����ִ� �迭�� �ֽ��ϴ�.
		 �� �迭���� ���� ���� �����ϴ� ������ ������ 
		���� ���� �����ϴ� ���� ������ �� ������ ���Ϸ� �մϴ�.
		 �̸� ���� ������ ���� ������ ���α׷� ������ �ۼ��߽��ϴ�.

		~~~
		1�ܰ�. �迭�� ����ִ� �� �ڿ����� ������ ���ϴ�.
		2�ܰ�. ���� ���� �����ϴ� ���� ������ ���մϴ�.
		3�ܰ�. ���� ���� �����ϴ� ���� ������ ���մϴ�.
		4�ܰ�. ���� ���� �����ϴ� ���� ���� ���� �����ϴ� ������ �� �� �� ������ ���մϴ�.
		~~~

		��, �� �� �� ������ ���� ���� �Ҽ� �κ��� ������ ���� �κи� ���ϸ� �˴ϴ�.

		�ڿ����� ����ִ� �迭 arr�� �Ű������� �־��� ��, 
		���� ���� �����ϴ� ���ڰ� ���� ���� �����ϴ� ���ں��� �� �� �� ������
		 return �ϵ��� solution �޼ҵ带 �ۼ��Ϸ� �մϴ�. 
		�� ������ �����Ͽ� �ڵ尡 �ùٸ��� ������ �� �ֵ��� ��ĭ�� �־��� 
		func_a, func_b, func_c �޼ҵ�� �Ű������� �˸°� ä���ּ���.

		---
		##### �Ű����� ����
		�ڿ����� ����ִ� �迭 arr�� solution �޼ҵ��� �Ű������� �־����ϴ�.
		* arr�� ���̴� 3 �̻� 1,000 �����Դϴ�.
		* arr���� 1 �̻� 1,000������ �ڿ����� ����ֽ��ϴ�.

		---
		##### return �� ����
		�迭���� ���� ���� �����ϴ� ���ڰ� 
		���� ���� �����ϴ� ���ں��� �� �� �̻� ������ return ���ּ���.

		* ���� ���� ����ִ� ���� ������ 
		���� ���� ����ִ� ���� ������ ���� ��쿡�� 1�� return �մϴ�.

		---
		##### ����

		| arr                   | return |
		|-----------------------|--------|
		| [1,2,3,3,1,3,3,2,3,2] | 2      |

		##### ���� ����
		�迭�� 1�� 2��, 2�� 3��, 3�� 5�� ����ֽ��ϴ�.

		* ���� ���� ����ִ� ���� : 1 (2��)
		* ���� ���� ����ִ� ���� : 3 (5��)

		3�� 1���� 2.5�� ���� ���������, �Ҽ� �κ��� ������ 2�� return �ϸ� �˴ϴ�.

		 */
		Class_test4 sol = new Class_test4();
		int[] arr = { 1, 2, 3, 3, 1, 3, 3, 2, 3, 2 };
		int ret = sol.solution(arr);

		System.out.println("�� : " + ret + " .");
	}

}
