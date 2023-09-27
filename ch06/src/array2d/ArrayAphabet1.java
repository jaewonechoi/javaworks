package array2d;

public class ArrayAphabet1 {

	public static void main(String[] args) {
		// 알파벳 대문자 26자를 배열에 저장
		// for문 출력
		/*char c = 'A';
		System.out.println(c);
		System.out.println((int)c);
		
		char c2 = 66;
		System.out.println(c2);*/
		System.out.println("==== 일반 for문을 사용하여 알파벳 출력 ====");
		char c; //변수 선언
		for(c = 65; c <= 90; c++) { //65는 아스키코드값
			System.out.print(c + " ");
		}
		System.out.println("\n변수의 마지막 값: " + (char)(c-1)); //for문을 빠져나왔기때문에 마지막값만 나옴
		
		//배열로 출력
		System.out.println("\n== 알파벳을 배열에 저장하고 출력 == ");
		char[] alphabet = new char[26];
		char ch = 'A';
		
		alphabet[0] = ch;
		System.out.println(alphabet[0]);  //A
		
		//alphabet[1] = (char)(ch + 1);  //자바에서 덧셈연산하면 int형으로 바뀜 -> 다시 char로 형변환
		
		//ch++;  //ch = ch + 1  -> 1증가(후증가)
		//alphabet[1] = ch;  //자바에서 덧셈연산하면 int형으로 바뀜 -> 다시 char로 형변환
		//System.out.println(alphabet[1]);
		
		//알파벳을 배열에 저장 -> 1씩 증가
		for(int i = 0; i < alphabet.length; i++) { //배열에 알파벳을 저장
			alphabet[i] = ch;
			ch++;
			System.out.print(alphabet[i] + " ");
		}
		
		//알파벳 출력
		/*for(int i = 0; i < alphabet.length; i++) { //배열에 저장한 알파벳 출력
			System.out.print(alphabet[i] + " ");
		}*/
	}

}
