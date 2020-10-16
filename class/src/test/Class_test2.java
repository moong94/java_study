package test;

public class Class_test2 {
	/*
	 * 
	#����2
	A ���θ������� ȸ�� ��޿� ���� ���� ���񽺸� �����մϴ�.
	ȸ�� ��޿� ���� �������� ������ �����ϴ�.
	(S = �ǹ�, G = ���, V = VIP)

	| ���     | ������ |
	|----------|--------|
	| "S" | 5%     |
	| "G"   | 10%    |
	| "V"    | 15%    |

	��ǰ�� ���� price�� �������� ȸ�� ����� ��Ÿ���� ���ڿ� grade�� �Ű������� �־��� ��, 
	���� ���񽺸� ������ ������ return �ϵ��� solution �޼ҵ带 �ϼ����ּ���.

	---

	#####�Ű����� ����
	��ǰ�� ���� price�� ȸ�� ��� grade�� �Ű������� �־����ϴ�.
	* price�� 100 �̻� 100,000 ������ 100���� �ڿ����Դϴ�.
	* grade�� "S", "G", "V" �� ���� �� �ϳ��Դϴ�.

	---

	#####return �� ����
	������ ������ return �ϵ��� solution �޼ҵ带 �ۼ����ּ���.

	---

	#####����

	| price | grade    | return |
	|-------|----------|--------|
	| 2500  | "V"    | 2125   |
	| 96900 | "S" | 92055  |

	##### ���� ����
	���� #1
	2500���� 15%�� 375�� �Դϴ�. 2500 - 375 = 2125 �Դϴ�.

	���� #2
	96900���� 5%�� 4845�� �Դϴ�. 96900 - 4845 = 92055 �Դϴ�.
	 */
	
	public int solution(int price, String grade) {
		
		int answer = 0;
		
		if(grade.equals("S")) {
			answer = (int)(price * 0.95);
		}
		else if(grade.equals("G")) {
			answer = (int)(price * 0.9);
		}
		else if(grade.equals("V")) {
			answer = (int)(price * 0.85);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Class_test2 sol = new Class_test2();
		int price1 = 2500;
		String grade1 = new String("V");
		int ret1 = sol.solution(price1, grade1);


		System.out.println("�� : " + ret1 + " .");

		int price2 = 96900;
		String grade2 = new String("S");
		int ret2 = sol.solution(price2, grade2);


		System.out.println("�� : " + ret2 + " .");
	}

}
