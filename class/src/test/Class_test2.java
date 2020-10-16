package test;

public class Class_test2 {
	/*
	 * 
	#문제2
	A 쇼핑몰에서는 회원 등급에 따라 할인 서비스를 제공합니다.
	회원 등급에 따른 할인율은 다음과 같습니다.
	(S = 실버, G = 골드, V = VIP)

	| 등급     | 할인율 |
	|----------|--------|
	| "S" | 5%     |
	| "G"   | 10%    |
	| "V"    | 15%    |

	상품의 가격 price와 구매자의 회원 등급을 나타내는 문자열 grade가 매개변수로 주어질 때, 
	할인 서비스를 적용한 가격을 return 하도록 solution 메소드를 완성해주세요.

	---

	#####매개변수 설명
	상품의 가격 price와 회원 등급 grade가 매개변수로 주어집니다.
	* price는 100 이상 100,000 이하의 100단위 자연수입니다.
	* grade는 "S", "G", "V" 세 가지 중 하나입니다.

	---

	#####return 값 설명
	할인한 가격을 return 하도록 solution 메소드를 작성해주세요.

	---

	#####예시

	| price | grade    | return |
	|-------|----------|--------|
	| 2500  | "V"    | 2125   |
	| 96900 | "S" | 92055  |

	##### 예시 설명
	예시 #1
	2500원의 15%는 375원 입니다. 2500 - 375 = 2125 입니다.

	예시 #2
	96900원의 5%는 4845원 입니다. 96900 - 4845 = 92055 입니다.
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


		System.out.println("답 : " + ret1 + " .");

		int price2 = 96900;
		String grade2 = new String("S");
		int ret2 = sol.solution(price2, grade2);


		System.out.println("답 : " + ret2 + " .");
	}

}
