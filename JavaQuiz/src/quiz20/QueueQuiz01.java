package quiz20;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz01 {

		public static void main(String[] args) {
			
			/*
			 * 은행 대기열 시뮬레이터
			 * Queue 인터페이스와 linkedlist 를 활용하여 대기열을 관리하세요.
			 * 손님 정보는 Customer라는 클래스로 생성합니다.
			 * Customoer 은 name, arrivalTime을 가지고 있습니다.
			 * arrivatime은 업무처리 소요시간 입니다 (1~3랜덤값을 초기값으로 주면 됩니다)
			 * 
			 * 손님은 60%의 확률로 도착하고 (랜덤.nextint(100) < 60)
			 * 대기열이 비어있지 않을 때, 50% 활률로 업무가 처리됩니다. (랜덤.nextint(100) <50 )
			 * 
			 * 30회 시뮬레이터를 거쳤을 때, 총 소요시간과 처리하지 못한 손님을 출력해 주세요.
			 * 
			 */
			
			Queue<Customer> que = new LinkedList<>();
			Random random = new Random();
			int sum = 0; // 누적시간
			
			
			for(int i = 1; i < 30; i++) {
				
				if( random.nextInt(100) < 60) { // 손님이 도착했습니다.
					que.offer( new Customer("Customer" + i) );
					System.out.println("Customer" + i + "손님이 도착했습니다.");
				}
				System.out.println("현재대기열:" + que.toString());
				
				if( !que.isEmpty() && random.nextInt(100) < 50) {
					Customer c = que.poll();
					sum += c.getArriviaTime(); // 시간 누적
					System.out.println(c.getName() + "님의 업무가 처리되었습니다.");
				}
				
				
				try {
					Thread.sleep(1000); // 1초 일시정지
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				
				
				
				
				
			}
			
				System.out.println("총 소요시간:" + sum);
				
				System.out.println("처리되디 못한 손님");
				for(Customer m : que) {
					System.out.println(m.getName() + " ");
				
				}
			
		}
}
