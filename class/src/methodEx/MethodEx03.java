package methodEx;

import java.util.Scanner;
import java.util.Random;

class Test3 {
	void scoreSave(int scores[]){
		Random ran = new Random();
		
		for(int i = 0 ; i < scores.length; i++) {
			int randomNum = ran.nextInt(100) + 1;
			scores[i] = randomNum;
			System.out.print(scores[i] + " ");
		}
	}
	
	void scoreSum(int scores[]) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.print("총점 : " + sum);
	}
	
	void scoreAvg(int scores[]) {
		double sum = 0;
		double avg;
		for(int i = 0; i < scores.length; i++) {
			sum += (double)scores[i];
		}
		avg = sum / scores.length;
		System.out.print("평균 : " + avg);
	}
	
	void scoresPass(int scores[]) {
		int passCount = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 60) {
				passCount++;
			}
		}
		System.out.println("합격자 수 : " + passCount);
	}
	
	void IndextoScores(int scores[], int idx) {
		System.out.println("성적 : " + scores[idx]);
	}
	
	void ScorestoIndex(int scores[], int input) {
		int check = -1;
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == input) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("성적입력 오류");
		}
		else {
			System.out.println("인덱스 : " + check);
		}
	}
	
	void HakbuntoScore(int hakbuns[], int scores[]) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean opt = true;
		while(opt) {
			
			System.out.print("학번 입력 : ");
			int inputHakbun = scan.nextInt();
			
			int check = -1;
		
			for(int i = 0; i < hakbuns.length; i++) {
				if(hakbuns[i] == inputHakbun) {
					check = i;
				}
			}
		
			if(check == -1) {
				System.out.println("없는 학번입니다.");
				opt = false;
			}
	
			else {
				System.out.println("성적 : " + scores[check]);
			}
		
		}
	}
	
	void first(int hakbuns[], int scores[]) {
		int max = 0;
		int maxIdx = -1;
		
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				maxIdx = i;
			}
		}
		System.out.println("1등 학생 : " + hakbuns[maxIdx] + "(" + scores[maxIdx] + "점)");
		
	}

}

public class MethodEx03 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];

		Test3 test = new Test3();
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		test.scoreSave(scores);
		System.out.println();
			
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		test.scoreSum(scores);
		test.scoreAvg(scores);
		System.out.println();

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		test.scoresPass(scores);

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		
		System.out.print("인덱스 입력 : ");
		int inputIdx = scan.nextInt();
		
		test.IndextoScores(scores, inputIdx);

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1

		System.out.print("성적 입력 : ");
		int inputScore = scan.nextInt();
		
		test.ScorestoIndex(scores, inputScore);
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점
		
		test.HakbuntoScore(hakbuns, scores);
		
		
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		
		test.HakbuntoScore(hakbuns, scores);

		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		
		test.first(hakbuns, scores);
		
		
		
	}

}
