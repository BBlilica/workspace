package quiz01;

public class Quiz02 {

		public static void main(String[] args) {
			
			//1. 랜덤한정수 1~100이 주어질 때, 이 값이 5의 배수인지 확인하고, 출력하세요.
			
			int r = (int)(Math.random() * 100) + 1;
			String result = r % 5 == 0 ? "5의 배수입니다." : "5의 배수가 아닙니다.";
			System.out.println(r);
			System.out.println(result);
			
			
			
			
			
			//2. 랜덤한정수 -5~5가 주어질 때, 언제나 이 값을 절대값으로 출력해주세요.
			
			int l = (int)(Math.random() * -10) + 5;
			System.out.println(l);
															
			System.out.println("절대값 " + (l < 0 ? -l : l));
			
			/*
			 * 사과 x개를 상자에 담을 때 필요한 상자의 개수를 구하려고합니다.
			 * 한 상자에는 최대 10개의 사과가 들어 갈 수 있습니다.
			 * 사과의 개수가 1~150개 랜덤하게 주어질 때, 
			 * 필요한 바구니의 개수를 구하는 프로그램을 작성하세요.
			 */
			
			//나누어 떨어지는 경우 vs 나누어 떨어지지 않는 경우
			
			int w = (int)(Math.random() * 150) + 1;
			int a = 10; //상자
			System.out.println("사과의 개수:" +w);
		
			int count = w % a == 0 ? w / a : w / a +1; // <- 몫이 남는가?
			System.out.println("상자의 개수:" + count);
			
				
			
			
			
			
		}
}
