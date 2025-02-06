package quiz01;

public class Quiz08 {
	public static void main(String[] args) {
		
		String[] arr = {"안녕하세요","hello", "尼河吳(니하오)", "!@#$"};
		/*
		 * 랜덤한 배열의 요소를 선택하고, 이 랜덤한 배열 요소에 따른 국가별 언어를
		 * 출력하면 됩니다.
		 */
		
		int a = (int)(Math.random()*4);
		
		switch (a) {
			case 0:	
				System.out.print("선택된 단어: " + arr[0] + "\n" + "한국어입니다." );
				break;
			case 1:
				System.out.println("선택된 단어:" + arr[1] + "\n" + "영어입니다.");
				break;
			case 2:
				System.out.println("선택된 단어:" + arr[2] + "\n" + "중국어입니다.");
				break;
			case 3:
				System.out.println("선택된 단어:" + arr[3] + "\n" + "외ㄱㅖㅇㅓ입니다.");
				break;
		}
	}
}
