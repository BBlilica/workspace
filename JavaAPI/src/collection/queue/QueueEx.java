package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

		public static void main(String[] args) {
			
			// 자바에서 기본큐는 LinkedList를 이용해서 사용합니다.
			// LinkedList를 Queue 인터페이스 저장하면, 큐 처럼 동작합니다.
			
			Queue<Integer> queue = new LinkedList<>();
			
			// offer 앞 , poll 뒤 / peek 확인
			
			//값을 추가하기 offer
			queue.offer(5);
			queue.offer(3);
			queue.offer(4);
			queue.offer(6);
			queue.offer(7);
			
			System.out.println(queue.toString());
			System.out.println("큐의 크기" + queue.size());
			
			// 값을 제거하기 poll
			System.out.println(queue.poll());
			System.out.println(queue.poll());
			
			System.out.println(queue.toString());
			
			// 앞에서 꺼낸값을 확인 peek
			System.out.println(queue.peek());
			System.out.println(queue.peek());

			// 큐에 있는 값을 순서대로 꺼내보기
			
			queue.poll();
			queue.poll();
			queue.poll();
			queue.poll();
			queue.poll();
			
			// 큐에 있는 값을 순서대로 꺼내보기
			// 큐가 비었는지 확인한 후에 ! ture : falses
			
			while(queue.isEmpty() == false) {
				System.out.println(queue.poll());
			}
			
			
			
			
		}
}
