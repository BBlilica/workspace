package quiz10;

public class Main {

	public static void main(String[] args) {
		
//		Computer com = new Computer();
		
		Computer com = new Computer(new KeyBoard(), new Mouse(), new Monitor());

		Monitor monitor = com.getMonitor();
		monitor.info();
		
		Mouse mouse = com.getMouse();
		mouse.info();
		
	}

}
