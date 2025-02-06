package day11.exception.throws_;

public class ThrowsEx02 {
	
	
	
	
	public ThrowsEx02 {
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료");
	}
	
	public void aaa() throws Exception{
		System.out.println("aaa 호출");
		bbb(0);
		System.out.println("aaa 종료");
	}
	
	public void bbb (int a) throws Exception {
		System.out.println("bbb 호출");
		
		int x= 10 / a;
//		try {
//			int x = 10 / a;
//		} catch (Exception e ) {
//			System.out.println("0 으로 나눌 수 없습니다");
//		}
		
		
		System.out.println("bbb 종료");
	}
	
public static void main(String[] args) throws Exception {
		
	//ThrowsEx02 객체 생성
	ThrowsEx02 ex = new ThrowsEx02();
	
	
	}
	
	
	
	
	
	
	
	
}
