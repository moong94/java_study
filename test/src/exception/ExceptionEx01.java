package exception;

//# 예외(Exception)처리

public class ExceptionEx01 {

	public static void main(String[] args) {
		
		int num = 10;
		// java.lang.ArithmeticException: / by zero
		// System.out.println(num / 0);
		
		// 심각한 오류를 발생시킬 수 있는 내용은
		// try(if) catch(else) 구문안에 만들도록 강제한다.
		
		try {
			System.out.println(num / 0);
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("프로그램 종료");
		

	}

}
