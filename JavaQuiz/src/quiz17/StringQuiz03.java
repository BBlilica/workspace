package quiz17;

public class StringQuiz03 {
	
	/*
	 * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 함수를
	 * 
	 * 팰린드롬(회문)이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
	 * 
	 * level, noon 은 팰린드롬익, backjoon, online, judge 는 팰린드롬이 아니다.
	 * 
	 * boolean palindrom(String word) : 팰린드롬이면 true, 아니면 false 을 반환한다.
	 */
	
//	public static boolean palindrom(String word) {
//		StringBuilder sb = new StringBuilder(word);
//		sb.reverse();
//		
//		String sbs = sb.toString();
//		if(word.equals(sbs)) {
//			return true;
//		} else {
//		return false;
//		}
//	}
//	public static void main(String[] args) {
//		System.out.println(palindrom("level"));
//		System.out.println(palindrom("nope"));
//	}
	
	public static void main(String[] args) {
		System.out.println( palindrom("noon"));
		System.out.println( palindrom("level"));
		System.out.println( palindrom("backjoon"));
		System.out.println( palindrom("k"));
	}
	
	public static boolean palindrom(String word) {
//		for(int i = 0; i < word.length() /2 ; i++) {
//			if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
//				return false;
//			}
//		}
//		return true;
		
		StringBuilder sb = new StringBuilder(word);
//		sb.reverse();
//		String newWord = sb.toString();
//		return word.equals(newWord);
		return new StringBuilder(word).reverse().toString().equals(word);
	}
	
	
}
