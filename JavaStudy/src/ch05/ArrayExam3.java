package ch05;

public class ArrayExam3 {
	public static void main(String[] args) {
		int[] numbers = { 0, 1, 3, 7, 4 };
        
		int min = Integer.MAX_VALUE;
		System.out.println(min);

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("ÃÖ¼Ò°ª : " + min);
	}
}