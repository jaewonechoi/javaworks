package singleton.school;

public class School {
	private static School instance;
	
	private School () {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	//학생 생성 메서드
	public Student createStudent() {
		Student student = new Student();
		return student;
	}
}
