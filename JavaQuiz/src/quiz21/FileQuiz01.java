package quiz21;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileQuiz01 {

		public static void main(String[] args) {
			
			/*
			 * 1.스캐너를 이용해서 파일명을 입력 받습니다.
			 * 2.file폴더 하위에 입력받은 파일명으로 파일을 씁니다.
			 * 3.파일을 쓸 때, "쓰고 싶은 말"을 사용자에게 입력 받습니다.
			 * 
			 * 
			 */
			
			
			
			
			Scanner scan = new Scanner(System.in);
			
			String fn = scan.next();
			
			String fpath = "C:\\\\Users\\\\user\\\\Desktop\\\\course\\\\java\\\\";
			
			String path = fpath + fn;
			
			
			Writer fw = null;
			
			try {
				
				fw = new FileWriter(path);
				
				String str = scan.nextLine();
				
				fw.write(str);
				
				System.out.println("입력값 추출~");
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					fw.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
			
			
			
		}
}
