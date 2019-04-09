package ch04;

public class Exam4_5 {
	public static void main(String[] args) {
		boolean isContinue = true;
		int count = 0;

		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			System.out.println(num1 + ", " + num2);
			count++;
			if(num1 == num2) { 
				isContinue = false;
			}
			// 코드 작성
		}
		System.out.println("주사위를 던진 횟수 : " + count);
	}
}




