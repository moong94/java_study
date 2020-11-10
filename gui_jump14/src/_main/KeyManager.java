package _main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyManager implements KeyListener{
	static public KeyManager instance = new KeyManager();	
	int[] keyDown = new int[256];
	int[] keyUp = new int[256];
	int[] keyStay = new int[256];
	KeyManager(){	
	}	
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyDown[keyCode] == 0) {
			keyDown[keyCode] = 1;
		}
		keyUp[keyCode] = 1;
		keyStay[keyCode] = 1;
	}
	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		keyDown[keyCode] = 0;
		keyUp[keyCode] = 2;
		keyStay[keyCode] = 0;
	}
	public boolean isKeyDown(int e) {
		if (keyDown[e] == 1) {
			keyDown[e] = 2;
			return true;
		}
		return false;
	}
	public boolean isKeyUp(int e) {
		if (keyUp[e] == 2) {
			keyUp[e] = 0;
			return true;
		}
		return false;
	}
	public boolean isKeyStay(int e) {
		if (1 == keyStay[e])
			return true;
		return false;
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub		
	}
}