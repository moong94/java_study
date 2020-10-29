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
	
	
	//주소형식을 String형식으로 나타내주는 메소드
	@Override // 마크를 붙여주면 확실히 확인가능하다. 
	public String toString() {
		String str = "";
		str += "===============================================================\n";
		str += "  번호  이름  java  jsp  spring  총점  평균  석차  \n";
		str += "===============================================================\n";
		
//		석차를 계산한다.
		for(int i=0 ; i<scoreList.size()-1 ; i++) {
			for(int j=i+1 ; j<scoreList.size() ; j++) {
				if(scoreList.get(i).getTotal() > scoreList.get(j).getTotal()) {
//					i번째 총점이 크면 j번째 석차를 증가시킨다.
					scoreList.get(j).setRank(scoreList.get(j).getRank() + 1);
				}
				if(scoreList.get(i).getTotal() < scoreList.get(j).getTotal()) {
//					j번째 총점이 크면 i번째 석차를 증가시킨다.
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
	
//	ArrayList에 인수로 넘겨받은 성적을 추가하는 메소드
	public void addScore(Score vo) {
		scoreList.add(vo);
	}
}
