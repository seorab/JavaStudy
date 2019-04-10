package ch06;

public class Method1 {
	int age;
	
	public static char sum(int a, char c) {
//		System.out.println(2);
		char trans = (char) (c + a);
//		System.out.println(trans);
		return trans;
	}
	
	public static void main(String[] args) {
		int age = 10;
		if(true) {
			int score = 20;
			score += age;
		}
//		age += score;
		
		// fmnc
		System.out.println(sum(2, 'f'));
		System.out.println(sum(2, 'm'));
		System.out.println(sum(2, 'n'));
		System.out.println(sum(2, 'c'));
		
	}
}



