package banking.array;

import java.util.Scanner;

import banking.domain.Account;

public class BankTest2 {
	//계좌를 저장할 배열의 크기 100개로 설정
	static Account[] accounts = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean sw = true;
		
		while(sw) {
			try {
				System.out.println("=================================================");
				System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4. 출금 | 5.종료");
				System.out.println("=================================================");
				System.out.print("메뉴를 선택해주세요> ");
				
				//메뉴 선택
				int selectNum = Integer.parseInt(scanner.nextLine());
				
				if(selectNum == 1) {
					createAccount();   //계좌 생성
				}else if(selectNum == 2) {
					getAccountList();  //계좌 목록
				}else if(selectNum == 3) {
					deposit();   //입금
				}else if(selectNum == 4) {
					withdraw();  //출금
				}else if(selectNum == 5) {
					sw = false;    //프로그램 종료
				}else {
					System.out.println("지원하지 않는 기능입니다. 다시 입력해 주세요.");
				}
			}catch(NumberFormatException e) {
				//e.printStackTrace();
				System.out.println("올바른 숫자를 입력해주세요.");
			}
		}//while 끝
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	//계좌 생성
	private static void createAccount() {
		System.out.println("-------------------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("-------------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			//중복 계좌가 있는지 체킹
			if(findAccount(ano) != null) { //중복 계좌가 있으면
				System.out.println("이미 등록된 계좌입니다. 다시 입력해 주세요.");
			}else { //중복 계좌가 없을때
				System.out.print("계좌주: ");
				String owner = scanner.nextLine();
				
				System.out.print("초기 입금액: ");
				int balance = Integer.parseInt(scanner.nextLine());
				
				for(int i = 0; i < accounts.length; i++) {
					if(accounts[i] == null) { //배열의 요소가 비어있을때만 객체를 저장하고
						accounts[i] = new Account(ano, owner, balance);
						System.out.println("결과: 계좌가 생성되었습니다.");
						break;   //하나를 대입후 빠져나옴 for를 빠져나옴
					}
				}
				break; //while을 빠져나옴
			}//else 끝
			
		}//while 끝
		//accounts[0] = new Account(ano, owner, balance);  //연습 데이터 1개 생성
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
			System.out.printf("잔고: %,d\n",accounts[i].getBalance());
			}
		}	
	}
	
	//입금
	private static void deposit() {
		System.out.println("-------------------------------------------------");
		System.out.println("입금");
		System.out.println("-------------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				System.out.print("입금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				Account account = findAccount(ano);
				account.setBalance(account.getBalance() + money);
				System.out.println("결과: 정상 처리되었습니다.");
				break;
			}else { //계좌가 없을시 다시  while로 돌아가서 계좌입력
				System.out.println("계좌가 없습니다. 다시 입력해 주세요.");
			}
		}
	}
	
	//출금
	private static void withdraw() {
		System.out.println("-------------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------------");
		
		while(true) { //계좌 번호 재입력
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //찾는계좌가 맞고 null이 아닐시
				while(true) {//출금액 재입력
					System.out.print("출금액: ");
					int money = Integer.parseInt(scanner.nextLine());
					
					Account account = findAccount(ano);
					if(money > account.getBalance()) { //잔고보다 출금액이 많을시 false이므로 다시 출금액 while로 올라감
						System.out.println("잔고가 부족합니다. 다시 입력해주세요.");
				}else {
					account.setBalance(account.getBalance() - money);
					System.out.println("정상 출금 되었습니다.");
					break;
				}
			}//안쪽 while
			break; //여기서 브레이크해야 정상출금 완료
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
	  }//바깥쪽 while 끝
	}
	
	//계좌 검색
	private static Account findAccount(String ano){
		Account account = null;	//찾을 계좌를 저장할 객체 변수 선언
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				String dbAno = accounts[i].getAno();	//null아니고 검색한 계좌번호를 가져옴
				if(dbAno.equals(ano)) {	//검색한 계좌와 내가 입력한 계좌와 일치하면
					account = accounts[i];  //일치한 계좌를 account 저장
					break;
				}
			}
		}
		return account;
	}
}