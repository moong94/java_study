package method;

class TestReturn1{
	void loop1() {
		for(int i =0; i < 10; i++) {
			if(i == 5) {
				System.out.println("종료");
				 break; 			
			}
			System.out.println("loop1 ==> i : " + i);
		}
		System.out.println("여기출력 loop1");
	}
	void loop2() {
		for(int i =0; i < 10; i++) {
			if(i == 5) {
				System.out.println("종료");
				return;
			}
			System.out.println("loop2 ==> i : " + i);
		}
		System.out.println("여기출력 loop2");
	}
}

public class MethodReturnTheory01 {

	public static void main(String[] args) {
		// 보조 옵션  return;
				// 1) 메서드를 중간에 종료시키는 보조제어문 
				//  특징) 마치 반복문의 break 와 같다. 
				//      하지만 반복문 break 는 반복문만 종료되고  return 은 함수전체를 종료시킨다. 
				TestReturn1 t1 = new TestReturn1();
				t1.loop1();
				System.out.println("----------------------------------");
				t1.loop2();
					
	}

}
