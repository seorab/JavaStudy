package ch04;

public class Exam4_7 {
	public static void main(String[] args) {
		// Shift + Alt + R : ������ �ϰ�����
		int leftSpace = 5 / 2; // 2
		int rightSpace = 4;
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(leftSpace >= j || rightSpace <= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			if(i > (5 / 2)) { // �߽��� �ʰ�
				leftSpace = leftSpace + 1;
				rightSpace = rightSpace - 1;
			} else {
				leftSpace = leftSpace - 1;
				rightSpace = rightSpace + 1;
			}
			System.out.println();
		}
	}
}




