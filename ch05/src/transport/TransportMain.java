 package transport;

public class TransportMain {

	public static void main(String[] args) {
		//사람 객체 생성
		Person p1 = new Person("이강인", 10000);
		Person p2 = new Person("우영우", 20000);
		
		//버스 객체 생성
		Bus bus100 = new Bus(100);
		Bus bus918 = new Bus(918);
		
		//지하철 객체 생성
		Subway green = new Subway("2호선");
		
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p1.takeBus(bus918);
		
		p1.takeSubway(green);
		p2.takeSubway(green);
		
		//정보 출력
		p1.showPersonInfo();
		p2.showPersonInfo();
		System.out.println("========================================");
		bus100.showBusInfo();
		bus918.showBusInfo();
		System.out.println("========================================");
		green.showSubwayInfo();
	}

}
