package ch04;

public class Exam4_2_1 {
	public static void main(String[] args) {
		int score = 6;
		// �ڵ� �ۼ�
		if(score % 2 == 0 && score % 3 == 0) {
			System.out.println("��¦");
		} else if(score % 2 == 0) {
			System.out.println("¦");
		} else if(score % 3 == 0) {
			System.out.println("��");
		}
	}
}