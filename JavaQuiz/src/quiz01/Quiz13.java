package quiz01;

public class Quiz13 {
	public static void main(String[] args) {
		// 1. 7 ~ 100 사이의 정수들 중에서 7의 배수를 *가로 로 출력
		
		
		
		for(int a = 7; a <= 100; a += 7) {
				System.out.print(a+" ");
		}
		
		System.out.println("  ");
		
		
		// 2. 200까지 정수 중에서 8의 배수의 개수를 출력
		
		int count = 0;
		for(int q = 1; q <= 200; q++ ) {
			if(q % 8 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		// 3. 50 ~ 100 사이의 짝수의 합
		
		int sum = 0;
		for(int i =50; i <= 100; i++) {
			if(i % 2 == 0)
				sum += i;
		}
		
		System.out.println(sum);
		
		// 4. A ~ Z 까지 문자열의 합을 구하세요 ABCDEFG....Z
		// A = 65, Z = 90
		
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		System.out.println(str);
		
	}
}
