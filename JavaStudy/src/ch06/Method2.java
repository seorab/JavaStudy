package ch06;

import java.util.Scanner;

public class Method2 {
	public static void mine() {
		Scanner s = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		mine();
		
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		
		
		
		int p1 = 7;
		int p2 = 7;
		System.out.println(p1 == p2);
		
		int[] r1 = {1};
		int[] r2 = {1};
		System.out.println(r1 == r2);
	}
}





