package inheritance.transport;

public class Main {

	public static void main(String[] args) {
		// Person 객체 생성
		Person sohee = new Person("박소희", 10000);
		Person daeho = new Person("이대호", 20000);
		
		//Bus 객체 생성
		Bus bus100 = new Bus("bus100");
		
		//Taxi 객체 생성
		Taxi taxi1 = new Taxi("카카오택시");
		
		//take() 메서드 사용
		sohee.take(bus100, 1500);
		daeho.take(bus100, 1500);
		sohee.take(taxi1, 4800);
		daeho.take(taxi1, 12300);
		
		//사람 정보 출력
		sohee.showPersonInfo();
		daeho.showPersonInfo();
		
		//차량 정보 출력
		bus100.showInfo();
		taxi1.showInfo();
		
		
	}

}
