package day03;

public class MutiForEx01 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "-" + j);
				
			}
			
		}
		
		System.out.println("------------------------------");
		
		for(int k = 2; k <= 9; k++) {
			System.out.println(k + "단");
			for(int l = 1; l <= 9; l++) {
				System.out.println(k + " X " + l + " = " + k*l);
			} System.out.println("--------------------");
		}
	}
}
