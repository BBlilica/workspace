package day11.exception.throws_;

public class ThrowsEx01 {
	
	
	
	public static void main(String[] args) {
		
		/*
		 * 메서드, 생성자에서 발생되는 예외를 떠넘기는 키워드 throws
		 * throws 구문이 붙어 있는 메서드, 생성자를 호출할 때는 예외처리를 대신 진행합니다.
		 * 즉, 예외처리를 강요할 때 사용할 수 있습니다.
		 * 
		 * 
		 */
		try {
			greeting(10);
		} catch (Exception e ) {
			System.out.println("인덱스는 0~2 까지 전달하세요");
		}
		
		try {
			Class.forName("wefsdv");
		} catch (ClassNotFoundExpception e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace(); // 개발도중에, 에러의 내용을 보기 위해서 자주 사용
		}
		
		System.out.println("프로그램 정상 종료");
		
		
		
	}
	
	private static String[] arr = {"hello", "안녕하세요", "사요나라"};
	
	public static void greeting(int index) throws Exception {
		System.out.println( arr[index] );
		
		
	}
	
	
	
	
}
