package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		메뉴관리 시뮬레이터
		
		무한 반복문안에서 음식 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
		
		* 음식메뉴는 key로 등록하고 가격은 value로 등록합니다.
		음식 메뉴 정보
		1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료
		
		1. 이미 등록된 메뉴인지 확인 후에 메뉴 등록
		2. 메뉴와 가격을 전부 출력
		3. 변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
		4. 변경할 메뉴를 받아서 메뉴가 있다면 삭제
		5. 프로그램 종료
		*/
		
		Map<String, Integer> menu = new HashMap<>();
		Map<String, Integer> inputMenu = new HashMap<>();
		Set<Entry<String, Integer>> entrySet = menu.entrySet();
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("음식 메뉴 정보\n1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료");
			
			int cursor = scan.nextInt();
			
			
			if(cursor == 1) {
				
				System.out.println("등록할 메뉴의 이름과 가격을 입력해주세요");
				String name = scan.next();
				int value = scan.nextInt();
				if(menu.containsKey(name)) {
					System.out.println("이미 존재하는 메뉴입니다.");
				} else {
					menu.put(name, value);
					System.out.println("메뉴가 등록되었습니다.\n메뉴명:" + name + " 가격:" + value);
					
				}
				
				
			}
			if(cursor == 2) {
				if(menu.size() > 0) {
					for(Entry<String, Integer> entry : entrySet) {
						System.out.println(entry.getKey() + " " + entry.getValue());
					}
				}else if (menu.size() <= 0) {
					System.out.println("등록된 메뉴가 없습니다.");
				}
				
			}
			if(cursor == 3) {
				System.out.println("수정할 메뉴명을 입력해주세요.");
				for(Entry<String, Integer> entry : entrySet) {
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
				String config = scan.next();
				if(menu.containsKey(config)) {
					System.out.println("선택하신 메뉴:" + config + " 가격:" + menu.get(config));
					System.out.println("수정할 가격을 입력해주세요.");
					int conValue = scan.nextInt();
					menu.put(config, conValue);
					System.out.println("수정되었습니다." + menu.get(config));
				} else {
					System.out.println("존재하지 않는 메뉴 입니다.");
				}
				
				
			}
			if( cursor == 4) {
				System.out.println("삭제하실 메뉴를 선택해주세요.");
				for(Entry<String, Integer> entry : entrySet) {
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
				String delName = scan.next();
				if(menu.containsKey(delName)) {
					menu.remove(delName);
					System.out.println("메뉴를 삭제합니다.\n 삭제된 메뉴:" + delName);
				} else {
					System.out.println("없는 메뉴를 삭제합니까?");
				}
				
				
			}
			if( cursor == 5) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(1);
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}
}
