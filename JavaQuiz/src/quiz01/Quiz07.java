package quiz01;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("정수1>");
		int a = scan.nextInt();
		System.out.println("연산을 선택하세요 [+, -, *, /]");
		String c = scan.next();
		System.out.println("정수2>");
		int b = scan.nextInt();

		switch (c) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);
			break;
		default:
			System.out.println("사칙연산 기호를 입력해야 합니다.");
		}

		scan.close();
	}
}
