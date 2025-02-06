package quiz13;

public abstract class Unit {

	public int x;
	public int y;
	public int hp;

	public Unit() {
	}
	
	public abstract void location();
	public abstract void move(int x, int y);
	public  void stop() {
		System.out.println("위치사수");
	}
	

//	// 현재위치 출력
//	public abstract void location() {
//		System.out.println("[현재위치] x:" + x + "y:" + y);
//	}
//
//	// 해당 좌표로 이동
//	public void move(int x, int y) {
//		this.x = x;
//		this.y = y;
//		System.out.println(x + "x" + y + "y" + " 위치로 이동");
//	}
//
//	// 현재 위치 정지
//	public void stop() {
//		System.out.println("현재 위치 사수");
//	}

}
