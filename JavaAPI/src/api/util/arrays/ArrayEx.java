package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		//util 패키지부터는, import구문이 반드시 들어갑니다.
		
		int[] arr = {65, 34, 23, 63, 88, 1, 25};
		
		Arrays.sort(arr); //배열의 정렬
		System.out.println(Arrays.toString(arr));
		
		//	이진탐색에는 반드시 정렬이 필요함
		int index = Arrays.binarySearch(arr, 34);
		System.out.println("34가 있는 위치:" + index);
		int index2 = Arrays.binarySearch(arr, 100);
		System.out.println("찾는값이 없으면 음수값 반환:" + index2);
		
		// 배열의 복사 
		int[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(newArr));
		
		// 배열의 복사 - 범위만큼만 복사
		int[] arr2 = Arrays.copyOfRange(newArr, 0, 3); // 3미만
		System.out.println(Arrays.toString(arr2));
		
		// 배열의 내부요소가 동일한지 확인 equals() / 문자열 equals랑 다름
		if (Arrays.equals(arr, newArr)) {
			System.out.println("배열의 요소가 같음");
		} else {
			System.out.println("배열의 요소가 같지 않음");
		}
		
	}
}
