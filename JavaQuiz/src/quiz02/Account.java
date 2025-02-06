package quiz02;

import java.util.Scanner;

public class Account {
	
	/*
  Account클래스
  
	멤버변수
	이름 - String
	비밀번호 - String
	잔액 - int
	
	생성자
	(이름, 비밀번호, 잔액) 을 받아서 초기화 해주는 생성자 1개
	
	메서드
	입금기능 - deposit(int) : 반환 void - 잔액에 매개변수를 누적하는 기능
	출금기능 - withDraw(int) : 반환 int - 사용자에게 비밀번호를 입력받아서, 비밀번호가 일치하면, 잔액을 차감해하고, 출금값을 반환하는 기능
	잔액조회 - getBalance() : 반환 int - 잔액을 반환하는 기능
	
	*/
	
	Scanner scan = new Scanner(System.in);
	String name;
	String pass;
	int m;
	
	Account(String nameIn, String passIn, int mIn) {
		name = nameIn;
		pass = passIn;
		m = mIn;
	}
	
	void info() {
		System.out.println("== 회원정보 ==");
		System.out.println(name);
		System.out.println(pass);
		System.out.println(m);
	}
	
	void deposit(int a) {
		System.out.println("현재잔액: " + m);
		System.out.println("입금한금액: " + a);
		m += a;
		System.out.println("총금액: " + m);
	}
	
	int withDraw(int p) {
		String pwd = scan.next();
		if(pwd.equals(pass)) {
			System.out.println("현재잔액: " + m);
			System.out.println("출금할금액: " + p);
			m -= p;
			System.out.println("총금액: " + m);
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		return p;
	}

	int getBalance() {
		System.out.println("현재금액: " + m);
		return m;
	}
	
	
}
