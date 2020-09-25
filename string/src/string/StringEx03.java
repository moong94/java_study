package string;

public class StringEx03 {

	public static void main(String[] args) {

		/*
		 * # ���ڿ�[����]
		 * 1. compareTo() �޼���
		 * 2. 2���� ���ڿ��� ���� int�� ���� ��ȯ�ϴ� �޼���
		 * 3. A.compareTo(B)
		 * 4. ���			 
		 * 
		 * 		A�� B�� ������					0
		 *      A�� B���� ���������� ������ ���̸�		����
		 *      A���� B�� ���������� ������ ���̸�		���
		 *      
		 */

		String str1 = "��";
		String str2 = "��";
		String str3 = "��";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// ����
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// ���
		
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0
		
		// ���� ) ���� ������ �̸� ����
		String[] names = {"ȫ�浿", "������", "������", "�ڹ�ŷ", "������"};
		
		
		String tmp = null;
		
		int first = 0;
		
		for(int i = 0; i < names.length; i++) {
			for(int j = 0; j < names.length; j++) {
				first = i;
				if(names[j].compareTo(names[first]) > 0) {
					first = j;
				}
				
				tmp = names[i];
				names[i] = names[first];
				names[first] = tmp;				
			}
		}
		
		for(int i = 0 ; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
	}

}
