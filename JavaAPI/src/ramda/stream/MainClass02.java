package ramda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
			list.add( new Random().nextInt(100) + 1);
		}
		
		System.out.println(list.toString());
		
		System.out.println("----------------------------------------");
		
		
		// 중복제거 distinct
		// 정렬 sorted
		
//		list.stream().distinct().sorted().forEach(a -> System.out.println(a + " ")); 
		list.stream()
			.distinct()
			.sorted( (o1, o2) -> Integer.compare(o1, o2) ) // o1, o2  오름차순
			.forEach( a -> System.out.println(a));
		
//		list.stream().distinct().forEach(a -> System.out.println(a + " "));
		
		System.out.println("\n ----------------------------------------");
		//걸러내기 filter - true 값만 필터링
		
		list.stream().filter( a -> a%2 == 0).forEach( a -> System.out.print(a + " "));
		
		System.out.println(" \n -------------------------------------------- ");
		// 스트림의 형변환 mapto~
		
		list.stream().mapToDouble(a -> a).forEach(a ->  System.out.println(a + " "));
		
		
		System.out.println("------------------------------------------------");
		//최종정리 집계함수 max, min, sum, count, average
		int max = list.stream().mapToInt(a -> a).max().getAsInt();
		int min = list.stream().mapToInt(a -> a).min().getAsInt();
		Long count = list.stream().mapToInt(a -> a).count();
		double avg = list.stream().mapToInt(a -> a).average().getAsDouble();
		int sum = list.stream().mapToInt(a -> a).sum();
		
		System.out.println("리스트에서 max 값:" + max);
		System.out.println("리스트에서 min 값:" + min);
		System.out.println("리스트에서 count 값:" + count);
		System.out.println("리스트에서 평균 값:" + avg);
		System.out.println("리스트에서 합계 값:" + sum);
		
		System.out.println("\n------------------------------------");
		//최종처리 수집함수 collect - 컬렉션타입으로 변환
		// 50보다 큰 값들만 list 로 다시 얻는다.
		
		List<Integer> newList = list.stream().filter(a -> a >= 50).collect( Collectors.toList());
		
		System.out.println(newList);
		
		//맵으로 변환
//		list.stream().filter(a->a >= 50).collect(Collectors.toMap(a -> a, a -> (char)a);
		
		System.out.println("-------------------------------------");
		
		// 리스트중에서4ㄱ르자 이상인 값ㅁ만 전부 대문자로 바꾸고, 알파벳으로 정렬한 결과를 새로운 리스트로 반환
		
		List<String> names = Arrays.asList("hong", "park", "choi", "an");
		
		List<String> result =  names.stream()
		.filter(a -> a.length() >= 4)
		.map(a -> a.toUpperCase())
		.sorted()
		.collect(Collectors.toList());
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
