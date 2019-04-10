package ch08;

public class Car3 {
	String color;
	int door;
	
	public static void main(String[] args) {
		Car3 c = new Car3();
	}
	
	public Car3() {}

	public Car3(String c) {
		color = c;
		door = 4;
	}
}