package interfaceex.sort;

public interface Sort {
	
	int[] arr = new int[10];
	
	public void ascending(int[] arr);
	
	public void descending(int[] arr);
	
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다");
	}
}
