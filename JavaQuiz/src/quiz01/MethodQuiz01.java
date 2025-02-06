package quiz01;

public class MethodQuiz01 {

		public static void main(String[] args) {
		
			method1();
			
			System.out.println(method2("전달 받은 매개 변수 리턴"));
			
			System.out.println(method3(1,2,3));
			
			System.out.println(method4(4));
			
			method5("반복", 3);
			
			System.out.println(maxNum(5,3));
			
			System.out.println(abs(-5000));
			
			
			char[] c = {'a','b','c'};
			System.out.println(method6(c));
			
		}
		
		static void method1() {
			System.out.println("안녕");
		}
		
		static String method2(String s) {
			String D = s;
			return D; 
		}
		
		static double method3(int a, int b, double c) {
			double Sum = a + b + c;
			return Sum;
		}
		
		static String method4(int a) {
			if(a % 2 == 0) {
				String A = "짝수";
				return A;
			} else {
				String B = "홀수";
				return B;
			}
			
		}

		static void method5(String s, int a) {
			for(int i = 1; i <= a; i++) {
				System.out.println(s);
			}
		}
		
		static int maxNum(int a, int b) {
			int g = 0;
			if(a > b) {
				return a;
			} if(a > b) {
				return b;
			} else {
				return g;
			}
		}
		
		static int abs(int a) {
			int ABS = Math.abs(a);
			return ABS;
		}
		
		
			
		static String method6(char[] QWE) {
			return String.valueOf(QWE);
			}
		
		}
