package quiz20;

public class User {

	private String name;
	private int age;
		
	User(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	User() {
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
