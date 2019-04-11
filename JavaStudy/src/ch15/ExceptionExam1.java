package ch15;

import java.io.File;
import java.io.IOException;

public class ExceptionExam1 {
	static void a() {
		b();
	}
	static void b() {
		String numStr = " 123";
		int num2 = Integer.parseInt(numStr); // NumberFormatException
	}
	
	public static void main(String[] args) throws IOException {
		a();
		
		
		
		String numStr = " 123";
		int num2 = Integer.parseInt(numStr); // NumberFormatException
		new File("").createNewFile();
	}
}
	
	
	
	
	
	
	
	