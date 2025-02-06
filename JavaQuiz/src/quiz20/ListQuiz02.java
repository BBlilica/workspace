package quiz20;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz02 {
	
	public static void main(String[] args) {
		/*
		 * 1. User클래스는 은닉된 변수로 name, age를 선언.
		 *    User클래스의 생성자도 선언.
		 * 
		 * 2. User클래스를 저장할 수 있는 ArrayList선언
		 * 3. User객체를 2개 생성해서 리스트에 추가하세요.
		 * 
		 * 4. list에 저장된 모든 이름,나이를 for문으로 출력, 향상된 for문으로 출력
		 * 5. list에 "홍길자" 가 있다면 홍길자의 이름, 나이만 출력
		 * 
		 * 6. list에 "홍길동" 이 있다면 객체를 삭제.   
		 */
		
		List<User> list = new ArrayList<>();
		
		User user1 = new User("홍길동", 20); //  list.add(new user("홍길동", 20)); 
		User user2 = new User("홍길자", 18);
		User user3 = new User("홍길손", 2);
		User user = new User();
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		
		for(int i = 0; i < list.size(); i++) {
			user = list.get(i);
			System.out.println(user.getName()+ " " + user.getAge());
		}
		
		System.out.println("-----------------");
		
		for(User u : list) {
			System.out.println(u.getName());
			System.out.println(u.getAge());
		}
		
		System.out.println("------------------");
		
		for(int j = 0; j < list.size(); j++) {
			user = list.get(j);
			if(user.getName().equals("홍길자")) {
				System.out.println(user.getName()+" "+user.getAge());
			}
		}
		System.out.println("------------------");
		
		for(User u : list) {
			String name = u.getName();
			if(name.equals("홍길자")) {
				System.out.println(u.getName());
				System.out.println(u.getAge());
			}
		}
		
		System.out.println("-----------------");
		
		for(int q = 0; q < list.size(); q++) {
			user = list.get(q);
			if(user.getName().equals("홍길동")) {
				list.remove(q);
				}
			for(int w = 0; w < list.size(); w++) {
				user = list.get(w);
				System.out.println(user.getName()+" "+user.getAge());
			}break;
		}
		System.out.println("-------------------------");
		
		for(int l = 0; l < list.size(); l++) {
			
			if(list.get(l).getName().equals("홍길동")) {
				list.remove(l);
				System.out.println("홍길동 삭제!");
			}
			
			
		}
		
		
		
	}
}
