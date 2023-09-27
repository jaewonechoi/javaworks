package practice;

public class StatementPt {

	public static void main(String[] args) {
		DrinkPt coffee = new DrinkPt("커피", 3000, 10);
		DrinkPt 녹차 = new DrinkPt("녹차", 2500, 4);
		
		DrinkPt.printTitle();
		coffee.printData();
		녹차.printData();
		
		System.out.println("===========================================");
		
		AlcoholPt 소주 = new AlcoholPt("소주", 4000, 11, 15.4f);
		AlcoholPt 맥주 = new AlcoholPt("맥주", 5000, 8, 5.4f);
		
		AlcoholPt.printTitle();
		소주.printData();
		맥주.printData();
		
		int sumVal = coffee.getTotalPrice() + 녹차.getTotalPrice()
		+ 소주.getTotalPrice() + 맥주.getTotalPrice();
		System.out.println("\n************** 합계 금액 "+ sumVal + " **************");
	}

}
