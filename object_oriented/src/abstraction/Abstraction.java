package abstraction;

//�߻�ȭ ==> �θ�Ŭ������ ��ӹ���  �ڽ�Ŭ������  Ư���޼��带 ���鵵�� �����ϴ°� 
//abstract ��ġ ==> 1. Ű���� ������ �޼��� �տ� �� 2. Ŭ���� �տ� �ٿ��ش�.
class A{
	int a;
	void test() {
	}
}
class B extends A{
	int b;
}
abstract class C{ // 1) abstract Ŭ���� �տ� �ٿ��� 
	int c;
	abstract void test();  // 2) abstract �޼��� �տ� �ٿ��� (�̸�������� ������ �ڽ����Ѵ�.)
}
class D extends C{
	int d;
	void test() { // ������ �������ϴ� �޼���
		
	}
}

public class Abstraction {

	public static void main(String[] args) {

	}

}
