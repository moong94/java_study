package test;

public class Main {
	public static void main(String args[]) {
		ScoreList scoreList = new ScoreList();	
				
		scoreList.addScore(new Score("ȫ�浿", 100, 100, 99));
		scoreList.addScore(new Score("�Ӳ���", 88, 75, 91));
		scoreList.addScore(new Score("����", 65, 74, 69));
		scoreList.addScore(new Score("������", 85, 78, 91));
		scoreList.addScore(new Score("�̸���", 89, 58, 73));
		
		System.out.println(scoreList);
	}

}
