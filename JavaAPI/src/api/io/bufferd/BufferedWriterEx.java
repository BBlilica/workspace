   
package api.io.bufferd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

public static void main(String[] args) {
	
	
	/*
	 * 2바이트 기반에 성능향상 보조 스트릠 BufferedWriter
	 */
	
	
	
	
	String path = "C:\\\\Users\\\\user\\\\Desktop\\\\course\\\\java\\\\file\\\\test02.txt";
	Scanner scan = new Scanner(System.in);
	
	BufferedWriter  bw = null;
	
	try {
		
		 bw = new BufferedWriter(new FileWriter(path, true)); // true 를 주면 기존 파일이 있을경우, 내용을 이어서 작성하게 됩니다.
		 while (true) {
			 System.out.println(">");
			String str = scan.nextLine();
			
			if (str.equals("exit")) {
				break;
			}
			str += "\r\n"; // 줄바꿈
			bw.write(str);
			bw.flush();
		 }
		 
		 
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			bw.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
}
	
}
