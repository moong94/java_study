package button6_tic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
class My_panel extends JPanel implements ActionListener{
	//TIC
	JButton ttt[][];
	int data[][];
	boolean turn;
	JButton result;
	JButton restart;
	
	My_panel(){
		this.setLayout(null);	
		basic_set();		
	}	
	public void basic_set() {
		turn = true;
		ttt = new JButton [3][3];
		data = new int[3][3];
		
		result = new JButton();
		result.setSize(140, 50);
		result.setLocation(100, 500);
		result.setText("승자는 누구?");
		add(result);
		
		restart = new JButton();
		restart.setSize(140, 50);
		restart.setLocation(260, 500);
		restart.setText("다시 시작하기");
		restart.addActionListener(this);
		add(restart);
		
		for(int i= 0; i< 3; i++) {
			for(int n = 0; n < 3; n++) {
				ttt[i][n] = new JButton();
				ttt[i][n].setSize(100, 100);
				ttt[i][n].setLocation(i * 100 + 100, n * 100 + 100);
				ttt[i][n].addActionListener(this);
				add(ttt[i][n]);
				data[i][n] = 0;
			}
		}
	}
	
	public int check() {
		for(int i = 0; i < 3; i++) {
			int count = 0;
			
			for(int j = 0; j < 3; j++) {
				if(data[i][j] == 1) {
					count++;
				}
				else if(data[i][j] == 2) {
					count--;
				}
			}
			if(count == 3) {
				return 1;
			}
			else if(count == -3) {
				return 2;
			}
		}
		for(int i = 0; i < 3; i++) {
			int count = 0;
			
			for(int j = 0; j < 3; j++) {
				if(data[j][i] == 1) {
					count++;
				}
				else if(data[j][i] == 2) {
					count--;
				}
			}
			if(count == 3) {
				return 1;
			}
			else if(count == -3) {
				return 2;
			}
		}
		if((data[0][0] == 1 && data[1][1] == 1 && data[2][2] == 1) || (data[0][2] == 1 && data[1][1] == 1 && data[2][0] == 1)){
			return 1;
		}
		if((data[0][0] == 2 && data[1][1] == 2 && data[2][2] == 2) || (data[0][2] == 2 && data[1][1] == 2 && data[2][0] == 2)){
			return 2;
		}
		
		return 0;
	}
	
	String state = "play";
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(state.equals("play")) {
			for(int i = 0; i< 3; i++) {
				for(int n = 0; n <3 ; n++) {
					if(e.getSource() == ttt[i][n]) {
						if(turn == true) {
							if(data[i][n] == 0) {
								ttt[i][n].setText("O");
								data[i][n] = 1;
								turn = !turn;
							}
						}else {
							if(data[i][n] == 0) {
								ttt[i][n].setText("X");
								data[i][n] = 2;
								turn = !turn;
							}
						}
					}
				}
			}
			
			int c = check();
			
			if(c == 1) {
				result.setText("P1 승리");
				state = "end";
			}
			else if(c == 2) {
				result.setText("P2 승리");
				state = "end";
			}
			
			return;
		}
		if(e.getSource() == restart) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					ttt[i][j].setText("");
					data[i][j] = 0;
					turn = true;
					result.setText("승자는 누구?");
					state = "play";
				}
			}
		}
		
		
		
	}
}
	

public class Button6 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("TIC");
		frame.setSize(500, 800);
		frame.setLocation(100 , 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		My_panel mp = new My_panel();
		frame.setContentPane(mp);
		frame.revalidate();



	}
}
