package ch03;

// Ctrl + / : �ּ�
//		int num2 = (num / 10) % 10;
//		int num3 = (num / 100) % 10;;
public class Exam03_07 {
	public static void main(String[] args) {
		int num = 123456789;
		// Ctrl + Alt + �� : ���� ����
		int total = 0;
		while(num > 0) {
			int num1 = num % 10; // 5
			num = num / 10;
			total += num1;
		}
		System.out.println("�� �ڸ� ������ �� : " + total);
	}
}




