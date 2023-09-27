package statics.classvar;

public class ClassVarTest {

	public static void main(String[] args) {
		//인스턴스 객체 변수, 클래스 객체 변수(static)
		//클래스 변수는 클래스 이름으로 직접 접근(new를 하지 않음)
		//클래스 변수는 값이 공유되고 누적되며 프로그램이 종료되면 소멸함
		ClassVar.serialNum++;
		System.out.println(ClassVar.serialNum);
		
		ClassVar.serialNum++;
		System.out.println(ClassVar.serialNum);
		
		ClassVar s1 = new ClassVar();
		//Student s2 = new Student();
		s1.setId(101);
		
		
		System.out.println("학번= " + s1.getId());
		//System.out.println("s2= " + s2.getId());
	}

}
