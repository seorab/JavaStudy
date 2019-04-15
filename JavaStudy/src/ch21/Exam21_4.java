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
	int[][] bingo = new int[5][5]; // 모든 요소 0으로 초기화
	int count = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.LIGHT_GRAY);
		// 선택된 버튼의 좌표 확인 (setName으로 지정된 값)
		String xy = btn.getName();
		System.out.println(xy);
		// x y  charAt(0)  x y 분리
		char x = '0';
		char y = '1';
		int numX = Integer.parseInt(x + "");
		int numY = Integer.parseInt(y + "");
		bingo[numX][numY] = 1;
		
		/* 가로줄 완성 확인 코드 */
		for(int i = 0; i < 5; i++) {
			if(bingo[numX][i] == 1) {
				// 마킹 상태 1
				count++;
			}
		}
		System.out.println(count);
		if(count == 5) {
			System.out.println("가로줄 완성");
		}
		
		/* 세로줄 완성 확인 코드 */
	}
}












