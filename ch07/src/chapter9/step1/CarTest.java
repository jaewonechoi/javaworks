package chapter9.step1;

abstract class Car{
	//추상메서드 사용이유
	//상속받는 자식클래스에 반드시 구현하도록 제시, 강제함 -> 유지보수에 좋음
	public abstract void run();
	
	public abstract void refuel();
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
}

class Bus extends Car{
	
	public Bus() {}
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전합니다.");
	}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
	
}

class AutoCar extends Car{
	
	public AutoCar() {}
	
	@Override
	public void run() {
		System.out.println("차가 달립니다");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
		
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		Bus bus = new Bus();	//클래스이기 때문에 객체를 만들어 접근
		AutoCar autoCar = new AutoCar();
		
		bus.run();		//객체의 메서드(함수) 호출
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
		
		
	}

}
