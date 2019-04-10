package ch07;

public class Static {
	static char color = 'R';
	static int num = 0;
	int score = 0;

	void instanceMethod() { 
		score = score + 1;
		num = num + 1;
		System.out.println("instance method");
	}
			
	static void staticMethod() {
		Static s = new Static();
		s.score = s.score + 1;
		System.out.println("static method");
		num++;
	}

}