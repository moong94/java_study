package static_;

class StaticTest{
	int a;
	static int b;
	int c;
	static void test() {	
		System.out.println(b);
		//System.out.println(a); // a�� c�� ���� ������ �� �Ʊ⶧���� ��ºҰ� 
		//System.out.println(c);
	}
}

public class Static1 {

	public static void main(String[] args) {
		// static Ű����
		// �޸� static ������ ������ִ�.
		// ���α׷� ���۽� �����Ǹ�  �� �Ѱ��� �����ȴ�. 
		// new �� ������ ���������ʴ´�. 
		// �Ʒ� �׸����� ���� 
		
		StaticTest.b = 100;
		StaticTest t = new StaticTest();
		StaticTest t1 = new StaticTest();
		t.a = 101;
		StaticTest.test();
	}

}
