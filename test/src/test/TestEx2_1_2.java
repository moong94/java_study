package test;

import java.util.Scanner;

public class TestEx2_1_2 {

	public static void main(String[] args) {
		/*
		 * [�ݺ��� ��ȭ����]
		 * 
		 * 1. -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�.
		 * 2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�.
		 * 4. key�� �Ϸ��� �� �ȿ� ���� ��� "not found"�� ����Ͻÿ�.
		 * 
		 * ��) 
		 * result �� �Է� : 99
		 * 
		 * �Է� : 10
		 * �Է� : 99
		 * �Է� : 20
		 * �Է� : 99
		 * �Է� : 30
		 * �Է� : 99
		 * �Է� : 10
		 * �Է� : -1
		 * 
		 * ��� : key�� 99�� ù���� ��Ÿ�� ���� 2��° �̴�.
		 */
		Scanner scan = new Scanner(System.in);
        int result = 99;
        
        int keycnt = 0;
        int cnt = 1;
        int keyresult = 0;
        
        while(true) {
        	System.out.print("key�� �Է� : ");
        	int key = scan.nextInt();
        	
        	if(key == -1) {
        		break;
        	}
        	if(key == result) {
        		keycnt++;
        	}
        	if(keycnt == 1) {
        		keyresult = cnt;
        	}
        	
        	cnt++;
        }
        
        if(cnt == 1 || keycnt == 0) {
        	System.out.println("Ű�� �Է¹��� �� ����.");
        }
        
        else {
        	System.out.println("Ű�� " + keyresult + "�� �̴�.");
        }
        
        
        
        // ����� �� ==> -1 ==> Ű�� �Է¹���������.
        // ����� �� ==> 99 , 77 , -1 ==> Ű�� 1���̴� 
        // ����� �� ==> 55, 99 , 99, 99, 99, 3 , -1 ==> Ű�� 2���̴�

	}

}
