package bankingpt;

import java.util.Scanner;

public class BankingTest {
	
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
				createAccount();
			}else if(selectNum == 2){
				getAccountList();
			}else if(selectNum == 3){
				deposit();
			}else if(selectNum == 4){
				withdraw();
			}else if(selectNum == 5){
				sw = false;
			}else {
				System.out.println("지원하지 않는 기능입니다. 다시 입력해주세요.");
			}
		}
		System.out.print("프로그램을 종료합니다.");
	}
	
	//계좌 생성
	private static void createAccount() {
		System.out.println("-------------------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("-------------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		if(findAccount(ano) != null) {
			System.out.println("계좌가 중복되었습니다. 다시 입력해 주세요.");
			return;
		}
		
		System.out.print("계좌주: ");
		String owner = scan.nextLine();
		
		System.out.print("초기 입금액: ");
		int balance = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = new AccountPt(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌 목록
	private static void getAccountList() {
		System.out.println("-------------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("-------------------------------------------------");
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				System.out.print("계좌번호: " + accounts[i].getAno() + "\t");
				System.out.print("계좌주: " + accounts[i].getOwner() + "\t");
				System.out.printf("잔고: %,d", accounts[i].getBalance());
				System.out.println();
			}
		}
	}
	
	//예금
	private static void deposit() {
		System.out.println("-------------------------------------------------");
		System.out.println("입금");
		System.out.println("-------------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		if(findAccount(ano) == null) {
			System.out.println("없는 계좌입니다. 다시 입력해 주세요.");
			return;
		}
		
		System.out.print("입금액: ");
		int money = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < accounts.length; i++) {
			if(findAccount(ano) != null) {  //입력한 계좌가 null이 아니라면 계속 검색
				AccountPt account = findAccount(ano);  //검색한 계좌를 account에 저장
				account.setBalance(account.getBalance() + money);
				System.out.println("정상 입금 되었습니다.");
				break;
			}
		}	
	}
	
	//출금
	private static void withdraw() {
		System.out.println("-------------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scan.nextLine();
			
			if(findAccount(ano) == null) {
				System.out.println("계좌가 없습니다. 다시 확인해 주세요.");
			}else {
			System.out.print("출금액: "); //int형 money를 "출금액 : "이라는 문자열에 대입해서 출력하기에 Integer.parseInt()를 씀
			int money = Integer.parseInt(scan.nextLine());
			
			if(findAccount(ano) != null) {
				AccountPt account = findAccount(ano);
				if(account.getBalance() >= money) {
				 account.setBalance(account.getBalance() - money);
				System.out.println("정상 출금 되었습니다.");
			}else {
				System.out.println("잔고가 부족합니다. 다시 입력해주세요.");
				}
			}
				
			}
			break;
		}
	}
	
	//계좌 검색
	private static AccountPt findAccount(String ano) {
		AccountPt account = null; //변수 account를 null로 초기화
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {  //null이 아닌 계좌를 계속 검색
				String myAno = accounts[i].getAno(); //검색계좌를 myAno에 저장
				if(myAno.equals(ano)) {	//만약 검색계좌(myAno)와 내가 입력한 계좌가 같다면
					account = accounts[i];  //account에 최종저장
				}
			}
		}
		return account;  //account값 리턴
	}
	
}
