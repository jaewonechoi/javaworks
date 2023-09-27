package reference.subject2;

import reference.subjects.Subject;

public class Student {
	//필드
	private int studentId;  	 //int studentId = 0; 자동초기화
	private String studentName;	 //String studentName = null
	private Subject[] subjects;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10];  //과목을 저장할 배열의 크기 10개 생성
	}
	
	
	//과목 추가
	public void addSubject(String name, int score) {
		//과목 객체를 생성해서 값(과목이름, 점수)을 저장 - 매개변수 생성자 방식
		Subject subject = new Subject(name, score); //Subject클래스 접근
		//set방식
		//subject.setSubjectName(name);   //과목이름
		//subject.setScorePoint(score);   //과목점수
		
		//과목을 배열에 저장
		//subjects[0] = subject; //1개저장
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] == null) { //배열의 요소가 비어있을때
				subjects[i] = subject;  //배열에 객체를 저장
				break;  //빠져 나옴
			}
		}
	}
	
	//학생 정보 출력
	public void showStudentInfo() {
		int total = 0;  //총점
		double average; //평균
		int count = 0; 	//개수
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] != null) { //배열의 요소가 차 있을때(비어있지 않을때)
			//Subject subject = subjects[i];
			count++; //반복문이 실행 될때마다 1씩증가
			total += subjects[i].getScorePoint(); //점수 누적
			System.out.println(studentId + "번 학생 " + studentName + "의 " +
					subjects[i].getSubjectName() + " 과목점수는 " + subjects[i].getScorePoint() + "점 입니다.");
			}
		}
		average = (double)total / count;  //평균 = 총점 / 과목수
		System.out.printf("과목의 총점은 %d점이고, 평균은 %.1f 입니다.\n", total, average);
	}
	
	
}
