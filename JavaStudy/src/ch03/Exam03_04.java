package ch03;

public class Exam03_04 {
	public static void main(String[] args) {
		int num = 456;
		System.out.println( num / 100 * 100 ); // ������, ���ϱ� ������ �̿�
		
		int result = 0;
		result = num - (num % 100);
		System.out.println( result );
	}
}