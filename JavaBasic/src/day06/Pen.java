package day06;

// 설계도 클래스는 메인메서드 만들지 않는다.
public class Pen {
	// 정의할 때 무엇이 정의가 되는가?
	// // 변수 - 클래스의 속성을 나타내매 = 멤버변수(전역변수)(필드) 
	String ink;
	int Price;
	String company;
	
	// 메서드 - 클래스 안에서 기능을 나타내는 것
	void write() {
		System.out.println(ink + "색상 글씨입니다.");
		
	}
	
	String info() {
		System.out.println("--- 펜의 사용 정보 ---");
		System.out.println("색상: " + ink);
		System.out.println("가격: " +Price);
		System.out.println("제조사: " +company);
		
		return "색상: " + ink + ", 제조사: " + company;
	}
	
}
