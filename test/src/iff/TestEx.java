package iff;

import java.util.Random;
import java.util.Scanner;

public class TestEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//0 : ����     1 : ����    2 : ��
		System.out.println("���������� ����");
		System.out.println("(0:����)     (1:����)     (2:��)");

		int meleft = -1;
		int meright = -1;
		
		int melast = -1;
		int comlast = -1;		//���� ����
		
		boolean opt = true;
		
		while(opt) {
			System.out.print("�޼� : ");
			meleft = scan.nextInt();
			if(meleft < 0 || meleft > 2) {
				System.out.print("0~2�� �ٽ� �Է� :");
			}
			else {
				opt = false;
			}
		}
		boolean opt2 = true;
		while(opt2) {
			System.out.print("������ : ");
			meright = scan.nextInt();
			if(meright < 0 || meright > 2) {
				System.out.print("0~2�� �ٽ� �Է� :");
			}
			else {
				opt2 = false;
			}
		}
		
		int comleft = ran.nextInt(3);
		int comright = ran.nextInt(3);
		
		//�����ֱ�
		System.out.println("(0:����)     (1:����)     (2:��)");
		System.out.println("me �޼� : " + meleft + ", ������ : " + meright);
		System.out.println("com �޼� : " + comleft + ", ������ : " + comright);
		
		//�� �O �ϳ��� ����
		System.out.println("�ϳ� ����");
		
		boolean opt3 = true;
		while (opt3) {
		System.out.println("me �� ���� (1) �޼�, (2) ������ : ");
			int meran = scan.nextInt();
			if(meran < 1 || meran > 2) {
				System.out.println("�߸� �� �Է�");
			}
			else {
				opt3 = false;
				if(meran == 1) {
					melast = meleft;
				}
				else if(meran == 2) {
					melast = meright;
				}
			}
		}
		
		//��ǻ�� ���� ����
		int comran = ran.nextInt(2);
		
		if(comran == 0) {
			comlast = comleft;
		}
		else if(comran == 1) {
			comlast = comright;	
		}
		
		System.out.println("���");
		
		
		System.out.println("(0:����)     (1:����)     (2:��)");
		System.out.println("me : " + melast + ", com : " + comlast);
		if(melast == comlast) {
			System.out.println("����.");
		}
		else if(comlast == 2 && melast == 0) {
			System.out.println("�̰��.");
		}
		else if(comlast == 0 && melast == 2) {
			System.out.println("����.");
		}
		else if(comlast > melast) {
			System.out.println("����.");
		}
		else if(comlast < melast) {
			System.out.println("�̰��.");
		}
	}

}
