package quiz20;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Setquiz02 {
	public static void main(String[] args) {

		/*
		 * 로또기기 당첨 시뮬레이터!
		 * 
		 * {5, 23, 35, 7, 41, 13} 이 번호가 당첨 번호입니다. 랜덤한 로또번호 6개를 생성해서, 당첨 번호와 일치하는지 확인합니다.
		 * 몇 번의 시도 끝에 당첨되는지 계산하고, 소요된 비용을 출력하세요. 로또 1회 구매 비용은 1,000원입니다.
		 * 
		 * 힌트) set이 요소가 동일한지 확인하는 메서드는 set.equals(set) 입니다
		 */

		Integer[] arr = {5, 23, 35, 7, 41, 13};
		List<Integer> list = Arrays.asList(arr); 
		
		Set<Integer> set2 = new TreeSet<>(list); 
		Set<Integer> set = new TreeSet<>(); 
		Random ran = new Random();
		
		long i = 0;
		
		while (true) {

			set.add(ran.nextInt(45) + 1);

			if (set.size() == 6) {
				i++;

				if (set.equals(set2)) {
					System.out.println("당첨번호:" + set.toString());
					System.out.println(i + "회 진행" + (i * 1000) + "원 사용");
					break;
				} else {
					set.clear();
				}
			}

		}

	}
}
