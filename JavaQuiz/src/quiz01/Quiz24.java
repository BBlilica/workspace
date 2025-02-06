package quiz01;

import java.util.Scanner;

public class Quiz24 {
	public static void main(String[] args) {
		//백준 27866
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		int a = scan.nextInt();

		System.out.println(str.charAt(a - 1));

	}
}
