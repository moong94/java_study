package thread;


import java.util.Scanner;

class BGMPlay extends Thread {
    boolean play = true;
    
	@Override
	public void run() {
		
		while(play) {
			System.out.println("��� ������ ���ֵǴ���.....");
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		
	}
}

public class Thread_ {

	public static void main(String[] args) {
		// === ������ ===	
		// ���� ���α׷� �̿� ������ �����ϴ� ���α׷��� ���Ѵ�. 
		// ä���̳�, �ε�ȭ�� , ������� , ��ž��ġ � ���̸� �������α׷��� ���ع����ʰ� ���������� ���ư���.
		// ������ �������̹Ƿ� ������ ���� �޶������ִ�. 
		
		// ����ϴ¹� 
		// 1) Thread �� ��ӹ�Ŭ������ ������ 
		// 2) Thread�� ��ӹ��� Ŭ������ run() �޼��带 �����Ѵ�.
		// 3) start() �� �����Ų��. start �������� run �� �����.
		BGMPlay bgmPlay = new BGMPlay();	
		bgmPlay.start();
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("�ų��� ������ �ϴ� ��.....");
			if(i == 8) {
				System.out.println("��... ������!!!");
				System.out.println("������ ���ż� ������ �����մϴ�. �̤�");

	            bgmPlay.play = false;
				break;
			}
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}

}
