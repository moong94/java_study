package whileex;

public class WhileEx22 {

	public static void main(String[] args) {
		/*
		 * 巩力 1)
		 * #
		 * ##
		 * ###
		 */
		
		int cnt = 0;
		
		for(int i = 0; i < 3; i++) {
			cnt++;
			for(int j = 0; j < cnt; j++) {
				System.out.print("#");
				
			}
			System.out.println();
		}

		System.out.println();
		/*
		 * 巩力 2)
		 * ###
		 * ##
		 * #
		 */
		cnt = 4;
		
		for(int i = 0; i < 3; i++) {
			cnt--;
			for(int j = 0; j < cnt; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		System.out.println();
		/*
		 * 巩力 3)
		 * @##
		 * @@#
		 * @@@
		 */
		cnt = 0;
		
		for(int i = 0; i < 3; i++) {
			cnt++;
			for(int j = 0; j < 3; j++) {
				if(j < cnt) {
					System.out.print("@");
				}
				else {
					System.out.print("#");
					
				}
			}
			System.out.println();
		}
		
		System.out.println();
		/*
		 * 巩力 4)
		 *   #
		 *  ###
		 * #####
		 */
		
		cnt = 2;
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < cnt; j++) {
					System.out.print(" ");
				}
			for(int k = 0; k < (2 * i + 1); k++) {
				System.out.print("#");
			}
			cnt--;
			System.out.println();
		}
	}

}
