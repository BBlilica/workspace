package quiz02;

import java.util.Scanner;

public class AccountMain {
public static void main(String[] args) {
	
	
	Account acc = new Account("K","D",1000);
	
	acc.info();
	acc.deposit(100);
	acc.withDraw(100);
	acc.getBalance();
	
}
	
	
	
}
