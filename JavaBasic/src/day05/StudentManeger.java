package day05;

import java.util.Scanner;

public class StudentManeger {
	
	static Scanner scan = new Scanner(System.in);
	
	static String[] nameList = new String[100]; // 배열크기 고정
	static int[] ageList = new int[100];
	static int count = 0; // 고객수
	static int index = -1; // 위에 있는 배열을 조회하는 위치(포인터)
	// 예를 들어서 index = 0이면, 배열의 0번째 위치를 조회하고 있음

	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("[현재고객수]:" + count + "\n[조회위치]:" + index);
			System.out.println("[메뉴] 1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.프로그램종료");
			System.out.println("메뉴입력>");
			String menu = scan.next();
			
			switch (menu) {
			case "1": 
				System.out.println("====== 회원 정보를 입력합니다 =====");
				add();
				System.out.println("회원정보 입력 성공");
				break;
			case "2": 
				System.out.println("===== 이전 회원정보를 출력합니다 =====");
				if(index <= 0) {
					System.out.println("< 그런거 없다 >");
				} else {
					index--;
					printInfo();
				}
				
				
				break;
			case "3":
				System.out.println("====== 다음 회원정보를 출력합니다 =====");
				
				if(index >= count - 1) {
					System.out.println("< 그런거 없다 >");
				} else {
					index++;
					printInfo();
				}
				
				break;
			case "4": 
				/*
				 * 현재 index가 가르키고 있는 위치의 정보를 출력해주면 됩니다.
				 * 
				 * 출력이 가능한 조건
				 * index >= 0, index <= count - 1 보다 작으면 출력이 가능합니다.
				 */
				System.out.println("===== 현재 정보를 출력합니다 =====");
				if(index >= 0 & index <= count -1) {
					printInfo();
				} else {
					System.out.println("< 그런거 없다 >");
				}
				break;
			case "5": 
				/*
				 * 정보수정
				 * 새로운 이름, 나이를 입력받아서
				 * 현재위치를 수정해주면 됩니다.
				 * 
				 * 현재위치가 수정가능한 조건을 생각해 보세요.
				 */
				System.out.println("===== 수정할 정보를 입력하세요 =====");
				modify();
				break;
			case "6": 
				/*
				 * 정보삭제
				 * 현재삭제하려는 index 위치부터 ~ 뒤에 있는 배열 요소를 당겨와서 덮어 씌어줍니다.
				 * count를 감소
				 * 
				 * 삭제가 가능한 조건은 위와 동일
				 */
				if(index < 0) {
					System.out.println("< 그럴 정보가 없다 >");
				
				
				} 
					System.out.println("===== 회원 정보를 삭제하시겠습니까? =====");
					System.out.println("yes or no");
					String b = scan.next();
				if(b.equals("yes")) {
					System.out.println("< 회원정보를 삭제 했습니다 >");
					deleteInfo();
					break;
				} if(b.equals("no")) {
					System.out.println("< 정보삭제를 취소합니다 >");
				}
				
				
				break;
			case "7": 
				System.out.println("===== 프로그램을 종료합니다 =====");
				//return;
				System.exit(0);
			default:
				System.out.println("===== 다시 입력해주세요 =====");
				break;
			}
			
		}
		
		
	}
	
	static void add() {
		
		System.out.print("이름> ");
		String name = scan.next();
		System.out.print("나이> ");
		int age = scan.nextInt();
		
		nameList[count] = name;
		ageList[count] = age;
		count++; //고객수 증가
	}
	
	static void printInfo() {
		System.out.println("이름: " + nameList[index]);
		System.out.println("나이: " + ageList[index]);
	}
	
	static void modify() {
		if(index >= 0 & index <= nameList.length - 1) {
		System.out.print("이름: ");
		String modifyName = scan.next();
		System.out.print("나이: ");
		int modifyAge = scan.nextInt();
		nameList[index] = modifyName;
		ageList[index] = modifyAge;
		System.out.println("===== 정보를 수정하였습니다 =====");
		}
	}
	
	static void deleteInfo() {
		if(index >= 0 & index <= nameList.length -1) {
			
			for(int i = index; i < nameList.length -1; i++) {
				nameList[index] = nameList[index + 1];
				ageList[index] = ageList[index + 1];
				
			}
			count--;
		} 
		
	}
	
	
	
}
