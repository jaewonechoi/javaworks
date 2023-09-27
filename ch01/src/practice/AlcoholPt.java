package practice;

public class AlcoholPt extends DrinkPt {
	
	float alcper;
	
	public AlcoholPt(String name, int price, int count, float alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}	
	public static void printTitle() {
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}
	
	public void printData() {
		 System.out.println(name + " (" + alcper + ")" + "\t" + price + "\t"
				 + count + "\t" + getTotalPrice());
	}
	
}
