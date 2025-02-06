package day07.overrloading.basic;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		basic b = new basic();
		
		b.abc("a", 1);
		b.abc(1, "a");
		b.abc(3.14);
		
		
		
	}
}
