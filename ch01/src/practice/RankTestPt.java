package practice;

public class RankTestPt {

	public static void main(String[] args) {
		// 순위 정하기
		// rank를 모두 1로 초기화 함
		// rank -> 1, 1, 1, 1, 1
		int[] score = {100, 50, 70, 40, 90};
		int[] rank = new int[5];
		
		//중첩 for(행, 열)
		for(int i = 0; i < score.length; i++) {//행
			int count = 1;
			for(int j = 0; j < score.length; j++) {//열
				if(score[i] < score[j]) {
					count++;
				}
			}
			rank[i] = count;
		}
		
		for(int i = 0; i < rank.length; i++) {
			System.out.print(rank[i] + " ");
		}
		
		System.out.println();
		System.out.println("==================================");
		
		int temp;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score.length-1; j++) {
				if(score[j] > score[j+1]) {
					temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		
		/*char[] alphabet = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alphabet.length; i++, ch++) {
			alphabet[i] = ch;
		}
		for(int i = 0; i < alphabet.length; i++) {
			System.out.println(alphabet[i] + ", " + (int)alphabet[i]);
		}*/
	}

}
