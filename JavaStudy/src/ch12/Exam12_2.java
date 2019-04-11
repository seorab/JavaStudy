package ch12;

public class Exam12_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		String[] s = file.split("/");
		for(int i = 0; i < s.length; i++) {
			if(!s[i].equals("")) {
				System.out.println("/" + s[i]);
			}
		}
	}
}