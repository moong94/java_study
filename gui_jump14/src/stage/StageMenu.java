package stage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import _main.KeyManager;

public class StageMenu extends Stage {
	
	private int currentChoice = 0;
	private String[] options = {
		"Start",
		"Help",
		"Quit"
	};
	private Color titleColor;
	private Font titleFont;
	
	private Font font;
	@Override
	public void init() {
			
			titleColor = new Color(128, 0, 0);
			titleFont = new Font("Century Gothic",Font.PLAIN,28);
			
			font = new Font("Arial", Font.PLAIN, 12);
	}
	@Override
	public void update() {
		
		if(KeyManager.instance.isKeyDown(KeyEvent.VK_DOWN)) {
			currentChoice++;
			if(currentChoice == options.length) {
				currentChoice = 0;
			}
		}
		if(KeyManager.instance.isKeyDown(KeyEvent.VK_ENTER)) {
			select();
		}
	}

	@Override
	public void render(Graphics g) {
		
		g.setColor(titleColor);
		g.setFont(titleFont);
		g.drawString("Dragon Tale", 80, 70);
		g.setFont(font);
		for(int i = 0; i < options.length; i++) {
			if(i == currentChoice) {
				g.setColor(Color.BLACK);
			}
			else {
				g.setColor(Color.RED);
			}
			g.drawString(options[i], 145, 140 + i * 15);
		}
	}
	
	private void select() {
		if(currentChoice == 0) {
			StageManager.instance.setState(StageManager.STAGE_LEVEL1);
		}
		if(currentChoice == 1) {
			// help
		}
		if(currentChoice == 2) {
			System.exit(0);
		}
	}

}
