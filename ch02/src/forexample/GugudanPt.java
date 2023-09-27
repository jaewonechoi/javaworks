package forexample;

import java.util.Scanner;

public class GugudanPt {

	public static void main(String[] args) {
		// 구구단 입력 및 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단수를 입력하세요 : ");
		int dan = scan.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}
		scan.close();
	}

}
