package test;

public class Main {
	public static void main(String args[]) {
		ScoreList scoreList = new ScoreList();	
				
		scoreList.addScore(new Score("È«±æµ¿", 100, 100, 99));
		scoreList.addScore(new Score("ÀÓ²©Á¤", 88, 75, 91));
		scoreList.addScore(new Score("Àå±æ»ê", 65, 74, 69));
		scoreList.addScore(new Score("ÀÏÁö¸Å", 85, 78, 91));
		scoreList.addScore(new Score("ÀÌ¸ù·æ", 89, 58, 73));
		
		System.out.println(scoreList);
	}

}
