package button_2048;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.util.Random;

class My_Panel extends JPanel implements ActionListener {

	final int SIZE = 4;
	int data[][] = new int[SIZE][SIZE];
	JButton[][] btn = new JButton[SIZE][SIZE];
	int nodesize = 100;
	JButton up = new JButton("↑");
	JButton down = new JButton("↓");
	JButton left = new JButton("←");
	JButton right = new JButton("→");
	JButton restart = new JButton("다시 시작하기");
	Random ran = new Random();
	boolean opt = true;
	
	int max = 2048;
	
	
	My_Panel(){
		this.setLayout(null);
		init();
	}
	
	public void init() {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				btn[j][i] = new JButton();
				btn[j][i].setBounds((nodesize * i) + 200,(nodesize * j) + 50, nodesize, nodesize);
				btn[j][i].setBackground(Color.WHITE);
				add(btn[j][i]);
			}
		}
		up.setBounds(350, 500, nodesize, nodesize);
		add(up);
		up.addActionListener(this);
		down.setBounds(350, 600, nodesize, nodesize);
		add(down);
		down.addActionListener(this);
		left.setBounds(250, 600, nodesize, nodesize);
		add(left);
		left.addActionListener(this);
		right.setBounds(450, 600, nodesize, nodesize);
		add(right);
		right.addActionListener(this);
		restart.setBounds(650, 0, 150, 50);
		add(restart);
		restart.addActionListener(this);
		
		random();
	}
	
	public void dataTotext() {
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(data[j][i] != 0) {
					btn[j][i].setText(String.valueOf(data[j][i]));
				}
				if(data[j][i] == 0) {
					btn[j][i].setText(null);
				}
			}
		}
	}
	
	public void restart() {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				btn[j][i].setText(null);
				data[j][i] = 0;
			}
		}
		random();
	}
	
	public boolean check() {
		int count = 0;
		int max_check = 0;
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(data[i][j] != 0) {
					count++;
				}
				if(data[i][j] == 2048) {
					max_check++;
				}
			}
		}
		if(max_check == 1) {
			return false;
		}
		if(count == 16) {
			return false;
		}
		else{
			return true;
		}
	}
	public void random() {
		
		if(check()) {
			while(true) {
				int ran_x = ran.nextInt(4);
				int ran_y = ran.nextInt(4);
				
				if(data[ran_y][ran_x] == 0) {
					data[ran_y][ran_x] = 2;
					dataTotext();
					break;
				}
			}
		}
		else {
			System.out.println("Game over");
		}
	}
	
	public void sum(int num) {
		if(num == 1) {
			for(int i = 0; i < SIZE - 1; i++) {
				for(int j = 0; j < SIZE; j++) {
					if(data[i][j] == data[i + 1][j]) {
						data[i][j] *= 2;
						data[i + 1][j] = 0;
					}
				}
			}
		}
		if(num == 2) {
			int k = 3;
			for(int i = 0; i < SIZE - 1; i++) {
				for(int j = 0; j < SIZE; j++) {
					if(data[k][j] == data[k - 1][j]) {
						data[k][j] *= 2;
						data[k - 1][j] = 0;
					}
				}
				k--;
			}
		}
		if(num == 3) {
			for(int i = 0; i < SIZE - 1; i++) {
				for(int j = 0; j < SIZE; j++) {
					if(data[j][i] == data[j][i + 1]) {
						data[j][i] *= 2;
						data[j][i + 1] = 0;
					}
				}
			}		
		}
		if(num == 4) {
			int k = 3;
			for(int i = 0; i < SIZE - 1; i++) {
				for(int j = 0; j < SIZE; j++) {
					if(data[j][k] == data[j][k - 1]) {
						data[j][k] *= 2;
						data[j][k - 1] = 0;
					}
				}
				k--;
			}	
		}
	}
	public void move(int num) {
		
		for(int i = 0; i < SIZE; i++) {
			//up
			if(num == 1) {
				int check = 0;
				for(int j = 0; j < 4; j++) {
					if(data[j][i] != 0 ) {
						data[check][i] = data[j][i];
						if(check != j) {
							data[j][i] = 0;
						}
						check += 1;
					}
				}
			}
			//down
			if(num == 2) {
				int check = 3;
				int k = 3;
				for(int j = 0; j < 4; j++) {
					if(data[k][i] != 0) {
						data[check][i] = data[k][i];
						if(check != k) {
							data[k][i] = 0;
						}
						check--;
					}
					k--;
				}
			}
			
			//left
			if(num == 3) {
				int check = 0;
				for(int j = 0; j < 4; j++) {
					if(data[i][j] != 0) {
						data[i][check] = data[i][j];
						if(check != j) {
							data[i][j] = 0;
						}
						check++;
					}
				}
			}
			if(num == 4) {
				int check = 3;
				int k = 3;
				for(int j = 0; j < 4; j++) {
					if(data[i][k] != 0) {
						data[i][check] = data[i][k];
						if(check != k) {
							data[i][k] = 0;
						}
						check--;
					}
					k--;
				}
			}
			
		}
		dataTotext();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == restart) {
			restart();
		}
		else if(e.getSource() == up) {
			move(1);
			sum(1);
			move(1);
			random();
		}
		else if(e.getSource() == down) {
			move(2);
			sum(2);
			move(2);
			random();
		}
		else if(e.getSource() == left) {
			move(3);
			sum(3);
			move(3);
			random();
		}
		else if(e.getSource() == right) {
			move(4);
			sum(4);
			move(4);
			random();
		}
		
		
	}
	
}

public class Button_2048 {

	static public JFrame frame = new JFrame();
	static final int WIDTH = 800;
	static final int HEIGHT = 800;
	
	public static void main(String[] args) {
		frame.setTitle("2048");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, WIDTH, HEIGHT);
		frame.setVisible(true);
		
		frame.setContentPane(new My_Panel());
		frame.revalidate();
	}

}
