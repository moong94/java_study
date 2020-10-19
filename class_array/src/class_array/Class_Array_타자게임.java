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
	boolean[] checkList = new boolean[wordSampleList.length]; //  �̹̼����Ѵܾ� üũ�� 
	int count = wordSampleList.length; // �ܾ� ����(���������ī��Ʈ)
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

public class Class_Array_Ÿ�ڰ��� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		WordSample wSample = new WordSample();
		Word[] wordList = new Word[wSample.wordSampleList.length];

		for (int i = 0; i < wordList.length; i++) {
			wordList[i] = new Word();
		}
		boolean run = true;
		int index = 0;
		
		long beforeTime = System.currentTimeMillis(); //�ڵ� ���� ���� �ð� �޾ƿ���		
		while (run) {		
			wordList[index].setRandomWordPos(wSample.getRandomWord());
			while (true) {						
				wordList[index].printWord();
				System.out.println("�ܾ �Է��ϼ��� >>> ");
				String inputWord = scan.next();
				if (inputWord.equals(wordList[index].word)) {
					System.out.println("�����Դϴ�.");
					break;
				}else {
					System.out.println("��");
				}
			}
			if (wSample.count == 0) {
				long afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
				double secDiffTime = (afterTime - beforeTime) / 1000.0; //�� �ð��� �� ���
				System.out.println("���  : "+secDiffTime + "��");
				System.out.println("��������");
				break;
			}
		}
		scan.close();
	}

}
