package test;

public class Class_test9 {
	
	public String solution(String characters){
        String result = "";
        
        char chararr[] = new char[characters.length()];
        
        for(int i = 0; i < characters.length(); i++) {
        	chararr[i] = characters.charAt(i);
        }
        
        result += chararr[0];
        for(int i = 1; i < chararr.length; i++) {
        	if(chararr[i] != chararr[i - 1]) {
        		result += chararr[i];
        	}
        }
        
     
        return result;
    }

	public static void main(String[] args) {
		/*
		 * #����9
		���ĺ� ���ڿ��� �־��� ��, �����ϴ� �ߺ� ���ڸ� �����Ϸ��� �մϴ�. 
		���� ���, "senteeeencccccceeee"��� ���ڿ��� �־����ٸ�, "sentence"��� ������� ���ɴϴ�.

		���� �ҹ��� ���ĺ����� �̷���� ������ ���ڿ� characters�� �Ű������� �־��� ��, 
		�����ϴ� �ߺ� ���ڵ��� ������ ����� return �ϵ��� solution �޼ҵ带 �ۼ��Ͽ����ϴ�. 
		�׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, �ڵ尡 �ùٸ��� �������� �ʽ��ϴ�.
		 �־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� �ùٸ��� �����ϵ��� �����ϼ���.

		---

		#####�Ű����� ����
		���� �ҹ��� ���ĺ����� �̷���� ������
		 ���ڿ� characters�� solution �޼ҵ��� �Ű������� �־����ϴ�. 
		* characters�� ���ĺ� �ҹ��ڷθ� �̷�����ֽ��ϴ�.
		* characters�� ���̴� 10 �̻� 100 �����Դϴ�.

		---

		#####return �� ����
		characters���� �����ϴ� �ߺ� ���ڸ� ������ ���ڿ��� return ���ּ���.

		---

		#####����

		| characters                  | return    |
		|-------------------------|-----------|
		| "senteeeencccccceeee" | "sentence" |

		 */
		
		Class_test9 sol = new Class_test9();
        String characters = "senteeeencccccceeee";
        String ret = sol.solution(characters);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
	}

}
