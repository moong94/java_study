package constructor;

class Fruit {
	String name;
	int price;

	// �⺻������
	Fruit() {
	}

	// ������ �����ε�(overloading)
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void printData() {
		System.out.println(name + "(" + price + "��)");
	}
}

public class Class_Array_Constructor_Overloading2 {

	public static void main(String[] args) {
		// ������ �����ε�
		// �����ڵ� �޼����̱⶧���� �����̸����� ������ ������ִ�.
		// �� �ٸ� �޼��� �� ���������� ���޵Ǵ� ���ڰ��� ���� �ٸ��� �ϸ�ȴ�.
		Fruit apple = new Fruit();
		// .���� ������ ������� �ʱ�ȭ
		apple.name = "���";
		apple.price = 1000;

		// �޼��带 ����� ������� �ʱ�ȭ
		apple.setData("���", 1000);
		apple.printData();

		// �����ڸ� Ȱ���� ������� �ʱ�ȭ
		Fruit banana = new Fruit("�ٳ���", 3700);
		banana.printData();

	}

}
