package string;

import java.util.Random;
import java.util.Scanner;

public class StringEx10 {

	public static void main(String[] args) {

		/*
		* # Ÿ�ڿ��� ����[1�ܰ�]
		* 1. ������ ���´�.(shuffle)
 		* 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
 		* ��)
 		* ���� : mysql
 		* �Է� : mydb
 		* ���� : mysql
 		* �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
 		* ���� : jsp
 		*/
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		//����
		for(int i = 0; i < 1000; i++) {
			int suffle = ran.nextInt(words.length);
			String tmp = words[0];
			words[0] = words[suffle];
			words[suffle] = tmp;
		}
		
		for(int i = 0; i < words.length; i++) {
			System.out.println("���� : " + words[i]);
			System.out.print("�Է� : ");
			String input = scan.next();
			
			if(words[i].equals(input)) {
				continue;
			}
			else {
				i--;
			}
		}
		
		
	}

}
