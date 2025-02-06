package day03;

public class WhileEx01 {
	public static void main(String[] args) {

		int a = 1; // 제어변수 - 반복문의 횟수를 제어할 변수
		int sum = 0; // a를 sum에 누적
		
		while (a <= 10) {
			
			//System.out.println(a);
			sum += a; //sum = sum + a;
			/*
			 * 1 = 0 + 1
			 * 3 = 1 + 2
			 * 5 = 2 + 3
			 * 7 = 3 + 4
			 * 9 = 4 + 5
			 * 11 = 5 + 6
			 * 13 = 6 + 7
			 * 15 = 7 + 8
			 * 17 = 8 + 9
			 * 19 = 9 + 10
			 * 21 = 10 + 11
			 */
			
			
			a++; // 제어변수 조작으로 언젠가, 조건이 false가 되도록 만들어줌
			
		}

		System.out.println("반복문 종료");
		System.out.println("1-10까지 합:" + sum);
	}
}
