package string;

public class StringEx05 {

	public static void main(String[] args) {
		/*
		 * # 형변환(type conversion)
		 * 1) 자료형(data type)을 바꾸는 것을 의미
		 * 2) (변환할 자료형)변수
		 */
		// 문자 -> 숫자
		
				char ch = 'a';
				int aNum = (int)ch;
				System.out.println(aNum);					// 97
				
				//숫자  -> 문자
				ch = (char)(aNum + 1);
				System.out.println(ch);						// b
				
				// 문자열 -> 숫자
				String strNum = "10";
				int num = Integer.parseInt(strNum);
				System.out.println(num + 1);				// 11
				
				// 숫자 -> 문자열
				// 방법1) 꼼수
				strNum = num + "";
				System.out.println(strNum + 1);				// 101
				// 방법2) 정식
				strNum = String.valueOf(num);
				System.out.println(strNum + 1);				// 101
			

	}

}
