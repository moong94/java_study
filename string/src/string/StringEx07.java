package string;

public class StringEx07 {

	public static void main(String[] args) {
		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int[] arr = new int[3];
		
		String spstr[] = str.split("/");
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(spstr[i]);
			sum += arr[i];
		}
		System.out.println(sum);
		
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
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
