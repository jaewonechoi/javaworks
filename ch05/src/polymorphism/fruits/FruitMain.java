package polymorphism.fruits;

import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.포도 | 2.바나나 | 3.복숭아");
		System.out.print("선택> ");
		
		//문자를 숫자형으로 변환
		int selectNum = Integer.parseInt(scanner.nextLine());
		
		//객체 생성시 다형성 이용
		Fruit fruit = null; //Fruit클래스(부모)로 객체 생성후 null 초기화
		if(selectNum == 1) {
			fruit = new Grape(); //자식클래스로 출력
		}else if(selectNum == 2){
			fruit = new Banana();
		}else if(selectNum == 3){
			fruit = new Peach();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		fruit.showFruitInfo();
		scanner.close();
	}

}
