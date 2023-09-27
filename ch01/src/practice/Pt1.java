package practice;

import java.util.Scanner;

public class Pt1 {
	
		public static void main(String[] args) {
			// 성적 처리 프로그램
			// try ~ catch까지 사용
			
			Scanner sc = new Scanner(System.in);
			int[] scores = null;
			int studentCount = 0;
			boolean sw = true;  //상태 변수
			
			while(sw) {
				try {
						System.out.println("================================================");
						System.out.println("1.학생수 | 2.성적입력 | 3.성적확인 | 4.분석 | 5.종료");
						System.out.println("================================================");
						System.out.print("메뉴를 선택해주세요.> ");
						int menu = Integer.parseInt(sc.nextLine());
						
						if(menu == 1) {
							System.out.print("학생수> ");
							studentCount = Integer.parseInt(sc.nextLine());
							scores = new int[studentCount];
						}else if(menu == 2) {
							for(int i = 0; i < scores.length; i++) {
								System.out.print("scores[" + i + "]= ");
								scores[i] = Integer.parseInt(sc.nextLine());
							}
						}else if(menu == 3) {
							for(int i = 0; i < scores.length; i++) {
							System.out.println("scores[" + i + "]= " + scores[i]);
							}
						}else if(menu == 4) {
							int total = 0;
							double avg;
							int maxVal = scores[0];
							for (int i = 0; i < scores.length; i++) {
								total += scores[i];
								if(scores[i] > maxVal) {
									maxVal = scores[i];
								}
							}
							avg = (double)total / scores.length;
							System.out.printf("평균 점수는 : %.2f\n", avg);
							System.out.println("최고 점수는 : " + maxVal);
						}else if(menu == 5) {
							sw = false;
						}else {
							System.out.println("지원하지 않는 기능입니다.");
						}
				}catch(Exception e) {
					System.out.println("잘못누르셨습니다. 숫자를 입력해주세요.");
					}
			}//while 끝
			System.out.println("프로그램을 종료합니다.");
			sc.close();
	}//main 끝
}//class 끝