package practice;

public class UsePrivatePt {

	public static void main(String[] args) {
		// Account 인스턴스 생성
		//멤버에 직접 접근하지 못하도록 제한을 둠
		//account.ano = "111-222-3333-4444"
		//멤버 메서드에 접근이 가능
		
		PrivatePt ppt = new PrivatePt();
		ppt.setAno("111-222-3333-4444");
		ppt.setOwner("최재원");
		ppt.setBalance(10000);
		
		System.out.println("계좌번호: " + ppt.getAno());
		System.out.println("계좌주: " + ppt.getOwner());
		System.out.println("잔고: " + ppt.getBalance());
		System.out.println();
		
		//매개변수가 있는 생성자로 입력
		PrivatePt ppt1 = new PrivatePt("111-222-3333-4444", "최재원", 10000);
		
		System.out.println("계좌번호: " + ppt1.getAno());
		System.out.println("계좌주: " + ppt1.getOwner());
		System.out.println("잔고: " + ppt1.getBalance());
		
		System.out.println();
		
		ppt.showPrivatePtInfo();
		
		/*PrivatePt[] ppt = new PrivatePt[10];
		
		
		for(int i = 0; i < ppt.length; i++) {
			if(ppt[i] == null) {
				
			}
			System.out.println(ppt[i].getAno() + ", " + ppt[i].getOwner() + ", " + ppt[i].getBalance());
		}*/
		
		/*for(int i = 0; i < ppt.length; i++) {
			System.out.println("계좌번호: " + ppt[i].getAno() +
					"\n계좌주 : " + ppt[i].getOwner() + "\n잔고: " + ppt[i].getBalance());
		}*/
	}

}
