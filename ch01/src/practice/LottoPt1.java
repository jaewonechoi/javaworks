package practice;

public class LottoPt1 {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 1 ~ 45 -> 6개 생성
		// 배열의 크기 6개인 lotto 선언
		int[] lotto = new int[6];
		
		//6개를 동시 생성
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			//System.out.print(lotto[i] + " ");   //여기까지 했을때 같은 수가 두번 나올수있음
				
				//중복 문제 해결 - 중첩 for
				for(int j = 0; j < i; j++) {  //임의의 수 설정
					if(lotto[j] == lotto[i]) { //만약 전에 뽑은 번호와 다시 뽑은 번호가 같을경우 
						i--;                   // 다시뽑은 번호를 -1  이전 인덱스로 이동
					}
				}
				
		}
		//6개 출력
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			System.out.print(lotto[i] + " ");
		}
	}

}
