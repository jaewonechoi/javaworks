package practice;

public class StudentUse {

	public static void main(String[] args) {
		Student st1 = new Student(101, "김대박");
		
		st1.addSubject("국어", 90);
		st1.addSubject("수학", 95);
		st1.addSubject("과학", 98);
		st1.addSubject("영어", 75);
		
		st1.showStudentInfo();

	}

}
