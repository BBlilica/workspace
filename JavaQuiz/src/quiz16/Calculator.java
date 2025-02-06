package quiz16;

import java.util.Scanner;

public class Calculator {

		public static int input() throws Exception {
			/*
			 * 
			 * 1.정수 2개를 입력 받습니다.
			 * 2.입력된 값이 정수라면 단순히 합계를 변환해주면 됩니다.
			 * 3. 예외가 발생하면, catch 안에서 예외를 다시 한번 생성하고, Throws 처리 합니다.
			 * 4. scan.close는 finally 구문에서 처리합니다.
			 */
			Scanner scan = new Scanner(System.in);
			try {
				
				int a = scan.nextInt();
				int b = scan.nextInt();
				return a + b;
				
			} catch (Exception e) {
				
				throw new Exception();
				
			} finally {
				scan.close();
			}
		}
		
}
