package string;

public class StringEx08 {

	public static void main(String[] args) {

		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
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
