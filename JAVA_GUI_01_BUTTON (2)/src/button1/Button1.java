package button1;

import javax.swing.JFrame;
import javax.swing.JPanel;

class My_panel extends JPanel{
	
	My_panel(){
		
	}
	
}

public class Button1 {
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
