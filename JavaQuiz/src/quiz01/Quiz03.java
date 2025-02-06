package quiz01;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		
		/*
		 *  두 정수 A B 를 한번에 입력받은 다음에 A + B의 결과를 출력하는 프로그램 코드를 작성
		 *  
		 *  입력
		 *  1 2
		 *  출력
		 *  3
		 *  
		 *  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A와 B의 값을 입력하세요");
		
		int a = scan.nextInt();
		int b = scan.nextInt();	
		
		System.out.println(a + b);
		
		scan.close();
		
		
	}
}
