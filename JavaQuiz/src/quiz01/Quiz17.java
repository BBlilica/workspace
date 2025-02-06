package quiz01;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {

		/*
		 * 랜덤한 문제를 생성하고, 정답 맞추기 프로그램
		 * 
		 * 0을 입력하면 종료가 됩니다. 종료될때는 정답, 오답 개수를 출력해 주세요. 랜덤한 수 1~100사이의 수로 문제를 생성하고,
		 */

		Scanner scan = new Scanner(System.in);

		int O = 0;
		int X = 0;

		while (true) {
			System.out.println("-----------------------------");
			int Q = (int) (Math.random() * 100 + 1);
			int Q2 = (int) (Math.random() * 100 + 1);
			int P = Q + Q2;
			System.out.println(Q + " + " + Q2 + " = ?");
			System.out.println("문제를 그만 풀려면 0을 일력해주세요.");
			int A = scan.nextInt();

			if (A == 0) {
				System.out.println("문제풀기 종료.");
				System.out.println("정답: " + O);
				System.out.println("오답: " + X);
				break;
			}
			if (A == P) {
				System.out.println("정답입니다.");
				O += 1;
			} else {
				System.out.println("오답입니다.");
				X += 1;
			}

		}
	}
}
