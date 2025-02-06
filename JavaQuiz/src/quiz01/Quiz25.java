package quiz01;

import java.util.Scanner;

public class Quiz25 {
	public static void main(String[] args) {
		//백준 9086
//		Scanner scan = new Scanner(System.in);
//
//		int a = scan.nextInt();
//
//		for (int i = 1; i <= a; i++) {
//			String b = scan.next();
//			System.out.print(b.charAt(0));
//			System.out.println(b.charAt(b.length() - 1));
//		}
//		scan.close();
		
//		char[] arr2 = str.toCharArray();
		
		//백준11720
		//힌트 - 아스키코드의 char
		
//		System.out.println((int)'1');
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String b = scan.next();
		
		for(int i = 0; i < b.length(); i++) { // 문자열반복
			System.out.println(b.charAt(i));
		}
		
		
		
	}
}
