package bankingpt;

import java.util.Scanner;

public class Banking {
	static AccountPt[] accounts = new AccountPt[100];
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean sw = true;
		
		while(sw) {
			System.out.println("=================================================");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.입금 | 4. 출금 | 5.종료");
			System.out.println("=================================================");
			System.out.print("메뉴를 선택해주세요> ");			
			int selectNum = Integer.parseInt(scan.nextLine());
			
			if(selectNum == 1) {
				//createAccount();
			}else if(selectNum ==2) {
				//getAccountList();
			}else if(selectNum ==3) {
				//deposit();
			}else if(selectNum ==4) {
				//withdraw();
			}else if(selectNum ==5) {
				sw = false;
			}else {
				System.out.println("지원하지 않는 기능입니다. 다시 입력해주세요");
			}	
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	//계좌 생성
	private static void createAccount() {
		System.out.println("-------------------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("-------------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		
		
		
		}
	
	//계좌 조회
	
	
	
	//예금
	
	
	
	//출금
	
	
	
	//계좌 검색
	
}
