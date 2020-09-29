package string;

public class StringEx07 {

	public static void main(String[] args) {
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		
		String spstr[] = str.split("/");
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(spstr[i]);
			sum += arr[i];
		}
		System.out.println(sum);
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		for(int i = 0; i < scores.length; i++) {
			text += String.valueOf(scores[i]);
			if(i != scores.length - 1) {
				text += "/";
			}
		}
		
		System.out.println(text);
		
	}

}
