package day06;

public class PhoneMain {

	public static void main(String[] args) {

		Phone phone = new Phone();
		Phone red = new Phone("red");
		Phone black = new Phone("black",30000);

		Phone myPhone = new Phone("아이폰14 Pro", "black", 16000000);

		black.info();
		red.info();
		phone.info();

		myPhone.info();

	}

}