package ch03;

// Ctrl + / : 주석
//		int num2 = (num / 10) % 10;
//		int num3 = (num / 100) % 10;;
public class Exam03_07 {
	public static void main(String[] args) {
		int num = 123456789;
		// Ctrl + Alt + ∇ : 한줄 복사
		int total = 0;
		while(num > 0) {
			int num1 = num % 10; // 5
			num = num / 10;
			total += num1;
		}
		System.out.println("각 자리 숫자의 합 : " + total);
	}
}




