package day09.poly.instanceof_;


public class MainClass {
	
	public static void main(String[] args) {
	
		Person hong = new Student("홍길동",10,"123");
		Person park = new Teacher("박찬호",20,"체육");
		Person choi = new Employee("최강창민",30,"가수");
	
		printPerson(hong);
		
	}
	
	public static void printPerson(Person p) {
		// p 가 Student 였으면 Student 캐스팅
		// p 가 Teacher 였으면 Teacher 캐스팅
		if (p instanceof Student) { // p 가 Student 였으면 true
			Student s = (Student)p;
			System.out.println(s.info());
			System.out.println("p는 원래 Student였음");
		} else if (p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println(t.info());
			System.out.println("p는 원래 Teacher였음");
		} else if (p instanceof Employee) {
			Employee e = (Employee)p;
			System.out.println(e.info());
			System.out.println("p는 원래 Employee였음");
			
		}
		
	}
	
	
	
	
}
