package api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {

	public static void main(String[] args) {

		/*
		 * LocalDate 클래스 - 년 월 일 정보
		 * 
		 * LocalTime 클래스 - 시 분 초 정보
		 * 
		 * LocalDateTime 클래스 - 년 월 일 시 분초 정보
		 * 
		 * 
		 */

		LocalDate now = LocalDate.now(); // 지금 날짜
		System.out.println(now);

		LocalDate ofDate = LocalDate.of(2022, 2, 12); // 년 월 일 지정
		System.out.println(ofDate);
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		// 로컬데이트 타임 -> 문자형으로 포맷
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY년 MM월 DD일 a hh시 mm분 ss초 E요일");
		String time2 = time.format(dtf);
		System.out.println(time2);
		
		
	}
}
