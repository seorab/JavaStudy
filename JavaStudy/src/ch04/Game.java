package ch04;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����:0, ����:1, ��:2 �Է����ּ���.");
		int player = s.nextInt();
		int com = (int)(Math.random() * 3); // ����
		
		if(player == com) { // ���
			System.out.println("���");
		} else {
			if((player + 1) % 3 == com) {
				System.out.println("��");
			} else {
				System.out.println("�̱�");
			}
		}
	}
}







