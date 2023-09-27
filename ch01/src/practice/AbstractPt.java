package practice;

abstract class Car{
	public abstract void run();
	
	public abstract void refuel();

	public void stop() {
		System.out.println("차가 멈춥니다");
	}
}
class Bus extends Car{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전합니다");
		}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
}	
class AutoCar extends Car{

	@Override
	public void run() {
		System.out.println("차가 달립니다");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다");
	}
}
public class AbstractPt {

	public static void main(String[] args) {
		Bus bus = new Bus();
		AutoCar autocar = new AutoCar();
		
		bus.run();
		autocar.run();
		
		bus.refuel();
		autocar.refuel();
		
		bus.takePassenger();
		autocar.load();
		
		bus.stop();
		autocar.stop();
		
		}
}

