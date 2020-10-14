package classes;

class Ex01{
	int x;
	int y;
}

public class ClassTheory {

	public static void main(String[] args) {
		/*
		 * # 클래스
		 * 1. 정의(설계도)
		 * 	1) class	: 키워드
		 * 	2) Ex01		: 클래스명
		 * 	3) {}		: 자료형의 영역(기본 자료형을 조합해 생성)
		 * 2. 선언
		 * 	1) 자료형	 변수명  = new 자료형();	
		 *  2) Ex01  e    = new Ex01(); 
		 */
					
			Ex01 e = new Ex01();	// 클래스 : 사용자 정의 자료형(개발자가 직접 만듬)
			e.x = 10;
			e.y = 20;
			
			System.out.println(e);	// 주소가나온다. 클래스도 주소변수이다. 
			System.out.println(e.x);
			System.out.println(e.y);
			// 아래 배열과 같은느낌으로 사용하면된다. 
			
			//----------------------------------------------------
			int arr[] = new int[3];
			System.out.println(arr);
	}

}
