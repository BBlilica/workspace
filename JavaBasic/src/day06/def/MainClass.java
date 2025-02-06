package day06.def;

import java.util.Scanner;

//import day06.abc.Apple; //다른 패키지의 클래스를 사용할 때 import 추가
//import day06.abc.Melon;

//해당 패키지의 모든 클래스를 한번에 import 하려며
import day06.abc.*;


public class MainClass {
	
	public static void main(String[] args) {
		
		Apple a = new Apple();
		Melon m = new Melon();
		
		Scanner scan = new Scanner(System.in);
		
		
		int i = 1;
		System.out.println(i);
		
		System.out.println(a); // 주소값이 출력 됨.
		
		
		
		
	}
	
}
