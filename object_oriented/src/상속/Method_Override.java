package ���;

class MethodOverloding{
	void test(int a) {};
	void test(int a , int b) {};
	void test(String a) {};
}
class MethodOverride{
	void test() {
		System.out.println("testParent");
	}
	void overridTest() {
		System.out.println("overridTestParent");
	}
}
class Child extends MethodOverride{
	void overridTest() {
		System.out.println("overridTestChild");
	}
}


public class Method_Override {

	public static void main(String[] args) {
		// 1)�ż��� �����ε� , 2)�ż���������̵� 
		
		// �ż��� �����ε��� ���� �Լ��̸��� ������ ����ϼ��ִ� ����̴�. 
		
		// �޼��� �������̵� �� �θ� �ִ� �޼��带 �ڽ��� �����̸����� ���� ����ϴ°��̴�. 
		Child c = new Child();
		c.test(); // �翬�� �θ��� �޼��带 ����Ҽ��ִ�.
		c.overridTest(); // �θ��� �޼���� ��������ʰ� �ڽ��� �޼��尡 �켱������ ��������.
		
	}

}
