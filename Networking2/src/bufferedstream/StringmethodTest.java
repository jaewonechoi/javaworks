package bufferedstream;

import java.util.Arrays;

public class StringmethodTest {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		subject.charAt(0);	//문자열의 인덱스번호의 문자 추출
		
		System.out.println(subject.charAt(4));
		
		subject.indexOf("프");	//문자열의 인덱스번호 추출
		
		System.out.println(subject.indexOf("프"));
		
		//split() 사용 - 구분 기호(,(쉼표), " "(공백문자), :(콜론))
		String[] word = subject.split(" ");
		System.out.println(Arrays.toString(word));
		
		System.out.println(word[0]);
		System.out.println(word[1]);
		
		//전화 번호
		String phone = "010-1234-5678";
		String[] number = phone.split("-");
		System.out.println(Arrays.toString(number));
		
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
	}

}
