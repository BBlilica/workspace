package quiz13;

public class MainClass {

	public static void main(String[] args) {

		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		Marine m4 = new Marine();

		Tank t1 = new Tank();
		Tank t2 = new Tank();
		Tank t3 = new Tank();
		Tank t4 = new Tank();

		DropShip ship = new DropShip(1, 1);
		
		ship.ride(m1);
		ship.ride(m2);
		ship.ride(m3);
		ship.ride(m4);
		ship.ride(t1);
		ship.ride(m1);
		
		
	}
}
