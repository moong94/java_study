package test;

import java.util.ArrayList;

public class ScoreList {
	private ArrayList<Score> scoreList = new ArrayList<>();

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}
	
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	
	//�ּ������� String�������� ��Ÿ���ִ� �޼ҵ�
	@Override // ��ũ�� �ٿ��ָ� Ȯ���� Ȯ�ΰ����ϴ�. 
	public String toString() {
		String str = "";
		str += "===============================================================\n";
		str += "  ��ȣ  �̸�  java  jsp  spring  ����  ���  ����  \n";
		str += "===============================================================\n";
		
//		������ ����Ѵ�.
		for(int i=0 ; i<scoreList.size()-1 ; i++) {
			for(int j=i+1 ; j<scoreList.size() ; j++) {
				if(scoreList.get(i).getTotal() > scoreList.get(j).getTotal()) {
//					i��° ������ ũ�� j��° ������ ������Ų��.
					scoreList.get(j).setRank(scoreList.get(j).getRank() + 1);
				}
				if(scoreList.get(i).getTotal() < scoreList.get(j).getTotal()) {
//					j��° ������ ũ�� i��° ������ ������Ų��.
					scoreList.get(i).setRank(scoreList.get(i).getRank() + 1);
				}
			}
		}
		
		for(Score vo : scoreList) {
			str += vo + "\n";
		}
		
		str += "===============================================================\n";
		return str;
	}
	
//	ArrayList�� �μ��� �Ѱܹ��� ������ �߰��ϴ� �޼ҵ�
	public void addScore(Score vo) {
		scoreList.add(vo);
	}
}
