package day08.encap.obj;

public class Hotel {

	// 멤버변수의 클래스타입이 올수도 있다, 배열도 올수있다.
	private Chef chef; // 접근제어자 
//	private Empolyee emp;
	
	// 호텔이 생성될 때, chef 를 같이 생성한다.
	public Hotel() {
		this.chef = new Chef();
	}
	
	// chef 변수의 getter, setter
	// setter - 매개변수로 객체를 받는타입
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	// getter - 객체를 반환으로 돌려주는 형태
	public Chef getChef() {
		return chef;
	}
	
//	// emp - getter, setter
//	public void setEmp(Employee emp) {
//		this.emp = emp;
//	}
//	public Employee getEmp() {
//		return emp;
//	}
}
