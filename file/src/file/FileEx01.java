package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx01 {

	public static void main(String[] args) {
		String fileName = "ex01.txt";
		// ����ó�� ���̴� ������� ���ϰ� �������� �ο��س��Ҵ�.
		// FileWriter fw = new FileWriter(fileName);

		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write("���������ϱ� ��������");
           fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 1. Run : Ctrl + F11
		// 2. ������Ʈ ���� ��, 
		//    F5(Refresh)�� ������ ������ �޸��� ������ Ȯ���� �� �ִ�. 

	}

}
