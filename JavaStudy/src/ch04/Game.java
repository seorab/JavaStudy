package ch04;

import java.util.Scanner;

public class Game {
	final static int 가위 = 0;
	final static int 바위 = 1;
	final static int 보 = 2;
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("가위:0, 바위:1, 보:2 입력해주세요.");
		int player = s.nextInt();
		int com = (int)(Math.random() * 3); // 바위
		
		if(player == com) { // 비김
			System.out.println("비김");
		} else {
			if((player + 1) % 3 == com) {
				System.out.println("짐");
			} else {
				System.out.println("이김");
			}
		}
	}
}







