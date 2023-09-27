package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimePt1 {

	public static void main(String[] args) {
		// LocalDateTime 클래스 반복사용으로 체화
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		//날짜 / 시간 포맷 설정 - "yyyy/MM/dd hh:mm:ss a" HH대문자로쓰면 24시간으로 표기
		DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
		System.out.println(today.format(dtFormat));
		
		//날짜만 설정
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//시간만 설정
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//시간 포맷 설정 - "hh:mm:ss a"
		DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH:mm:ss a");
		System.out.println(time.format(timeformat));
	}

}
