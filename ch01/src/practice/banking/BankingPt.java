package practice.banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BankingPt {
	
	static List<AccountPt1> accountList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sw = true;
		
		while(sw) {
			System.out.println("=================================================");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.입금 | 4. 출금 | 5.종료");
			System.out.println("=================================================");
			System.out.print("메뉴를 선택해주세요> ");
			int selNum = Integer.parseInt(sc.nextLine());
			
			if(selNum == 1) {
				createAccount();
			}else if(selNum == 2){
				getAccountList();
			}else if(selNum == 3){
				//deposit();
			}else if(selNum == 4){
				//withdraw();
			}else if(selNum == 5) {
				//removeAccount();
			}else if(selNum == 6){
				sw = false;
			}else {
				System.out.println("지원하지 않는 기능입니다. 다시 입력해주세요.");
			}
		}
		System.out.print("프로그램을 종료합니다.");
	}
	
	//계좌 생성
	private static void createAccount() {
		System.out.println("----------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("----------------------------------------");
		
		while(true) {
			System.out.println("계좌번호(형식-숫자만:00-00-000: ");
			String ano = sc.nextLine();
			
			//계좌 형식검증
			String regExp = "\\d{2}-\\d{2}-\\d{3}"; //정규식 표현이라함
			boolean result = Pattern.matches(regExp, ano);
			
			if(result == false) {
				System.out.println("올바른 계좌 형식이 아닙니다. 올바른 형식으로 다시 입력해주세요");
				break;
			}
			
			//중복계좌 있는지 검색
			if(findAccount(ano) != null) {
				System.out.println("중복계좌 입니다. 다시 입력해 주세요");
			}else {
				System.out.println("계좌주: ");
				String owner = sc.nextLine();
				
				System.out.println("초기 입금액: ");
				int balance = Integer.parseInt(sc.nextLine());
				AccountPt1 newAccount = new AccountPt1(ano, owner, balance);
				accountList.add(newAccount);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌 조회
	private static void getAccountList() {
		System.out.println("----------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("----------------------------------------");
		
		for(int i = 0; i < accountList.size(); i++) {
			AccountPt1 account = accountList.get(i);
			System.out.print("계좌번호: " + account.getAno() + "\t");
			System.out.print("계좌주: " + account.getOwner() + "\t");
			System.out.print("잔고: " + account.getBalance() + "\n");
		}
	}
	
	//입금
	
	
	
	//출금
	
	
	
	//계좌 삭제
	
	
	
	//계좌 검색
	private static AccountPt1 findAccount(String ano) {
		AccountPt1 account = null;
		
		for(int i = 0; i < accountList.size(); i++) {
			
			String dbAno = accountList.get(i).getAno();
			if(dbAno.equals(ano)) {
				account = accountList.get(i);
				break;
			}
		}
		return account;
	}
}
