package button8_numgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
class My_panel extends JPanel implements ActionListener{
	// SLIDE
	JButton slide[][];
	Random ran;
	My_panel(){
		this.setLayout(null);	
		basic_set();	
		shuffle();
	}	
	public void shuffle() {
		for(int i = 0; i < 1000; i++) {
			int r1 = ran.nextInt(5);
			int r2 = ran.nextInt(5);
			String temp1 = slide[r1][r2].getText();
			String temp2 = slide[0][0].getText();
			
			slide[r1][r2].setText(temp2);
			slide[0][0].setText(temp1);
					
		}
	}
	public void basic_set() {
		ran = new Random();
		slide = new JButton [5][5];
		
		int k = 0;
		for(int i= 0; i < 5; i++) {
			for(int n = 0; n < 5; n++) {
				slide[i][n] = new JButton();
				if(k == 0)slide[i][n].setText("");
				else slide[i][n].setText(k + "");
				slide[i][n].setSize(100, 100);
				slide[i][n].setLocation(n * 100, i * 100);
				slide[i][n].addActionListener(this);
				add(slide[i][n]);
			
				k += 1;
			}
		}
	}
	boolean check_cross(int y , int x) {
		if(y >= 0 && y <= 4 && x >=0 &&  x <=4) {		
			return true;
		}	
		return false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i< 5; i++) {
			for(int n = 0; n <5 ; n++) {
				if(e.getSource() == slide[i][n]) {
					if(check_cross(i - 1 , n)){
						
						if(slide[i-1][n].getText().equals("")) {
							System.out.print("1");
							String temp = slide[i][n].getText();
							
							slide[i-1][n].setText(temp);
							slide[i][n].setText("");
							break;
						}
					}
					if(check_cross(i + 1 , n)){					
						if(slide[i+1][n].getText().equals("")) {
						//	System.out.print("2");
							String temp = slide[i][n].getText();
							
							slide[i+1][n].setText(temp);
							slide[i][n].setText("");
							break;
						}
					}
					if(check_cross(i , n + 1)){
						
						if(slide[i][n + 1].getText().equals("")) {						 
							String temp = slide[i][n].getText();							
							slide[i][n + 1].setText(temp);
							slide[i][n].setText("");
							break;
						}
					}
					if(check_cross(i , n - 1)){
						
						if(slide[i][n - 1].getText().equals("")) {
						 
							String temp = slide[i][n].getText();
							
							slide[i][n - 1].setText(temp);
							slide[i][n].setText("");
							break;
						}
					}
				}
			}
		}
	}
}


public class Button8 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("SLIDE");
		frame.setSize(1000, 800);
		frame.setLocation(100 , 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		My_panel mp = new My_panel();
		frame.setContentPane(mp);
		frame.revalidate();


	}
}
