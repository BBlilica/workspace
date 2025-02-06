package day03;

public class MultForEx02 {
	public static void main(String[] args) {

		// 바깥반복문에 따라서 안쪽 반복문의 회저누가 달라지는 경우.
//		for(int i = 1; i <= 9; i++) {
//				for(int j = 1; j <= i; j++)
//					System.out.println(i + "-" + j);
//		}

		// 조건이 바뀌는 for문
		// 바깥 반복문 - 행
		// 안쪽 반복문 - 열
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 */

//		for (int q = 1; q <= 5; q++) {
//			for (int w = 1; w <= q; w++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		
//		for(int z = 5; z >= 1; z--) {
//			for(int x = 1; x <= z; x++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		/*
		 
		 	*
		   ***
		  *****
		 *******
		*********
		 */
		int star = 5;
		for(int a = 1; a <= star; a++) {
			for(int b = 1; b <= star - a; b++) { // 공백을 출력할 용도
				System.out.print(" ");
			}
			
			for(int o = 1; o <= a*2-1; o++) { // 별을 출력 용도
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
			}
		}
		
		
	}

