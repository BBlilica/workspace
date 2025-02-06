package day01;

public class Systemout {

	public static void main(String[] args) {
		// main 쓰고 ctrl + space 누르면 실행함수 자동생성
		// sysout ctrl + space 출력문 생성


		//		ctrl + / - 한줄주석
		//		art + 방향키 - 코드이동 
		//		shift + 방향키
		//		shift + home	- 영역 잡기
		//		shift + end
		//		전체선택(ctrl + a) + ctrl + i	- 코드정렬
		//				ctrl + art + 방향키 - 행복

		//		 프로젝트의 import(가져오기), export(내보내기)
		//		프로젝트 export - general 탭 -> archive 선택
		//		프로젝트 import - general 탭 -> project into workspace 선택
		




		// 1. println() - 개행을 마지막에 포함
		System.out.println("곧 쉬는 시간이네");
		System.out.println("아 나는 집에 가야겠다. 나만 간다.");

		// 2. print() - 개행 미포함
		System.out.print("줄바꿈이 없다.\n");
		System.out.print("줄바꿈이 없다~\n");

		// 3. printf() - 형식 지정 출력문
		/*
		 * 서식문자 
		 * \n - 줄바꿈 
		 * \t - 탭버튼 정렬 
		 * %d - 정수를 받음 
		 * %s - 문자를 받는다 
		 * %f - 실수를 받는다
		 */
		System.out.printf("맨 처음에 하고싶은 말을 적습니다. %s은 %d월 %d일 입니다.", "오늘", 12, 30);
		System.out.printf("\n원주율은 %f입니다", 3.14);
		System.out.printf("\n원주율은 %.2f입니다\n", 3.14); // %.2f는 소수 2자리 까지만 표현

		// 이 구문에서 숫자를 printf 문자으로 표현해보세요.

		System.out.printf("%dx%d= %d %d x %d = %d", 2, 1, 2, 2, 2, 4);
	}
}
