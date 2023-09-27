package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// LocalDateTime 클래스 사용
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//날짜 / 시간 포맷 설정 - "yyyy/MM/dd hh:mm:ss a" HH대문자로쓰면 24시간으로 표기
		DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a"); //괄호안의 형태로 포맷
		
		System.out.println(now.format(dtFormat));
		
		//날짜만 설정
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//시간만 설정
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//시간 포맷 설정 - "hh:mm:ss a"
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss a");
		System.out.println(time.format(timeFormat));
		
		//특정 날짜 지정하기
		LocalDate startDay = LocalDate.of(2023, 8, 1);
		LocalDate today = LocalDate.of(2023, 9, 15);
		
		//지나온 날짜 계산하기
		long passedTime = ChronoUnit.DAYS.between(startDay, today);
		System.out.println(passedTime + "일이 지났습니다");		
	}

}
