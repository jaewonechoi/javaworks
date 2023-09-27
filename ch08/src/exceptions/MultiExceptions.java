package exceptions;

public class MultiExceptions {

	public static void main(String[] args) {
		//문자열을 숫자로 변환 - NumberFormatException
		//인덱스 범위 에러 - ArrayIndexOutOfBoundsException
		String[] array = {"100", "123a"};	//array[0], array[1]
		
		for(int i = 0; i <= array.length; i++) {
			try {
				//System.out.println(array[i]);
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없는 항목이 있습니다."); //try ~ catch할때 먼저생긴 오류부터 기재
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다."); //for문의 비교연산자 <= 때문에 2번 인덱스까지 감
			}
		}
	}
}
