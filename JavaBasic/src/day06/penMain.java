package day06;

public class penMain {
	public static void main(String[] args) {
		 
		// pen을 쓰고 싶으면 객체로 생성을 해야한다
		// 펜의 속성에 접근 할 때 . 연산자를 쓴다
		
		Pen black = new Pen();
		black.ink = "검정";
		black.Price = 1000;
		black.company = "모나미";
		
		black.write();
		String r = black.info();
		System.out.println(r);
		
		System.out.println("------------------");
		
		Pen red = new Pen();
		red.ink = "빨강";
		red.Price = 2000;
		red.company = "하이테크";
		
		red.write();
		String r2 = red.info();
		System.out.println(r2);
		
		
		
	}
}
