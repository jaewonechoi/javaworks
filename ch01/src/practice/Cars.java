package practice;

public class Cars {
	String car;
	int price;
	int year;
	
	public Cars() {} // 기본 생성자
	
	public Cars(String car, int price, int year) {
		this.car = car;
		this.price = price;
		this.year = year;
	}
	
	
	
	/*public void showCars() {
		System.out.printf("차종: %s\n가격: %d\n연식: %d\n", car, price, year);
	}*/
	
	public String showCars() {  //리턴값으로 출력
		return "차종: "+ car + "\n가격: " + price + "\n연식: " + year + "\n";
	}

}
