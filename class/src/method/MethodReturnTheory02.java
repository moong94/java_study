package method;

class TestReturn2{
	int result;
	void plus1(int a , int b) {
		result = a + b;
	}
	
	int plus2(int a , int b) {
		// result ������ ��� ����� ������ִ�. 
		return a + b;
	}
}

public class MethodReturnTheory02 {
		public static void main(String[] args) {
			// ������ �����  (2)	
			// return �ż��带 ����ϸ� Ŭ�������� �����Ѱ��� ���ϼ��ִ�.
			// ���� �����ʾƵ� ���α׷� ����µ��� �ƹ��������� ����. 
			// ������ ���α׷����� �ɼ������� �ڿ������ԵǴµ�
			// ������ ����� �ٸ� ����̸��� ���α׷�� �ͼ��� �������ؼ� ������ ������ �غ��ڴ�. 
			
			// ���ϸ޼��� ����¹� 
			// 1) int 					   ==> main ���� ���� �ڷ��� 
			// 2) plus2(int a , int b)     ==> �̸� 
			// 3) { return + ������ �� }      ==> �̰��� main ���� ��������.   
			
			TestReturn2 t1 = new TestReturn2();
			t1.plus1(10, 3);
			System.out.println(t1.result);
			
			System.out.println("---------------------------");
			int result = t1.plus2(10, 3);
			System.out.println(result);
	}

}
