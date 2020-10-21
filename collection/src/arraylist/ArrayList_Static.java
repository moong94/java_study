package arraylist;

import java.util.Vector;
class ST{	
	int num;
	String name;
}
class St_manager{
	static int count = 0;
	static Vector<ST> list = new Vector<ST>();
}


public class ArrayList_Static {

	public static void main(String[] args) {
		ST st = new ST();
		st.num = 10001;
		st.name = "±èÃ¶¼ö";
		St_manager.list.add(st);
		
		st = new ST();
		st.num = 10002;
		st.name ="ÃÖ¿µÈñ";
		St_manager.list.add(st);
		

	}

}
