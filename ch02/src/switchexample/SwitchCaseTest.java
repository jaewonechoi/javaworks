package switchexample;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// 랭킹에 따른 메달 출력
		// 1등 - 금메달, 2등 - 은메달, 3등 - 동메달
		// 변수 - rank
		Scanner scan = new Scanner(System.in);
		System.out.print("등수를 입력하세요 : ");
		int rank = scan.nextInt();
		
		switch(rank) {
		case 1: //콜론으로 끝나야함
			System.out.println("금메달 입니다.");
			break;
		case 2:
			System.out.println("은메달 입니다.");
			break;
		case 3:
			System.out.println("동메달 입니다.");
			break;
		default:  //case가 없는 경우 처리
			System.out.println("해당사항이 없습니다.");
		}
		scan.close();
	}

}
