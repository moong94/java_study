package string;

public class StringEx04 {

	public static void main(String[] args) {
		/*
		 * # ���ڿ�(= ������ �迭)
		 * 1. ���ڿ��� "������ �迭"�� ���Ӹ�
		 * 2. 0������ �����ϴ� ��ȣ�� �ο�(index)
		 */
//		  012345
	String str = "megait";
	System.out.println(str);

	// [1] ������ ���� : length()
	int size = str.length();
	System.out.println(size);					// 6
	
	// [1] ���� �Ѱ� ����(�ε���) : charAt(index)
	char ch = str.charAt(0);
	System.out.println(ch);						// m
	ch = str.charAt(size - 1);
	System.out.println(ch);						// t
	
	// [2] ���� ������ ����(�����̽�)
	// 1) substring(index1, index2)
	//    �������� �������� �ʴ´�. (index1���� index2 �̸�����)
	String rs = str.substring(4, 6);
	System.out.println(rs);						// it
	
	// 2) substring(index)
	//    index���� ���ڿ� ������
	rs = str.substring(4);
	System.out.println(rs);						// it
	
	// [3] �����ڷ� �߶󳻱�(split)
	str = "hello,java,android";
	String[] ar = str.split(",");
	System.out.println(ar.length);				// 3
	System.out.println(ar[0]);					// hello
	System.out.println(ar[1]);					// java
	System.out.println(ar[2]);					// android
	
	}

}
