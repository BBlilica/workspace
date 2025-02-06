package day08.encap.good;

public class MainClass {
	public static void main(String[] args) {
		MyDate me = new MyDate();
//		me.setYear(2026);
		me.setYear(2025);
		int year = me.getYear();
		System.out.println("년도:" + year);
		
		me.setMonth(1);
		int month = me.getMonth();
		System.out.println("월:" + month);
		
		me.setDay(20);
		int day = me.getDay();
		System.out.println("일:" + day);
		
		me.setSsn("1234567890123");
		String ssn = me.getSsn();
		System.out.println("주민번호:" + ssn);
		
		System.out.println(me.getYear());
		System.out.println(me.getMonth());
		System.out.println(me.getDay());
		System.out.println(me.getSsn());
		
	}
	
	
}
