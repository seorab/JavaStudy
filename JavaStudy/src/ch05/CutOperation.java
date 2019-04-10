package ch05;

public class CutOperation {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		
		while(true) {
			// 1. 0보다 큰 배열 요소의 개수를 출력
			int count = 0;
			for(int i = 0; i < stick.length; i++) {
				if(stick[i] > 0) {
					// 개수 세기
					count++;
				}
			}
			
			System.out.println(count);
			
			if(count <= 1) {
				break;
			}
			
			// 2. 배열 요소중에서 0을 제외하고 가장 적은 수를 찾아냄
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < stick.length; i++) {
				if(stick[i] < min && stick[i] > 0) {
					min = stick[i];
				}
			}
			
			// 3. 가장 적은 수로 모든 배열 요소 값을 감소
			for(int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
			}
	//		System.out.println("=========");
	//		for(int value : stick) { // for-each
	//			System.out.println(value);
	//		}
		
		}
		
		
	}
}










