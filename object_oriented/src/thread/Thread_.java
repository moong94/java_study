package thread;


import java.util.Scanner;

class BGMPlay extends Thread {
    boolean play = true;
    
	@Override
	public void run() {
		
		while(play) {
			System.out.println("배경 음악이 연주되는중.....");
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		
	}
}

public class Thread_ {

	public static void main(String[] args) {
		// === 쓰래드 ===	
		// 원래 프로그램 이외 별도로 동작하는 프로그램을 말한다. 
		// 채팅이나, 로딩화면 , 배경음악 , 스탑와치 등에 쓰이며 메인프로그램에 방해받지않고 독립적으로 돌아간다.
		// 완전히 독립적이므로 순서는 조금 달라질수있다. 
		
		// 사용하는법 
		// 1) Thread 를 상속받클래스를 생성후 
		// 2) Thread를 상속받은 클래스는 run() 메서드를 구현한다.
		// 3) start() 로 실행시킨다. start 가실행후 run 이 실행됨.
		BGMPlay bgmPlay = new BGMPlay();	
		bgmPlay.start();
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("신나게 게임을 하는 중.....");
			if(i == 8) {
				System.out.println("앗... 엄마다!!!");
				System.out.println("엄마가 오셔서 게임을 종료합니다. ㅜㅜ");

	            bgmPlay.play = false;
				break;
			}
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}

}
