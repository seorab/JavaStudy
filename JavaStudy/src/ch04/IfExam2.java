package ch04;

// Shift + Ctrl + F : �ҽ�����
public class IfExam2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		if (a++ == 10 && a == 11) {
			System.out.println("1��");
		}

		System.out.println("a : " + a);

		if (a == 10 || ++b == 21) {
			System.out.println("2��");
		}

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}