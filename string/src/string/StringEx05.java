package string;

public class StringEx05 {

	public static void main(String[] args) {
		/*
		 * # ����ȯ(type conversion)
		 * 1) �ڷ���(data type)�� �ٲٴ� ���� �ǹ�
		 * 2) (��ȯ�� �ڷ���)����
		 */
		// ���� -> ����
		
				char ch = 'a';
				int aNum = (int)ch;
				System.out.println(aNum);					// 97
				
				//����  -> ����
				ch = (char)(aNum + 1);
				System.out.println(ch);						// b
				
				// ���ڿ� -> ����
				String strNum = "10";
				int num = Integer.parseInt(strNum);
				System.out.println(num + 1);				// 11
				
				// ���� -> ���ڿ�
				// ���1) �ļ�
				strNum = num + "";
				System.out.println(strNum + 1);				// 101
				// ���2) ����
				strNum = String.valueOf(num);
				System.out.println(strNum + 1);				// 101
			

	}

}
