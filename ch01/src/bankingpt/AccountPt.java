package bankingpt;

public class AccountPt {
	private String ano;//계좌번호
	private String owner;//계좌주
	private int balance;//잔고
	
	public AccountPt() {}
	
	public AccountPt(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void setAno(String ano) {
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
}
