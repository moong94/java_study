package test;

public class Class_test8 {
	
	boolean solution(String sentence) {
		String str = "";
		
		char data[] = new char[sentence.length()];
		int cnt = 0;
		
		
		for(int i = 0; i < sentence.length(); i++) {
			data[i] = sentence.charAt(i);
		}
		for(int i = 0; i < data.length; i++) {
			if(data[i] != ' ' && data[i] != '.') {
				str += data[i];
			}
		}
		
		int j = str.length();
		String tmp = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			tmp += str.charAt(i);
		}
		
		if(tmp.equals(str)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		/*
		 * #����8
		�տ������� ���� ���� �ڿ������� ���� �� �Ȱ��� �ܾ� �Ǵ� ������ 
		�Ӹ����(palindrome)�̶�� �մϴ�. ���� �� racecar, noon�� �Ӹ���� �ܾ��Դϴ�. 

		�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ������ 
		�Ӹ���� �������� �����Ϸ� �մϴ�. ���� ������ ���ĺ��� 
		�����Ͽ��� ���� �Ӹ���� �ܾ��̸� �Ӹ���� �����Դϴ�.
		 ���� ���, "Never odd or even."�� ���� ������ �Ӹ�����Դϴ�.

		�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ����
		 sentence�� �־��� �� �Ӹ�������� �ƴ����� return �ϵ��� solution �޼ҵ带 �ۼ��߽��ϴ�.
		 �׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, ��� �Է¿� ���ؼ��� �ùٸ��� �������� �ʽ��ϴ�.
		 �־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� �ùٸ��� �����ϵ��� �������ּ���.

		---
		##### �Ű����� ����
		�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ����
		 sentence�� solution �޼ҵ��� �Ű������� �־����ϴ�.

		* sentence�� ���̴� 1�̻� 100�����Դϴ�.
		* sentence���� ��� �ϳ��� ���ĺ��� ���ԵǾ� �ֽ��ϴ�.
		* setntence�� �� ���ڴ� �ҹ��� ���ĺ�, ����(" "), �Ǵ� ��ħǥ(".")�Դϴ�.

		---
		##### return �� ����
		�־��� ������ �Ӹ�������� �ƴ����� return ���ּ���.

		---
		##### ����

		| sentence             	| return 	|
		|----------------------	|--------	|
		| "never odd or even." 	| true   	|
		| "palindrome"         	| false  	|


		##### ���� ����
		���� #1
		���ĺ��� ���ڸ� �����Ͽ� �ҹ��ڷ� ��ȯ�غ��� "neveroddoreven"�� �Ǹ� �� �ܾ�� �Ӹ�����Դϴ�.

		���� #2
		������ �� �� ������ "p"�� �� �� ������ "e"�� �ٸ��Ƿ� �Ӹ������ �ƴմϴ�.


		 */
		
		Class_test8 sol = new Class_test8();
		String sentence1 = "never odd or even.";
		boolean ret1 = sol.solution(sentence1);
		System.out.println("�� : " + ret1 + " .");

		String sentence2 = "palindrome";
		boolean ret2 = sol.solution(sentence2);
		System.out.println("�� : " + ret2 + " .");
	
	}

}
