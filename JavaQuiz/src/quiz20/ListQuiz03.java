package quiz20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz03 {

	public static void main(String[] args) {
		/*
		 *  회원정보 프로그램 시뮬레이터
		 *  
		 *  무한반복문 안에서 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
		 *  
		 *  메뉴 1.유저등록, 2.전체회원정보출력 3.회원정보검색, 4.회원정보삭제, 5.프로그램종료
		 *  
		 *  1. 스캐너로 name, age 입력 받아서 User객체를 리스트에 추가.
		 *  2. 모든 회원 정보를 출력하면 됩니다.
		 *  3. 찾을 이름을 입력받아서, 이름이 있으면, 이름과 나이를 출력.
		 *  	찾는 이름이 없으면 "~~ 님은 목록에 없습니다" 를 출력합니다.
		 *  4. 삭제할 이름을 입력받아서, 동일한 이름을 가진 회원이 있으면 User를 삭제
		 *  5. 종료
		 *  
		 *  
		 */
		List<User> list = new ArrayList<>();
		
//		User user = new User();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.유저등록 2.전체회원정보출력 3.회원정보검색 4.회원정보삭제 5.프로그램종료");
			int a = scan.nextInt();
			
			if(a == 1) {
				System.out.println("이름>");
				String name = scan.next();
				System.out.println("나이>");
				int age = scan.nextInt();
				
				User user = new User(name, age); // <- !주의 
				list.add(user);
				System.out.println("유저등록완료");
			}
			if(a == 2) {
				System.out.println("전체회원정보");
				for(int i = 0; i < list.size(); i++) {
					User info = list.get(i);
					System.out.println("이름: " + info.getName() + " " + "나이: " + info.getAge());
				}
			}
			if(a == 3) {
				System.out.println("검색할 회원 이름>");
				String name = scan.next();
				
				boolean bool = true;
				
				for(User u : list) {
					if(u.getName().equals(name)) {
						System.out.println("이름: " + u.getName() + " " + "나이: " + u.getAge());
						bool = false;
					} 
				}
				
				if(bool) {
					System.out.println(name + "없음");
				}
			}
			if(a == 4) {
				System.out.println("삭제할 회원이름");
				String name = scan.next();
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println("삭제완료");
					}
				}
			}
			if(a == 5) {
				System.out.println("!프로그램 종료!");
				break;
			}
		}
		
	}
	
	
}
