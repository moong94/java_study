package wrapper_class;

class MyInteger {
	int a;
	MyInteger(int a) {
		this.a = a;
	}
}

public class Wrapper_Class {

	public static void main(String[] args) {
		/*
		* # ���� Ŭ����(wrapper class)
		* - ���� Ŭ������, �⺻ �ڷ����� Ŭ������ ����� ���� ���� �ǹ��Ѵ�.
		* [�⺻��]          [���� Ŭ����]
		* byte             Byte
		* short            Short
		* int              Integer
		* long             Long
		* float            Float
		* double           Double
		* char             Character
		* boolean          Boolean
		*/
		
		int a = 10;
		Integer i = new Integer(10);
		System.out.println(i);
		
		float b = 10.1f;
		Float f = new Float(10.1);
		System.out.println(f);
		
		double d = 10.11;
		Double dd = new Double(10.11);
		System.out.println(dd);
		
		MyInteger ii = new MyInteger(100);
		System.out.println(ii.a);
	}

}
