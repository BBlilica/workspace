package day08.modi.member.pac1;


//클래스 접근제한 public, default밖에 없습니다
public class A {

		public A(int i) {}
		A(String s) {}
		private	A(boolean b) {} // 밖에서 객체생성을 못하게 할때. 생성자 private
		
		
		/////////////////////

		public int a;
		int b;
		private int c;
		
	public void method01() {
		a = 1;
		b = 2;
		c = 3;
		method01();
		method02();
		method03();
		 
	} //생성자
	void method02() {
		
	}
	private void method03() {		
	}
		
}
