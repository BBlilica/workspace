package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {
		/*
		 * 1.날짜 클래스를 이용해서 file 경로에 20250124.txt 이름으로 파일을 씁니다.
		 * 2.내용은 "그만" 을 입력할 때 까지 작성해 주면 됩니다.
		 * 3.파일을 썻다면, BufferedReader 를 이용해서 파일이 내용을 읽어 들이세요.
		 */
		Scanner scan = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		String a = date.toString();
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file" + a.replace("-", "") +".txt";
		BufferedWriter br = null;
		BufferedReader rd = null;
		
		
		try {
			while(true) {
			br = new BufferedWriter(new FileWriter(path));
			System.out.println(">");
			String str = scan.nextLine();
			
			if(str.equals("그만")) {
				break;
			}
			str += "\r\n";
			br.write(str);
			}
			br.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				
			}
		}
		
		try {
			
			 rd = new BufferedReader(new FileReader(path));
			String str;
			while( (str = rd.readLine()) != null) {
				 System.out.println(str);
			 }
			
			 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rd.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
