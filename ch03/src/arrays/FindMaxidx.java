package arrays;

public class FindMaxIdx {

	public static void main(String[] args) {
		// 최대값의 위치 찾기
		// 최대값의 위치를 0번으로 설정
		int[] arr = new int[] {10, 50, 80, 30, 100};
		int maxIdx = 0;
		
		// 위치값 : 2
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[maxIdx]) { //값의 대소 비교
				maxIdx = i; //최대값 위치에 i를 저장
			}
		}
		
		/* i=1 50 > 10 true maxIdx = 1
		 * i=2 80 > 50 true maxIdx = 2
		 * i=3 30 > 80 false maxIdx = 2
		 * i=4 100 > 80 true maxIdx = 4
		 */
		
		System.out.println("최대값의 위치 : " + maxIdx);
		
	}

}
