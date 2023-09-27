package practice;

public class UseCars {

	public static void main(String[] args) {
		/*Cars car1 = new Cars("모닝", 100000, 2013);
		car1.showCars();
		
		System.out.println();
		
		Cars car2 = new Cars("K7", 200000, 2020);
		car2.showCars();*/
		
		/*Cars[] car1 = {
				new Cars("모닝", 100000, 2013),
				new Cars("K7", 200000, 2020),
				new Cars("Sonata", 500000, 2023)
		};*/
		
		Cars[] car1 = new Cars[3];
		car1[0] = new Cars("모닝", 100000, 2013); //변수[인덱스넘버] = new 클래스자료형(내용);
		car1[1] = new Cars("K7", 200000, 2020);
		car1[2] = new Cars("Sonata", 500000, 2023);
		
		/*for(int i = 0; i < car1.length; i++) {
			car1[i].showCars();
			System.out.println();
		}*/
		
		//향상 for문
		for(Cars car : car1) {
			car.showCars();
			System.out.println(car.showCars());
		}
	}

}
