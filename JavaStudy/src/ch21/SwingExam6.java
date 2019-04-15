package ch21;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingExam6 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("GridLayout Test");
		frm.setBounds(120, 120, 300, 200);
		frm.setLayout(new GridLayout(0, 1));

		frm.add(new JButton("One"));
		frm.add(new JButton("Two"));
		frm.add(new JButton("Three"));
		frm.add(new JButton("Four"));
		frm.add(new JButton("Five"));
		frm.add(new JButton("Six"));

		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}