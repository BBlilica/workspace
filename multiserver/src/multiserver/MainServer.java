package multiserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MainServer {

	// <소켓>
	public static ArrayList<PrintWriter> list = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
//		서버
		
		try {
			ServerSocket serverSocket =  new ServerSocket(8181);
			
			while(true) {
				System.out.println("****연결 대기중****");
				Socket clientSocket = serverSocket.accept();
				System.out.println("****연결 성공****");
				
				// 다중 클라이언트 연결을 위해서 연결들어오는 socket객체를 리스트로 관리
				// 데이터 받기 연습
				
				PrintWriter pt = new PrintWriter(clientSocket.getOutputStream());
				list.add(pt);
				
				ClientManager manager = new ClientManager(clientSocket);
				manager.start(); //스레드 시작
			}
			
//			OutputStream os =  clientSocket.getOutputStream();
//			os.write("얌마".getBytes());
//			os.flush();
//			
//			serverSocket.close();
//			clientSocket.close();
			
//			데이터 받기
//			BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), "UTF-8"));
//			
//			while(true) {
//				String message = br.readLine();
//				System.out.println(message);
//			}
			
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
