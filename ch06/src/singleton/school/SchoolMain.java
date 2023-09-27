package singleton.school;

public class SchoolMain {

	public static void main(String[] args) {
		School school = School.getInstance();
		
		Student student1 = school.createStudent();
		Student student2 = school.createStudent();
		System.out.println("학번: " + student1.getStudentNum());
		System.out.println("학번: " + student2.getStudentNum());
		
		//학교 객체의 주소
		System.out.println(school);
		
		//학생 객체의 주소
		System.out.println(student1);
		System.out.println(student2);

	}

}
