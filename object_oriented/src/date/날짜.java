package date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ��¥ {

	public static void main(String[] args) {
		// ���� ��ǻ�� �ý����� ��¥�� �ð��� ���´�.
				Date date = new Date();
				// Fri Mar 06 12:45:17 KST 2020
				System.out.println(date);
				/*
				 * 	[1] ��¥ �� �ð� ��� ���� ���� ���
				 *  	. ��¥ �� �ð� ���Ŀ� ���Ǵ� �����ڸ� ������ ������ ���ڴ� �Է��ϴ� �״�� ��µȴ�.
				 *  	. Date date = new Date();
				 *  	. SimpleDateFormat sdf = new SimpleDateFormat("��¥ �� �ð� ����");
				 *  [2] ��¥ �� �ð� ���� ���� ���
				 *  	. sdf.format(date);
				 *  [3] ��¥ �� ���� ��� ���� ������ ����
				 *  	. ���ۿ��� "simpledateformat ��¥ ����" ��� �˻��ϱ�
				 */
				
				SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
				System.out.println(sdf1.format(date));
				
				SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm");
				System.out.println(sdf2.format(date));
				
				/*
				 * System.currentTimeMillis()
				 * . 1970�� 1�� 1�� ���� ���� �� �޼ҵ尡 ����Ǵ� �������� ������ �ð��� �и���(1/1000��) ������ ���´�.
				 * . 13�ڸ��� ���ڸ� ������ ������ int�� ó���ϸ� ������ �߻��ǹǷ� long�� ó���ؾ� �Ѵ�.
				 */

				// int time = System.currentTimeMillis();		// ���� �߻�
				long time = System.currentTimeMillis();
				System.out.println(time);
				System.out.println(sdf2.format(time));
	}

}
