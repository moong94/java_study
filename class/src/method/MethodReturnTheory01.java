package method;

class TestReturn1{
	void loop1() {
		for(int i =0; i < 10; i++) {
			if(i == 5) {
				System.out.println("����");
				 break; 			
			}
			System.out.println("loop1 ==> i : " + i);
		}
		System.out.println("������� loop1");
	}
	void loop2() {
		for(int i =0; i < 10; i++) {
			if(i == 5) {
				System.out.println("����");
				return;
			}
			System.out.println("loop2 ==> i : " + i);
		}
		System.out.println("������� loop2");
	}
}

public class MethodReturnTheory01 {

	public static void main(String[] args) {
		// ���� �ɼ�  return;
				// 1) �޼��带 �߰��� �����Ű�� ������� 
				//  Ư¡) ��ġ �ݺ����� break �� ����. 
				//      ������ �ݺ��� break �� �ݺ����� ����ǰ�  return �� �Լ���ü�� �����Ų��. 
				TestReturn1 t1 = new TestReturn1();
				t1.loop1();
				System.out.println("----------------------------------");
				t1.loop2();
					
	}

}
