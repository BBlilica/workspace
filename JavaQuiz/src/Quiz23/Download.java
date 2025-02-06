package Quiz23;

public class Download implements Runnable {

	@Override
	public void run() {
		
		System.out.print("동영상 다운을 시작합니다.");
		
//		StringBuilder sb = new StringBuilder(); // StringBuffer - 싱글스레드 전용.
		
		
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print("*");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			
			
		}
		System.out.println("\n동영상 다운로드가 완료되었습니다.");
		
	}

}
