package array2d;

public class ArrayAphabet2 {

	public static void main(String[] args) {
		// 2차원 배열에 알파벳 소문자 저장하기
		char[][] alphabets = new char[2][13];
		char ch = 'a';
		
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch++;
			}
		}
		
		//배열 요소 전체 출력
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();
		}
	}

}
