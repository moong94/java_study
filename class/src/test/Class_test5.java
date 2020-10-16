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
		 * #����5
		�־��� �迭�� ������ ���������� �մϴ�.

		���� ��� �־��� �迭�� [1, 4, 2, 3]�̸�, ������ ������ �迭�� [3, 2, 4, 1]�Դϴ�.

		������ ����ִ� �迭 arr�� �Ű������� �־����� ��,
		arr�� ����� return �ϵ��� solution �޼ҵ带 �ۼ��Ϸ� �մϴ�.
		 ��ĭ�� ä�� ��ü �ڵ带 �ϼ����ּ���.

		---
		##### �Ű����� ����
		������ ����ִ� �迭 arr�� solution �޼ҵ��� �Ű������� �־����ϴ�.
		* arr�� ���̴� 1 �̻� 100 �����Դϴ�.
		* arr�� ���Ҵ� -100 �̻� 100 ������ �����Դϴ�.

		---
		##### return �� ����
		�迭 arr�� ������ ����� return ���ּ���.

		---
		##### ����

		| arr          | return       |
		|--------------|--------------|
		| [1, 4, 2, 3] | [3, 2, 4, 1] |

		##### ���� ����
		[1, 4, 2, 3]�� �ڿ������� ������ 3, 2, 4, 1�Դϴ�. 
		���� [1, 4, 2, 3]�� ������ ������ ����� [3, 2, 4, 1]�� �˴ϴ�.
		 */
		
		Class_test5 sol = new Class_test5();
		int[] arr = { 1, 4, 2, 3 };
		int[] ret = sol.solution(arr);

		
		System.out.println("�� : " + Arrays.toString(ret) + " .");
	}

}
