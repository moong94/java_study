package string_intensify;

import java.util.Scanner;
import java.util.Random;

public class StringEx05 {

	public static void main(String[] args) {
		// ����) ����ܾ� ���߱�
		// ����ܾ ���� * �� ǥ�õȴ�.
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
		// ���� �������ų� ���߸� ����
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
			
		int score = 100;
		String word = "performance";
		String meaning = "����";
		int size = word.length();
		int check[] = new int[size]; // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.
		int count = 0;

		while (true) {
			
			if(score == 0) {
				System.out.println("0���Դϴ�!");
				break;
			}
			
			System.out.println("���� ����  : " + score);
			System.out.println("�� : " + meaning);
			System.out.print("���� : ");
			for (int i = 0; i < size; i++) {
				System.out.print("*");

			}
			System.out.println();
			System.out.println("����ܾ �Է��ϼ��� >>> (��Ʈ üũ�� hint�Է�)");
			String me = scan.next();

			if(me.equals("hint")) {
				System.out.print("��Ʈ : ");
				for(int i = 0 ; i < size; i++) {
					if(check[i] == 1) {
						System.out.print(word.charAt(i));
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
				continue;
			}
					
			else if(me.equals(word)) {
				System.out.println("���� ! ���� : " + score);
				break;
			}
			
			
			if(count == 9) {
				score -= 5;
				continue;
			}
			
			else {
				while(true) {
					int reveal = ran.nextInt(size);
							
					if(check[reveal] == 1) {	
						continue;
					}
					else {
						char ch = word.charAt(reveal);
							for(int i = 0; i < size; i++) {
								if(word.charAt(i) == ch) {
									check[i] = 1;
								}
							}
						break;
					}
				}
				
				score -= 5;
			}
			
			count++;
			
		}
	}

}
