package quiz01;

public class MethodQuiz02 {
	public static void main(String[] args) {
		
//		String str = java(5);
		System.out.println(java(5));
		
		
	}
	
	static String java(int i) {
		String K = "";
			for(int j = 1; j <= i; j++) {
				//j 가 홀수면 "자", 짝수면 "바"
				if(j % 2 == 1) {
					K += "자";
				} else {
					K += "바";
				}
			}
		return K;
	}
	
	
	
	
}
