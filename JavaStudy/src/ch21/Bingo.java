package ch21;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Bingo {
	final int SIZE = 5;
	JButton[][] btns = null;
	String[][] words = { { "참새", "두루미", "황새", "비둘기", "까오기" }, { "오리", "타조", "부엉이", "올빼미", "뱁새" },
			{ "꿩", "닭", "구관조", "잉꼬", "매" }, { "거위", "독수리", "콘돌", "봉황", "공작" }, { "까치", "까마귀", "앵무새", "꾀꼬리", "고니" } };

	public void display() {
		JFrame frm = new JFrame("빙고");
		frm.setLayout(new GridLayout(SIZE, SIZE));
		frm.setBounds(100, 100, 500, 500);
		BtnHandler handler = new BtnHandler();
		btns = new JButton[SIZE][SIZE];
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length; j++) {
				btns[i][j] = new JButton(words[i][j]);
				btns[i][j].addActionListener(handler); // 이벤트 등록
				btns[i][j].setName(i + "" + j); // 버튼의 좌표 저장
				frm.add(btns[i][j]);
			}
		}
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}