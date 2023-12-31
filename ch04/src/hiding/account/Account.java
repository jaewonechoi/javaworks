package hiding.account;

//은행 통장 계좌 자료형 생성
//정보 은닉 및 캡슐화 - private 사용
public class Account {
	//필드(맴버변수)
	private String ano;  //계좌 번호
	private String owner;  //계좌주
	private int balance;  //잔고
	
	//기본 생성자
	public Account() {}
	
	//매개변수가 있는 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//get(), set() 메서드 생성
	//만드는 방법 : set,get+필드이름() - 필드이름 첫글자 대문자
	
	//계좌번호
	public void setAno(String a) { //매개변수로 계좌번호 전달  (set은 입력)반환값이 없으므로 void
		ano = a;
	}
	
	public String getAno() { //get은 출력 return
		return ano;
	}
	//계좌주
	public void setOwner(String own) {
		owner = own;
	}
	
	public String getOwner() {
		return owner;
	}
	//잔고
	public void setBalance(int bal) {
		balance = bal;
	}
	
	public int getBalance() {
		return balance;
	}
	//매개변수 생성자 메서드
	public void showAccount() {
		System.out.printf("계좌번호: %s\n계좌주: %s\n잔고: %d", ano, owner, balance);
	}
}
