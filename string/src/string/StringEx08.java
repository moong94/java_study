package string;

public class StringEx08 {

	public static void main(String[] args) {

		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		String sp[] = str.split(",");
		
		for(int i = 0; i < sp.length; i++) {
			
			String spsub[] = sp[i].split("/");
			name[i] = spsub[0];
			score[i] = Integer.parseInt(spsub[1]);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(name[i] + "&" + score[i]);
		}

	}

}
