package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		
		/*
		 *  1. 첫째줄에 N정수가 주어집니다.
		 *  2. 이후부터는 N줄에 걸쳐서 정수를 입력받습니다.
		 *   이 입력받은 값을, 배열에 순서대로 저장.
		 *   
		 *   배열의 크기
		 *   int[] arr = new int[크기]
		 */
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] arr = new int[a];
		int w = 0;
			while(w < arr.length) {
				arr[w] = scan.nextInt();
				w++;
			}
		System.out.println(Arrays.toString(arr));
		
	}
}
