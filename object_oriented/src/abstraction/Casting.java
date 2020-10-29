package abstraction;

class Base {
	String name;
	public void say() {
		System.out.println(name + "님 안녕하세요");
	}
}

class Sub extends Base {
	int age;
	@Override
	public void say() {
		System.out.println(name + "님은 " + age + "살 입니다.");
	}
}

public class Casting {

	public static void main(String[] args) {
		Base base = new Base();
		Sub sub = new Sub();
		
		// --- 클래스 형변화  ---
		// [1]base 변수는 new 할때 Base 에있는 내용만 생성된다. 
		// [2]반면, sub 변수는 new 할때 Base 와 Sub 이 둘다 생성된다. 
		// 결국, 
		// [3] sub은  Base 로 형변환가능하고, 		
		// [4] base 는 Sub 으로 형변환 불가능하다.	
				
		// === 아래 결과 === 	
		Base test1 = (Base)sub; // sub은 둘다 가지고있기때문에 가능하다.
		//Sub test2 = (Sub)base; //base는 한개만가지고있다. 에러가난다. 
		
		// === instanceof ===
		// 안전하게 instanceof 함수를 사용할수있다.
		
		Base baseTest = null;
		Sub subTest = null;
		if(sub instanceof Base) { // sub 안에는 Base 가있다. 
			 baseTest = (Base) sub; // 가능하다.
			 System.out.println("형변환 가능 1");
		}else {
			System.out.println("형변환 불가 1 ");
		}
		
		if(base instanceof Sub) { // base 안에는 Sub 이없다.
			 subTest = (Sub) base;  // 불가능하다.
			 System.out.println("형변환 가능 2"); 
		}else {
			System.out.println("형변환 불가 2");
		}
	}

}
