package ���;

class A {
	int aa;
}

class B extends A {
	int bb;
}

class C {
	A a = new A();
	int cc;
}


public class ���1 {

	public static void main(String[] args) {
		// ����̶�?
		// B ��� Ŭ���� �� A Ŭ������ ��ӹ�����
		// B �� new �� �Ҷ� AŬ������ ���� �����ȴ�.

		// ��ӹ޴¹�
		// 1) class B ���� extends �θ�Ŭ����
		
		B b = new B(); // B�� A�� ��ӹ޾����Ƿ� aa , bb �Ѵ� ��밡���ϴ�.
		b.aa = 100;
		b.bb = 200;
		// ��ӹ����ʰ� ��Ӱ��� ���踸���
		// C�� A�� ��ӹ����ʾ����� ���ο� ������ ���� ���� ��ӹ����Ͱ� ������Ȳ�̳� 
		// .�� 2�� �����Ѵ�. 
		C c = new C();
		c.cc = 100;
		c.a.aa = 200; // �̿Ͱ��� . �� 2�������Ѵ�.
		
	}

}
