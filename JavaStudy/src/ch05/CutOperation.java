package ch05;

public class CutOperation {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		
		while(true) {
			// 1. 0���� ū �迭 ����� ������ ���
			int count = 0;
			for(int i = 0; i < stick.length; i++) {
				if(stick[i] > 0) {
					// ���� ����
					count++;
				}
			}
			
			System.out.println(count);
			
			if(count <= 1) {
				break;
			}
			
			// 2. �迭 ����߿��� 0�� �����ϰ� ���� ���� ���� ã�Ƴ�
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < stick.length; i++) {
				if(stick[i] < min && stick[i] > 0) {
					min = stick[i];
				}
			}
			
			// 3. ���� ���� ���� ��� �迭 ��� ���� ����
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










