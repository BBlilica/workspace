package quiz09;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		System.out.println("----------문제1----------");
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
		 */
		
		//User u1 = new User("홍길동",123123,20);
		User i = new User();
		i.setName("홍길동");
		i.setRrn(123123);
		i.setAge(20);
		
		System.out.println(i.getName()+"\n"+ i.getRrn() + "\n" + i.getAge());
		
		
		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */
		
		User[] u = new User[2];
		
		User j = new User();
		j.setName("김길동");
		j.setRrn(456456);
		j.setAge(30);
		
		u[0] = i;
		u[1] = j;
		//u[1] = new User("김길동", 456456,30);
		for(int r = 0; r < u.length; r++) {
			User k = u[r];
			System.out.println(k.getName());
			System.out.println(k.getRrn());
			System.out.println(k.getAge());
		}
		
		/*
		 * 향상된 for문
		 * 
		 * for(User u : arr) {
		 * syso(u.getName());}
		 */

		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		
		User[] arr2 = new User[5];
		Scanner scan = new Scanner(System.in);
		
		
		int I = 0;
		while(I < arr2.length) {
			
			// 1. name, rrn, age 입력
			String name = scan.next();
			int rrn = scan.nextInt();
			int age = scan.nextInt();
			
			// 2. 새로운 User 객체에 저장
			User user = new User(name, rrn, age);
			// 3. arr2에 User 저장
			arr2[I] = user;
			I++;
		}
		
		
		
		
	}
	
}
