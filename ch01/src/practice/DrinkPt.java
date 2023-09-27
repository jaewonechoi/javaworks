package practice;

public class DrinkPt {
	protected String name; //음료이름
	protected int price;	 //가격
	protected int count;   //개수
	
	public DrinkPt(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public int getTotalPrice() {
		return price * count;
	}
	
	public static void printTitle() {
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	public void printData() {
		System.out.println(name + "\t" + price + "\t" + 
				count + "\t" + getTotalPrice());
	}
	
}
