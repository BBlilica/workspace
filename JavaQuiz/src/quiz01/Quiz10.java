package quiz01;

import java.util.Scanner;

public class Quiz10 {
	// 1. 1~입력 받은 수 까지의 6의 배수의 합

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = 1;
		int c = 0;
		
		while (b <= a ) {
			if (b % 6 == 0) {
				c += b; // c = c + b
			}
			
			b++;
		} 
		
		System.out.println(c);
		scan.close();
		
		System.out.println("------------------------------------");
		
		// 2. 1~100까지 정수 중에서 4의 배수이면서 8의 배수가 아닌 수의 개수
		
		int g = 1;
		int cnt = 0; //개수 셀 변수
		
		while(g <= 100) {
			if(g % 4 == 0 && g % 8 != 0) {
				cnt++;
				
			}
			g++;
		}
		System.out.println("1~100까지 4, 8의 개수" + cnt);
		
		System.out.println("--------------------------------------");
		
		// 3. 50-100 까지 정수들의 합
		
		int sum2 = 0;
		int n = 50;
		while(n<=100) {
			sum2 += n; //50 ~ 100까지 합
			n++;
		}
		System.out.println("결과:" + sum2);
		
		System.out.println("--------------------------------------");
		
		// 4 1000의 약수들의 개수
		
		int k = 1;
		int count = 0;
		while(k <= 1000) {
			//k가 1000의 약수인지 아닌지 확인함
			if(1000 % k == 0) {
				count++;
			}
			k++;
		}
		System.out.println("1000의 약수의 개수:" + count);
		
	}
}
