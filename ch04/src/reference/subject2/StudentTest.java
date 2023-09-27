package reference.subject2;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student(101, "김대한");
		Student park = new Student(102, "박민국");
		
		kim.addSubject("국어", 90);
		kim.addSubject("수학", 85);
		kim.addSubject("과학", 78);
		kim.addSubject("사회", 75);
		
		park.addSubject("코딩", 95);
		park.addSubject("Java", 90);
		
		//출력
		kim.showStudentInfo();
		System.out.println("==============================");
		park.showStudentInfo();
	}

}
