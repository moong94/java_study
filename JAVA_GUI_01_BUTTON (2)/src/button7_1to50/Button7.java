package button7_1to50;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
class My_panel extends JPanel implements ActionListener{
	// 1to50
	JButton btn;
	JButton btn_arr[];	
	int game_num;
	int [] front;
	int [] back;
	Random ran;
	My_panel(){
		this.setLayout(null);
		game_num = 1;
		ran = new Random();		
		basic_set();	
		num_shuffle();
		btn_shuffle();
	}
	public void btn_shuffle() {
		for(int i = 0; i < 5; i++) {
			btn_arr[i].setText(front[i] + "");
		}
	}
	public void num_shuffle() {
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(5);
			int temp = front[r];
			front[r] = front[0];
			front[0] = temp;
			
			r = ran.nextInt(5);
			temp = back[r];
			back[r] = back[0];
			back[0] = temp;
		}	
	}
	public void basic_set() {
		btn = new JButton();
		btn.setText("NEXT NUM : " + game_num);
		btn.setSize(300, 100);
		btn.setLocation(50, 50);
		add(btn);
		
		btn_arr =new JButton[5];
		front = new int[5];
		back =new int[5];
		for(int i = 0; i < 5; i++) {
			btn_arr[i] = new JButton();
			btn_arr[i].setText("0");
			btn_arr[i].setSize(100, 100);
			btn_arr[i].setLocation(100 + i * 100, 200);
			btn_arr[i].addActionListener(this);
			add(btn_arr[i]);
			
			front[i] = i + 1;
			back[i] =  i + 6;
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < 5; i++) {
			if(e.getSource() == btn_arr[i]) {
				if(btn_arr[i].getText().equals(game_num +"")) {
					if(game_num < 6) {
						btn_arr[i].setText(back[i] + "");
						game_num += 1;
						btn.setText("NEXT NUM : " + game_num);
					}
					else {
						btn_arr[i].setText("");
						game_num += 1;
						if(game_num > 10) {
							btn.setText("GAME OVER");
						}
						else {
							btn.setText("NEXT NUM : " + game_num);
						}
					
					}
					
				}
			}
		}	
	}
}

public class Button7 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("1TO50");
		frame.setSize(1000, 800);
		frame.setLocation(100 , 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		My_panel mp = new My_panel();
		frame.setContentPane(mp);
		frame.revalidate();




	}
}
