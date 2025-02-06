package collection.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
//		ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		
		//list 에 추가
		list.add("java");
		list.add("database");
		list.add("html");
		list.add("git");
		list.add("java");
		
		//list를 문자열로 한눈에 확인
		System.out.println(list.toString());
		
		//list 의 크기 확인
		System.out.println(list.size()); // list 반복을 돌릴 때, size 사용
		
		//list 의 중간에 값을 추가
		list.add(2, "css");
		System.out.println(list.toString());
		
		//list 에서 값을 얻기
		String element = list.get(3);
		System.out.println(element);
		
		//list 에 값이 포함되어 있는지 확인하기
		if(list.contains("html")) {
			System.out.println("이씀");
		} else {
			System.out.println("없씀");
		}
		
		//list 에 값 삭제
		list.remove(0); // 인덱스 번호
		System.out.println(list.toString());
		
		list.remove("git"); // 값
		System.out.println(list.toString());
		
		
		//list 에 값 변경
		
		list.set(0, "데이터베이스");
		System.out.println(list.toString());
		
		/*
		 * add - 추가
		 * get - 빼기
		 * remove - 제거
		 * set - 수정
		 */
		
		
		System.out.println("-----------------------");
		
		// 요소를 지정해서 리스트를 빨리생성
		List<String> newList = Arrays.asList("홍길동","이순신","홍길자");
		
		
		// 제네릭 <?> - 뭐든지 다들어 갈 수 있음
		// 제네릭 <? extends String> - String 이나, String 의 자식타입은 전달 가능하다.
		// 제네릭 <? super String> - String 의 형태를 가질 수 있다면 전달 가능하다. <- ?
		
		list.addAll(newList); // 컬렉션<스트링> 전달이 가능함. list, stack, ...
		
		System.out.println(list.toString());
		
		
		// 리스트 요소를 전부 삭제
		list.clear();
		System.out.println(list.toString());
		
	}
	
	
}
