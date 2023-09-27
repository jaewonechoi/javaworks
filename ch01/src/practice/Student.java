package practice;

public class Student {
	private int studentId;
	private String studentName;
	private Subject[] subjects = new Subject[8];
	
	//학생 정보 입력
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;		
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //객체 생성
		subject.setSubjectName(name);  //객체로 받아서 addSubject로 대입
		subject.setScorePoint(score);
	
		//과목을 배열에 저장
		//subjects[0] = subject; //1개저장
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] == null) { //배열이 비어있을때
				subjects[i] = subject;  //배열에 객체를 저장
				break; //하나를 넣으면 종료
			}
		}
	}
	//학생 정보 출력
		public void showStudentInfo() {
			int total = 0;
			double avg;
			int count = 0;  //과목수
			for(int i = 0; i < subjects.length; i++) {
				if(subjects[i] != null) {
				total += subjects[i].getScorePoint();
				count++;
				System.out.println(studentId + "번 학생 " + studentName + "의 " +
						subjects[i].getSubjectName() +
						" 과목점수는 " + subjects[i].getScorePoint() + "점 입니다.");
		}
	}
			avg = (double)total / count;
			System.out.printf("과목의 총점은 %d 이고, 평균은 %.1f 점 입니다.\n", total, avg);
	
	
	}
	
	
	
}
