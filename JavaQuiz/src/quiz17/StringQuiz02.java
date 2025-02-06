package quiz17;


public class StringQuiz02 {

	/*
	 * 문자열 거꾸로 뒤집기
	 * 
	 * 매개변수로 전달받은 문자열을, 거꾸로 뒤집어서 반환하는 메서드를 생성하세요
	 * 
	 * reverse(String) 입력 -> abcde 반환 -> edcba
	 * 
	 */

	public static String reverse(String a) {
		String str = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			str += a.charAt(i);
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(reverse("abcdef"));
		System.out.println(reverse("qwer"));
	}

}
