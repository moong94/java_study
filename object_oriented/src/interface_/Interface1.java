package interface_;
abstract class AA {
	abstract void test1(); // �߻�ȭ Ŭ������ abstract �� ���ΰͰ� 
	void test2() {}		 //  �Ⱥ��� �޼��带 ��� ������ִ�.
}
class BB extends AA{
	void test1() {	  // ���� �ڽ�Ŭ���������� abstract ���پ��ִ� �޼���� ���������Ѵ�.
	}
}


interface EE{
	public void test3();
}
interface CC{
	public void test1();
	
	public void test2();
}

class DD implements CC , EE {
	public void test1() {
		System.out.println("a");
	
	}  // interface �� ����ϸ� �޼��带 ������ ���������Ѵ�.
	public void test2() {}
	public void test3() {}
}
// �������̽�(Interface) Ŭ����
// �������̽��� �߻�Ŭ�������� �� �߻�ȭ�� Ŭ���� (���ΰ���)
//  1. ���� ������ ���� �������� �⺻ ���赵.
//  2. ����� �߻� �޼��常 ����� ���´�.
//  3. �ν��Ͻ��� �����Ҽ� ���� , Ŭ���� �ۼ��� ������ �ٸ�������
//      ���Ǵ� Ŭ����
//  4. ���߻���� �����ϴ�.

public class Interface1 {

	public static void main(String[] args) {
		DD d = new DD();
		d.test1();
	}

}
