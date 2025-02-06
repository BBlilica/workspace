package quiz13;

public class Tank extends Unit {

	private boolean changeMode = false;
	
	public Tank() {
		this.hp = 60;
	}
	
	
	
	
	
	@Override
	public void location() {
		
	}

	@Override
	public void move(int x, int y) {
		
	}

	public void changeMode() {
		changeMode = !changeMode;
	}
	
	
	
	
//	int hp = 100;
//	int attackMode = 0;
//	
//	public Tank(int x, int y) {
//		super.x = x;
//		super.y = y;
//		
//	}
//	
//	void changeMode() {
//		if(attackMode == 0) {
//			System.out.println("시즈시즈");
//			attackMode = 1;
//		} else {
//			System.out.println("탱크굴러가유");
//			attackMode = 0;
//		}
//	}
//	
}
