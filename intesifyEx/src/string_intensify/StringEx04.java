package string_intensify;

public class StringEx04 {

	public static void main(String[] args) {
		String data = "10001/��ö��/600\n";
		data += "10002/�̿���/800\n";
		data += "10001/��ö��/1400\n";
		data += "10003/���缮/780\n";
		data += "10002/�̿���/950\n";
		data += "10004/�ڸ��/330\n";
		data += "10001/��ö��/670\n";
		data += "10003/���缮/3300\n";
		data += "10002/�̿���/200\n";
		data += "10004/�ڸ��/6800\n";
		data = data.substring(0 , data.length()-1); // ������ �ۻ��� 
		System.out.println(data);
		System.out.println("=====================");
		
		
		String [] tokens = data.split("\n");
		int totalSize = tokens.length;
		
		int numList [] = new int[totalSize];
		String nameList [] = new String[totalSize];
		int priceList[] = new int[totalSize];
		
		for(int i = 0; i < totalSize; i++) {
			String values[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(values[0]);
			nameList[i] = values[1];
			priceList[i] = Integer.parseInt(values[2]);
		}
		
		for(int i = 0; i < totalSize; i++) {
			System.out.println(numList[i] + " " + nameList[i] + " " + priceList[i]);
		}
		System.out.println("=====================");
		
		// ����1) �� ������ ��  ������ ȸ���� ������ �������������� ����� �����̴�.
		//		 �����͸� �Ʒ��� ���� ��� �Ͻÿ� (�� ȸ���� ���� ���� )	
		/*
		  =====================
			10001 ��ö�� 2670
			10002 �̿��� 1950
			10003 ���缮 4080
			10004 �ڸ�� 7130
		   =====================		  
		 */
		
		
		
		int tmp[] = new int[numList.length];
		
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = numList[i];
		}
		
		
		
		for(int i = 0 ; i < totalSize; i++) {
			for(int j = 0; j < i; j++) {
				if(numList[i] == numList[j]) {
					tmp[j] = 0;
				}
				
			}
		}
		int count = 0;
		
		for(int i = 0; i < totalSize; i++) {
			if(tmp[i] != 0) {
				count++;
			}
		}
		
		int newList[] = new int[count];
		int opt = 0;
		
		for(int i = 0; i < totalSize; i++) {
			if(tmp[i] != 0) {
				newList[opt] = tmp[i];
				opt++;
			}
		}
		
		int min = 0;
		
		for(int i = 0; i < newList.length; i++) {
			for(int j = 0; j < i; j++) {
				if(newList[i] < newList[j]) {
					min = newList[j];
					newList[j] = newList[i];
					newList[i] = min;
				}
			}
		}
		
		int sum[] = new int[newList.length];
		
		for(int i = 0; i < totalSize; i++) {
			for(int j = 0; j < newList.length; j++) {
				if(newList[j] == numList[i]) {
					sum[j] += priceList[i];
				}
			}
		}
		
		String newnameList[] = new String[newList.length];
		
		for(int i = 0; i < newnameList.length; i++) {
			for(int j = 0; j < totalSize; j++) {
				if(numList[j] == newList[i]) {
					newnameList[i] = nameList[j];
				}
			}
		}
		
		for(int i = 0 ; i < newList.length; i++) {
			System.out.println(newList[i] + " " + newnameList[i] + " " + sum[i]);
		}
		
		
		
	}

}
