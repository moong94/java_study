package ���;

class Parent{

	void test() {
		System.out.println("testParent()");
	}
}
class ChildTest extends Parent{

	void test() {
		// �ڽ��� ������ �Լ��� �θ��� ������ �Լ��� �̸��� ���ٸ� super�� �����ϸ�ȴ�. 
		super.test(); // �ڽ� �Լ����� �θ��� test�� �� �����Ű��ʹٸ� super�� ����Ѵ�.
		System.out.println("testChild()");
	}
}

public class Super {

	public static void main(String[] args) {
		ChildTest child = new ChildTest();
		child.test();
	}

}
