package quiz13;

public class Marine extends Unit {

	public static int attack = 6; 
	public static int ammor = 0;	
	
	
	public Marine () {
		this.hp = 60;
	}
	
	
	
	
	@Override
	public void location() {
		System.out.println("현재 위치:" + x + ", " + y);
	} 

	@Override
	public void move(int x, int y) {
		System.out.println("위치 이동:" + x + ", " + y);
	}

	public void stimPack() {
		attack += 1;
		System.out.println("팩");
	}
	
	
	
	
	
	
//	int hp = 60;
//	int attack = 6;
//	int ammor = 0;
//
//	public Marine(int x, int y) {
//		super.x = x;
//		super.y = y;
//
//	}
//
//	public void stimPack() {
//		this.attack++;
//		System.out.println(attack + " + 1");
//	}
	
	
	
	
	

}
