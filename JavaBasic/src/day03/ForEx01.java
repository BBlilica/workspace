package day03;

import java.util.Scanner;

public class ForEx01 {
	public static void main(String[] args) {
		
		//1~10까지 합 for
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1~10까지 합:" + sum);
		
		
		System.out.println("--------------------");
		
		
		for(int j = 10; j >= 1; j--) {
			System.out.println(j);
		}
		
		System.out.println("--------------------");
		
		//for 으로 입력받은 구구단을 출력.
		
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int k = 1; k <= 9; k++) {
			System.out.println(a + "*" + k + "=" + a * k);
		}
		
		
		
		
		
		
		
		
	}
}
