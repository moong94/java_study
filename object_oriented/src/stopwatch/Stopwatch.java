package stopwatch;

class StopWatch_ extends Thread{
	public String timeText;
	long time = 0l; long preTime = 0l;	
    boolean play = true;
	//Thread Ŭ�����ȿ� �ִ� �޼��� 
	public void run() {
		// ����ð� �ʷκ�ȯ�� �� 
		preTime = System.currentTimeMillis();
		while(play ) {
			try {
				sleep(10);
				time = System.currentTimeMillis() - preTime;
				int m = (int)(time / 1000.0 / 60.0);
				int s = (int)(time % (1000.0 * 60) / 1000.0);
				int ms = (int)(time % 1000 / 10.0);
				System.out.println(m + " : " + s  + " "+ ms);				
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
	}
}

public class Stopwatch {

	public static void main(String[] args) {
		StopWatch_ st = new StopWatch_();
		st.start();
	}

}
