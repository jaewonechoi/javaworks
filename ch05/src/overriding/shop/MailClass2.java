package overriding.shop;

public class MailClass2 {

	public static void main(String[] args) {
		//자동 형변환 - 부모클래스가 자식클래스보다 크기에 자동으로 형변환됨
		HeadShop shop1 = new Shop1();
		shop1.비빔밥();
		
		System.out.println("=================================");
		
		HeadShop shop2 = new Shop2();
		shop2.비빔밥();
		
		//기본 자료형의 형변환
		int iNum = 10;
		double dNum;
		
		dNum = iNum;
		System.out.println(dNum);
		
		iNum = (int)dNum;  //강제 형변환
		System.out.println(dNum);
	}

}
