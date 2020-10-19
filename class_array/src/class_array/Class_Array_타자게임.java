package class_array;

import java.util.Random;
import java.util.Scanner;

class Word {
	Random ran = new Random();
	String word;
	int ranPos;
	void setRandomWordPos(String sample) {			
		word = sample;
		int r = ran.nextInt(word.length());
		ranPos = r;
	}
	void printWord() {
		for (int i = 0; i < word.length(); i++) {
			if (i == ranPos) {
				System.out.print("*");
			} else {
				System.out.print(word.charAt(i));
			}
		}
		System.out.println();
	}
}

class WordSample {
	Random ran = new Random();
	String[] wordSampleList = { "java", "jsp", "python", "android", "spring" };
	boolean[] checkList = new boolean[wordSampleList.length]; //  이미선택한단어 체크용 
	int count = wordSampleList.length; // 단어 개수(게임종료용카운트)
	String getRandomWord() {
		int r = 0;
		while(true) {
			r = ran.nextInt(wordSampleList.length);
			if(checkList[r] == false) {
				checkList[r] = true;
				count -= 1;
				break;
			}
		}
		return wordSampleList[r];
	}
}

public class Class_Array_타자게임 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		WordSample wSample = new WordSample();
		Word[] wordList = new Word[wSample.wordSampleList.length];

		for (int i = 0; i < wordList.length; i++) {
			wordList[i] = new Word();
		}
		boolean run = true;
		int index = 0;
		
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기		
		while (run) {		
			wordList[index].setRandomWordPos(wSample.getRandomWord());
			while (true) {						
				wordList[index].printWord();
				System.out.println("단어를 입력하세요 >>> ");
				String inputWord = scan.next();
				if (inputWord.equals(wordList[index].word)) {
					System.out.println("정답입니다.");
					break;
				}else {
					System.out.println("땡");
				}
			}
			if (wSample.count == 0) {
				long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
				double secDiffTime = (afterTime - beforeTime) / 1000.0; //두 시간에 차 계산
				System.out.println("기록  : "+secDiffTime + "초");
				System.out.println("게임종료");
				break;
			}
		}
		scan.close();
	}

}
