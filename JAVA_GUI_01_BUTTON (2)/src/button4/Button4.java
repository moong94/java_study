package button4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
class My_panel extends JPanel implements ActionListener{
	JButton btn;	
	My_panel(){
		this.setLayout(null);
		btn = new JButton();
		btn.setText("0");
		btn.setSize(100, 100);
		btn.setLocation(100, 100);
		btn.addActionListener(this);
		add(btn);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			btn.setText("1");
		}
	}
}

public class Button4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("¹öÆ°");
		frame.setSize(1000, 800);
		frame.setLocation(100 , 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		My_panel mp = new My_panel();
		frame.setContentPane(mp);
		frame.revalidate();


	}
}
