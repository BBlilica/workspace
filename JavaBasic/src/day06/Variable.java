package day06;

public class Variable {
	// 멤버변수 : 초기화 하지 않으면 0, 0.0, false, null 자동 초기화
	
	int a;
	
	void printNum(int c) { // <- 매개변수
		int b = 1; // 지역변수 - 초기화 하지 않으면 사용불가
		System.out.println("멤버변수: " + a);
		System.out.println("지역변수: " + b); // <- 빨간줄 
		System.out.println("매개변수: " + c);
	}
	
}
