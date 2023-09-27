package practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassPt {

	public static void main(String[] args) {
		
		Cars car = new Cars();
		
		System.out.println("===== 클래스의 이름 가져오기 =====");
		Class<?> carclass = car.getClass();
		System.out.println(carclass.getName());
		
		System.out.println("===== 클래스의 필드(멤버변수) 출력하기 =====");
		Field[] fields = carclass.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("===== 생성자 정보 출력하기 =====");
		Constructor<?>[] cons = carclass.getConstructors();
		for(Constructor<?> con : cons) {
			System.out.println(con);
		}
		
		System.out.println("===== 메서드 정보 출력하기 =====");
		Method[] methods = carclass.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
	}

}
