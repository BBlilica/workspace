package quiz01;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		/*
		 * 가로, 세로 길이를 입력받음 가로, 세로 길이의 사각형을 출력하면 됩니다. 단, 윤곽만 나타나도록 출력하면 됩니다.
		 */

		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt(); // 세로
//		int b = scan.nextInt(); // 가로

//		for (int i = 1; i <= b; i++) {
//			System.out.print("*");
//		}
//		for (int j = 1; j <= a - 2; j++) {
//			System.out.println("");
//			System.out.print("*");
//		}
//		for ( int q = 1; q <= b -2; q++) {
//			System.out.print(" ");
//		}
//		System.out.println("");
//		for (int i = 1; i <= b; i++) {
//			System.out.print("*");
//		}
		
		
		System.out.print("가로>");
		int w = scan.nextInt();
		System.out.print("세로>");
		int h = scan.nextInt();

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (i == 1 | i == h) { // 첫행과 마지막행
					System.out.print("*");
				} else { // 첫행, 마지막행 아닐 떄
					if (j == 1 | j == w) { // 첫열, 마지막열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
	}
}
