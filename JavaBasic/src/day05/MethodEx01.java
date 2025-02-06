package day05;

public class MethodEx01 {

	/*
	 * 1. 함수는 만들고, 사용하는 과정(호출)이 있다. 2. 메서드 안에는 메서드를 선언할 수 없다.
	 */

	// 믓쟁이 기능을 만들어야디~ 1부터 10까지의 합계
	public static void main(String[] args) {

		System.out.println(sumNum());

		int num = sumNum();
		System.out.println(num);
		
		//문자열을 반환하는 함수~
		String result = randomStr();
		System.out.println(result);
		System.out.println(randomStr());
		
		
	}

	// 함수
	static int sumNum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		return sum;

	}

	// 함수
	static String randomStr() {
		String str = " ";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		return str;
	}

}