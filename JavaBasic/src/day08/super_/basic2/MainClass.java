package day08.super_.basic2;


public class MainClass {
	
	public static void main(String[] args) {
		
		Student s = new Student("홍길동",20,"123456");
		
		System.out.println(s.info());
		
		Teacher t = new Teacher("범구",30,"수학");
		
		System.out.println(t.info());
		
		Employee e =  new Employee("진욱",34,"회계");
		
		System.out.println(e.info());
		//teacher, Employee도 생성자를 만들고, 객체 생성 해주세요.
		
		
		
	}
	
}
