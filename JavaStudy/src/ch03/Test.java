package ch03;

public class Test {
	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		System.out.println(a * b);
		long c = a * (long)b;
		System.out.println(c);
	}
}
