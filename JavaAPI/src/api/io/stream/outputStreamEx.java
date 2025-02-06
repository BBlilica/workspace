package api.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class outputStreamEx {

		public static void main(String[] args) {
			
			/*
			 * i/o 패키지의 모든 클래스는 생성자가 throws 키워드를 던지고 있어서
			 * 모두 try ~ catch 블록과 함께 사용합니다.
			 * 
			 * 
			 * 
			 */
			
			
			String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\hello.txt";
			OutputStream fos = null; //바깥에 선언
			
			try {
				fos = new FileOutputStream(path); // 안에서 생성
				
				
				String str = "길동아! 잠깨!!";
				fos.write(str.getBytes());
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fos.close();
				} catch (Exception e2) {
					
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
