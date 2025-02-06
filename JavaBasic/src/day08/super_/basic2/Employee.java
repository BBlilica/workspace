package day08.super_.basic2;

public class Employee extends Person {

	String department;
	Employee (String name, int age, String emplyoee) {
		super(name, age);
		this.department = emplyoee;
	};
	
	@Override
	String info() {
		return super.info() + " 부서 " + department;
	}
}
