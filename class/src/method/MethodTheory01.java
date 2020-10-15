package method;

class Test{		
	void testPrint() {
		System.out.println("!!");
	}
}

public class MethodTheory01 {

	public static void main(String[] args) {
		//매서드 기본구조 
		// 정의
		// 1) void 				==> 키워드
		// 2) testPrint() 		==> 이름
		// 3) {기능}             ==> 실행되는 영역 
			
		// 사용법
		// t1.testPrint();
		// 1) t1     ==> 클래스변수명
		// 2) .testPrint(); ==> .함수이름();
		
		Test test = new Test();
		test.testPrint();
		test.testPrint();
		test.testPrint();
		test.testPrint();
	}

}
