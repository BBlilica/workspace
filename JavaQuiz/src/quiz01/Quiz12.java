package quiz01;

public class Quiz12 {
		public static void main(String[] args) {
			
			int[] arr = {1000, 500, 100, 50, 10};
			int money = 17780;
			// 가장 최선의 방법으로 금액을 거슬러주면 됩니다.
			int a = 0;
			int b = 0;
			int c = 0;
			
			
			while(a < arr.length) {
				System.out.println(arr[a] + "원" + money / arr[a]);
				money = money % arr[a];
				a++;
			}
		}

}
