package ch21;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam21_1 {
	public static void main(String[] args) {
		String[] datas = { "A", "B", "C", "D", "E", "F", "G" };
		JFrame frm = new JFrame();
		frm.setBounds(120, 120, 300, 200);
		/* JFrame의 Layout을 GridLayout 으로 지정 */
		frm.setLayout(new GridLayout(0, 3));
		/* 배열을 이용하여 JButton 으로 표현 */
		for(String s : datas) {
			frm.add(new JButton(s));
		}
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}





