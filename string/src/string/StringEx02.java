package string;

import java.util.Scanner;

public class StringEx02 {

	public static void main(String[] args) {
		/*
		 * # ���ڿ� [��]
		 * . ���ڿ� �񱳴� equals() �޼��带 ���� Ȯ���� �� �ִ�.
		 */
		Scanner scan = new Scanner(System.in);
		
		String name = "ȫ�浿";

		System.out.print("�̸��� �Է��ϼ��� : ");
		String myName = scan.next();
		
		if(name == myName) {
			System.out.println("== ������ : ��ġ");
		}else {
			System.out.println("== ������ : ����ġ");
		}
		
		if(name.equals(myName)) {
			System.out.println("equals() �޼��� : ��ġ");
		}else {
			System.out.println("equals() �޼��� : ����ġ");
		}

	}

}
