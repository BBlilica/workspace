package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

		public static void main(String[] args) {
			
			
			Date date = new Date();
			System.out.println(date);
			
			//simpleDateFromat - 날짜형 -> 문자형 포맷
			
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 DD일 a hh시 mm분 ss초 E요일");
			String result = sdf.format(date);
			System.out.println(result);
			
			
			
			
			
		}
}
