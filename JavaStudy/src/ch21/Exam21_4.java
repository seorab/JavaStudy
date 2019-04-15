package ch21;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Exam21_4 {
	public static void main(String[] args) {
		Bingo b = new Bingo();
		b.display();
	}
}

class BtnHandler implements ActionListener {
	// bingo [][]
	int[][] bingo = new int[5][5]; // ��� ��� 0���� �ʱ�ȭ
	int count = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.LIGHT_GRAY);
		// ���õ� ��ư�� ��ǥ Ȯ�� (setName���� ������ ��)
		String xy = btn.getName();
		System.out.println(xy);
		// x y  charAt(0)  x y �и�
		char x = '0';
		char y = '1';
		int numX = Integer.parseInt(x + "");
		int numY = Integer.parseInt(y + "");
		bingo[numX][numY] = 1;
		
		/* ������ �ϼ� Ȯ�� �ڵ� */
		for(int i = 0; i < 5; i++) {
			if(bingo[numX][i] == 1) {
				// ��ŷ ���� 1
				count++;
			}
		}
		System.out.println(count);
		if(count == 5) {
			System.out.println("������ �ϼ�");
		}
		
		/* ������ �ϼ� Ȯ�� �ڵ� */
	}
}












