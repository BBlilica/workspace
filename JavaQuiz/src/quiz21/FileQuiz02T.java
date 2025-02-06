package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02T {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now =sdf.format(date);
		System.out.println(now);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + now + ".txt";
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path));
			br = new BufferedReader( new FileReader(path));
			
			while(true) {
				
				System.out.println(">");
				String str = scan.nextLine();
				
				if(str.equals("그만")) break;
				
				str += "\r\n";
				bw.write(str);
				bw.flush(); // 버퍼를 비운다.
				
			}
			
			System.out.println(" 파일 입력이 되었습니다.");
			
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
