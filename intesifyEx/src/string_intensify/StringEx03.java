package string_intensify;

public class StringEx03 {

	public static void main(String[] args) {
		String nameData = "";
		nameData+=	"100001/�̸���";nameData += "\n";		
		nameData += "100002/�̿���";nameData += "\n";
		nameData += "100003/���缮";nameData += "\n";
		nameData += "100004/�ڸ��";nameData += "\n";
		nameData += "100005/�ֿ���";nameData += "\n";
		nameData += "100006/�ں���";
		
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";
		
		
		// ����) moneyData �� nameData �� �����ؼ� �Ʒ��Ͱ��� ��������
		String userData = "";
		
		String[] nameDatasplit = null;
		nameDatasplit = nameData.split("\n");
		
		String[][] nameDatasplit2 = new String[nameDatasplit.length][2];
		
		String[] moneyDatasplit = null;
		moneyDatasplit = moneyData.split("\n");
		
		String[][] moneyDatasplit2 = new String[moneyDatasplit.length][2];
		
		for(int i = 0; i < nameDatasplit.length; i++) {
			String[] tmp_name = nameDatasplit[i].split("/");

			nameDatasplit2[i][0] = tmp_name[0];
			nameDatasplit2[i][1] = tmp_name[1];
			
		}
		
		for(int i = 0; i < moneyDatasplit.length; i++) {
			String[] tmp_money = moneyDatasplit[i].split("/");

			moneyDatasplit2[i][0] = tmp_money[0];
			moneyDatasplit2[i][1] = tmp_money[1];
			
		}
		
		
		
		for(int i = 0; i < moneyDatasplit2.length; i++) {
			for(int j = 0; j < nameDatasplit2.length; j++) {
				if(moneyDatasplit2[i][0].equals(nameDatasplit2[j][0])) {
					userData += nameDatasplit[j] + "/" + moneyDatasplit2[i][1] + "\n";
				}
			}
		}
		
		System.out.println(userData);
		
		/*
		 * 100001/�̸���/600
		 * 100003/���缮/7000
		 * 100001/�̸���/100
		 * 100002/�̿���/400
		 * 100001/�̸���/600
		 * 100004/�ڸ��/900
		 * 100001/�̸���/130
		 * 100003/���缮/200
		 * 100002/�̿���/700
		 * 100002/�̿���/900
		 * 100004/�ڸ��/800
		 */

	}

}
