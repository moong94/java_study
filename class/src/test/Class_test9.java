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
		 * #문제9
		알파벳 문자열이 주어질 때, 연속하는 중복 문자를 삭제하려고 합니다. 
		예를 들어, "senteeeencccccceeee"라는 문자열이 주어진다면, "sentence"라는 결과물이 나옵니다.

		영어 소문자 알파벳으로 이루어진 임의의 문자열 characters가 매개변수로 주어질 때, 
		연속하는 중복 문자들을 삭제한 결과를 return 하도록 solution 메소드를 작성하였습니다. 
		그러나, 코드 일부분이 잘못되어있기 때문에, 코드가 올바르게 동작하지 않습니다.
		 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

		---

		#####매개변수 설명
		영어 소문자 알파벳으로 이루어진 임의의
		 문자열 characters가 solution 메소드의 매개변수로 주어집니다. 
		* characters는 알파벳 소문자로만 이루어져있습니다.
		* characters의 길이는 10 이상 100 이하입니다.

		---

		#####return 값 설명
		characters에서 연속하는 중복 문자를 제거한 문자열을 return 해주세요.

		---

		#####예시

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
