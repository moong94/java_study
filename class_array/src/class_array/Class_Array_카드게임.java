package class_array;

import java.util.Random;

class Card{
	String shape;
	int number;
	void printCard() {
		System.out.println(shape + " : " + number);
	}
}

class CardPlayer{
	Card card1;
	Card card2;
	int sum;
}

public class Class_Array_카드게임 {

	public static void main(String[] args) {

		// 카드게임 
		// 1) 카드모양 : 다이아 , 하트 , 스페이드 , 클로버
		// 2) 숫자      :  1~10
		// 3) 총 40장이 있다. 
		// 4) 2장씩 나눠갖은 다음 , 각 카드의 숫자의 합이 큰쪽이 이긴다. (직접만들기)
		Random ran = new Random();
		CardPlayer aaa = new CardPlayer();
		CardPlayer bbb = new CardPlayer();
		String shapeList[] = {"다이아" , "하트" , "스페이드" , "클로버"};
		int size= 40;
		Card deck[] = new Card[size];
		for(int i = 0; i < size; i++) {
			deck[i] = new Card();
//			deck[i].shape = shapeList[i%4];
//			
//			deck[i].number = i % 10 + 1;
		}	
		
		for(int i = 0; i < shapeList.length; i++) {
			for(int j = 0 ; j < 10; j++) {
				deck[(i * 10) + j].shape = shapeList[i];
				deck[(i * 10) + j].number = j + 1;
			}
		}
		
		// 셔플
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(size);
			Card temp = deck[0];
			deck[0] = deck[r];
			deck[r] = temp;
		}

		aaa.card1 = deck[0];
		aaa.card2 = deck[1];	
		bbb.card1 = deck[2];
		bbb.card2 = deck[3];
		
		aaa.sum = aaa.card1.number + aaa.card2.number;
		bbb.sum = bbb.card1.number + bbb.card2.number;
		
		aaa.card1.printCard();
		aaa.card2.printCard();	
		bbb.card1.printCard();
		bbb.card2.printCard();		
		
		if(aaa.sum > bbb.sum) {
			System.out.println("p1 승리");
		}
		else if(bbb.sum > aaa.sum) {
			System.out.println("p2 승리");
		}
		else if(aaa.sum == bbb.sum) {
			System.out.println("무승부");
		}
						
	}

}
