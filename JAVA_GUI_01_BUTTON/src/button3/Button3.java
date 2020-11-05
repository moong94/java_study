package button3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
class My_panel extends JPanel{
	
	JButton btn;
	
	My_panel(){
		this.setLayout(null);

		
		btn = new JButton();
		btn.setText("버튼");
		btn.setSize(100, 100);
		btn.setLocation(100, 100);
		add(btn);
	}
	
}


public class Button3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("버튼");
		frame.setSize(1000, 800);
		frame.setLocation(100 , 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		My_panel mp = new My_panel();
		frame.setContentPane(mp);
		frame.revalidate();


	}
}
