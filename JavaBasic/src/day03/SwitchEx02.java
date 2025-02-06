package day03;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		//switch 문장은 elseif문과 90% 유샇마
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수>");
		int point = scan.nextInt();
		
		switch (point / 10) {//switch 문장에 소괄호에서 변수 or 변수의 연산식 들어가쑬 있음.
		case 9: //90 ~ 99
			if(point >= 95) {	
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
			break;
		case 8: //80 ~ 89
			System.out.println("B학점");
			break;
		case 7: //70 ~ 79
			System.out.println("C학점");
			default:
				System.out.println("재수강");
				break;
		}
		
	}
}
