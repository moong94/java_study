package string;

import java.util.Random;
import java.util.Scanner;

public class StringEx12 {

	public static void main(String[] args) {
		/*
		 * # Ÿ�ڿ��� ����[2�ܰ�]
		 * 1. ������ ���´�.(shuffle)
		 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
		 * ��)
		 * ���� : mys*l
		 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		 * ���� : *sp
		 * �Է� : jsp
		 * ...
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
			System.out.print("���� : ");
			
			int star = ran.nextInt(words[i].length());
			
			String temp = "";
			
			for(int j = 0; j < words[i].length();j++) {
				if(j == star) {
					temp += "*";
				}
				else {
					temp += words[i].charAt(j);
				}
			}
			System.out.println(temp);
			
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
