package practice;

public class PrivatePt {
	//계좌번호, 계좌주, 잔고 필드 생성
	private String ano;
	private String owner;
	private int balance;
	
	//생성자
	public PrivatePt() {}  //디폴트 생성자
	
	//매개변수가 있는 생성자
	public PrivatePt(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//get(), set() 메서드 생성
	//만드는 방법 : set,get+필드이름() - 필드이름 첫글자 대문자
	public void setAno(String ano) { //매개변수 입력
		this.ano = ano;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	//매개변수 생성자 메서드
	public void showPrivatePtInfo() {
		System.out.printf("계좌번호: %s\n계좌주: %s\n잔고: %d",
				ano, owner, balance);
	}
}
