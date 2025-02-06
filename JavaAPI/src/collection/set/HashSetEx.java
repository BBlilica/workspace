package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

		public static void main(String[] args) {
			
//			HashSet<String> set = new HashSet<>();
			Set<String> set = new HashSet<>();
			
//			값의 추가
			set.add("java");
			set.add("datebase");
			set.add("git");
			set.add("css");
			set.add("java");
			set.add("java");
			
			System.out.println("크기:" + set.size());
			System.out.println(set.toString());
			

			
//			값의 조회 - get 메서드가 없고, 반복자를 통해서 하나씩 꺼내봐야 합니다.
			Iterator<String> iter = set.iterator();
			
//			다음이 있는지 확인하고 반복
			while(iter.hasNext()) {System.out.println(iter.next());}
			
			System.out.println("-----------------------");
			
//			향상된 포문으로 할 수도 있음
			for(String s : set) {
				System.out.println(s);
			}
			
//			값의 검색
			if(set.contains("git")) {
				System.out.println("깃이 포함되오 있음");
			}
					
//			값의 삭제
			set.remove("java");
			System.out.println(set.toString());		
			
		}
}
