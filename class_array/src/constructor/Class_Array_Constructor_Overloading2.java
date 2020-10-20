package constructor;

class Fruit {
	String name;
	int price;

	// 기본생성자
	Fruit() {
	}

	// 생성자 오버로딩(overloading)
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void printData() {
		System.out.println(name + "(" + price + "원)");
	}
}

public class Class_Array_Constructor_Overloading2 {

	public static void main(String[] args) {
		// 생성자 오버로딩
		// 생성자도 메서드이기때문에 같은이름으로 여러개 만들수있다.
		// 단 다른 메서드 와 마찬가지로 전달되는 인자값을 서로 다르게 하면된다.
		Fruit apple = new Fruit();
		// .으로 접근해 멤버변수 초기화
		apple.name = "사과";
		apple.price = 1000;

		// 메서드를 만들어 멤버변수 초기화
		apple.setData("사과", 1000);
		apple.printData();

		// 생성자를 활용해 멤버변수 초기화
		Fruit banana = new Fruit("바나나", 3700);
		banana.printData();

	}

}
