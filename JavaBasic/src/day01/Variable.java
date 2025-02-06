package day01;

public class Variable {
	public static void main(String[] args) {

		//		변수의 선언방법
		//		int는 정수를 저장하는 대표적인 유형
		//		string은 문자열을 저장하는 대표적인 유형


		int a; //변수의 선언
		a = 10; //변수의 초기화
		System.out.println(a);

		int a2 = 20; //변수의 선언과 초기화 동시 
		//		int a = 30; //동일한 이름으로 변수를 생성할 수 없음

		int num1 = 10, num2 = 20; //같은 타입변수라면 , 나열 할 수 있음
		int num4 =40;

		//변수는 해당 중괄호 안에서만 유효합니다.
		if(true) {
			int num3 = 30;
			num4 = 400; //값의 변경
		}

		int num3 = 40;
		System.out.println(num3);
		System.out.println(num4);
	}
}
