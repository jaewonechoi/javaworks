package forexample;

public class Star {

	public static void main(String[] args) {
		/*반복문을 사용하여 다음 모양을 출력하는 프로그램 만들기
		 * 
		*** 
	   *****
	  ******* 
		 */
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
