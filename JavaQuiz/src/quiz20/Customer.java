package quiz20;

public class Customer {

	
	private String name;
	private int arriviaTime = (int)(Math.random()*3) +1;
	
	Customer() {}
	Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArriviaTime() {
		return arriviaTime;
	}
	public void setArriviaTime(int arriviaTime) {
		this.arriviaTime = arriviaTime;
	}
	
	
	
}
