

package quiz20;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {
	public static void main(String[] args) {
		
		
		
		
		/*
		 * 로또번호 자동생성기
		 * Set 을 이용해서 6개의 랜덤한 로또 번호를 만들어내는 프로그램 코드를 작성해보세요.
		 * 
		 * 1 ~ 45번
		 * 6개
		 */
		
		Set<Integer> set = new TreeSet<>();
		
		Random ran = new Random();
		
		while(true) { // set.size() != 6 / set.size() == 6
			set.add(ran.nextInt(65)+1);
			if(set.size() == 6) {
				System.out.println(set.toString());
				break;
			}
		}
	}
}
