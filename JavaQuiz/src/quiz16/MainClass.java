package quiz16;

public class MainClass {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		try {
			int result = cal.input();
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
