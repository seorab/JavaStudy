package ch21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PWHandler implements ActionListener {
	private JTextField id;
	private JPasswordField pw;

	public PWHandler(JTextField id, JPasswordField pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ID : " + id.getText());
		System.out.println("PW : " + new String(pw.getPassword()));
		id.setText("");
		pw.setText("");
	}
}