package ch03;

import java.util.Scanner;

public class Operation5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int in = s.nextInt();
		
		char result = in >= 0 ? '¾ç' : 'À½';
		
		System.out.println(result);
		s.close();
	}
}




