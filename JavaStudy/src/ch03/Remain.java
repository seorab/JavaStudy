package ch03;

public class Remain {
	public static void main(String[] args) {
		int num = 123;
		int n1 = num % 10; // 3
		num = num / 10; // 12
		int n2 = num % 10; // 2
		num = num / 10; // 1
		int n3 = num % 10; // 1
		System.out.println(n1+n2+n3);
	}
}
