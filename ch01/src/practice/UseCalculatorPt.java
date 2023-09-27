package practice;

public class UseCalculatorPt {

	public static void main(String[] args) {
		CalculatorPt cal = new CalculatorPt();
		int num1 = 10, num2 = 2;
		
		int addVal = cal.add(num1, num2);
		int subVal = cal.sub(num1, num2);
		int mulVal = cal.mul(num1, num2);
		int divVal = cal.div(num1, num2);
		
		System.out.println("두수의 합: " + addVal);
		System.out.println("두수의 차: " + subVal);
		System.out.println("두수의 곱: " + mulVal);
		System.out.println("두수의 나누기: " + divVal);
	}

}
