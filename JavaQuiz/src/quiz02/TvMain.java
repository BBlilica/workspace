package quiz02;

public class TvMain {
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.info();
		tv.changeChannel(2);
		tv.info();
		tv.power();
		tv.power();
		tv.power();
		tv.info();
		tv.power();
		tv.info();
	}
}
