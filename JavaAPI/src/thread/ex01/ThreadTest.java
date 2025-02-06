package thread.ex01;

public class ThreadTest implements Runnable{

	
	// 1. runable 인터페이스를 상속받아서 사용하는 방법
	
	int num = 0;
	
	@Override
	public void run() {
		
		
		
		for(int i = 1; i<= 10; i++) {
			num++;
			
			System.out.println(Thread.currentThread().getName() + ", num값:" + num);
			
			// 일시정지
			
			try {
				Thread.sleep(1000); // 밀리초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

		
		
		
	}

