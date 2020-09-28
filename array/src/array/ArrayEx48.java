package array;

public class ArrayEx48 {

	public static void main(String[] args) {
		
		/*
		 * # 2Â÷¿ø¹è¿­[Á¤·Ä]
		 * ¿µÈñ : °¨
		 * ¿µÈñ : ±è¹ä
		 * ¿µÈñ : »ç°ú
		 * Ã¶¼ö : ±è¹ä
		 * Ã¶¼ö : »ç°ú
		 */

		int jangCount = 5;
		
		
		String[][] jang = {
			{"Ã¶¼ö", "±è¹ä"},
			{"¿µÈñ", "°¨"},
			{"Ã¶¼ö", "»ç°ú"},
			{"¿µÈñ", "»ç°ú"},
			{"¿µÈñ", "±è¹ä"}
		};
		
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		
		//ÀÌ¸§ ¼øÀ¸·Î Á¤·Ä
		for(int i = 0; i < jang.length; i++) {
			int check = -1;
			for(int j = i + 1; j < jang.length; j++) {
				if(jang[i][0].compareTo(jang[j][0]) > 0) {
					
					check = j;
				}
				
			}
			if(check != -1) {
				String tmp[] = null;
			
				tmp = jang[i];
				jang[i] = jang[check];
				jang[check] = tmp;
			
			}
			
			
		}
		
		System.out.println();
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		
		//item Á¤·Ä
		for(int i = 0; i < jang.length; i++) {
			int check = -1;
			for(int j = i + 1; j < jang.length; j++) {
				if(jang[i][1].compareTo(jang[j][1]) > 0) {
					
					check = j;
				}
				
			}
			if(check != -1) {
				String tmp[] = null;
			
				tmp = jang[i];
				jang[i] = jang[check];
				jang[check] = tmp;
			
			}
			
			
		}
		
		System.out.println();
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
	}

}
