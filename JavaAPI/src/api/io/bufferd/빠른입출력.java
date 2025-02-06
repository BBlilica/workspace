package api.io.bufferd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 빠른입출력 {
	
	public static void main(String[] args) {
		
//		System.out.println(); // 출력
//		Scanner scan = new Scanner(System.in); // 입력
		
		/*
		 * 빠른 입출력에서는
		 * InputStreamReader
		 * OutputStreamWriter 클래스를 사용합니다.
		 */
		
		
		
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			int count = br.read();
			for(int i = 1; i <= count; i++ ) {
			System.out.println(">");
			int a = br.read();
			int b = br.read();
			
			int c = a + b;
			
			
			// 입력받은 내용을 출력함
			bw.write(c);
			bw.flush();
			///////////////////////////////////
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
	}
}
