package string;

import java.util.Scanner;

public class StringEx13 {

	public static void main(String[] args) {
		/*
		 * # ���ڿ� ��
		 * . equals() �޼��� ������ ������ ��ġ���� ��
		 * ��)
		 * �ڳ���
		 * �Է� = Ƽ�����罺
		 * ��� = false
		 */
		Scanner scan = new Scanner(System.in);
		
		String name = "�ڳ���";
		
		while(true) {
			System.out.print("���� �̸��� �Է��ϼ��� : ");			// ex) Ƽ�����罺
			String myName = scan.next();

			int cnt = 0;
			
			if(name.length() != myName.length()) {
				System.out.println("false");
				break;
			}
			else {
				for(int i = 0; i < name.length(); i++) {
					char ch = name.charAt(i);
					char mych = myName.charAt(i);
					
					if(ch == mych) {
						cnt++;
					}
				}
				
			}
			if(cnt == name.length()) {
				System.out.println("true");
				break;
			}
		}
		

	}

}
