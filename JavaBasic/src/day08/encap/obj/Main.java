package day08.encap.obj;

public class Main {

	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		
//		Chef c = new Chef();
		hotel.setChef(new Chef());
		
		
		//setter
		Chef c = new Chef();
		hotel.setChef(c);
		//getter
		Chef chef = hotel.getChef();
		chef.cooking();
	}
	
}
