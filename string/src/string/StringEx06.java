package string;

import java.sql.Date;

public class StringEx06 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// ���� 1) ���� ���
		// ���� 1) 30��
		
		String year = jumin.substring(0,2);
		
		int age = Integer.parseInt(year);
		System.out.println((2020 - age - 1899) + "��" );
		
		// ���� 2) ���� ���
		// ���� 2) ����
		
		char sex = jumin.charAt(7);
		
		if(sex == '1' || sex == '3') {
			System.out.println("����");
		}
		else if(sex == '2' || sex == '4') {
			System.out.println("����");
		}
	}

}
