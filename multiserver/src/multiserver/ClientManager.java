package multiserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientManager extends Thread {

	
	private Socket socket;
	private PrintWriter out;
	
	public ClientManager(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				//메세지 받기
				String message = br.readLine();
				System.out.println(message);
				
				if(message == null) { // 채팅방을 나간 경우
					InetAddress address = socket.getInetAddress(); // 원격 아이피 주소
					System.out.println(address.getHostAddress() + "님이 퇴장을 했습니다.");
					break;
				}
				
				
				//메세지 보내기 - 서버에 연결된 모든 사람한테 메시지 보낸다.
				for(int i = 0; i < MainServer.list.size(); i++) {
					PrintWriter out = MainServer.list.get(i);
					out.println(message); // 상대방에게 전달
					out.flush();
				}
				
				
			}
			
			// 종료되는 시점에 list에 해당 PrinterWriter를 제거
			MainServer.list.remove(out);
			System.out.println("인원:" + MainServer.list.size());
			
			br.close();
			out.close();
			socket.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
