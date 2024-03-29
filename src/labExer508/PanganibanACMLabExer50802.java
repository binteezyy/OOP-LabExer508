package labExer508;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanganibanACMLabExer50802 extends JFrame {
	private JTextField text1, text2, text3;
	private JPasswordField password;
	public PanganibanACMLabExer50802() {
		super("Testing JTextField and JPasswordField");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		text1 = new JTextField(10);
		text1.setToolTipText("This is text1.");
		c.add(text1);
		text2 = new JTextField("Enter text here");
		text2.setToolTipText("This is text2.");
		c.add(text2);
		text3 = new JTextField("Uneditable Text Field", 20);
		text3.setToolTipText("This is text3.");
		text3.setEditable(false);
		c.add(text3);
		password = new JPasswordField("Hidden Text");
		password.setToolTipText("This is password field.");
		c.add(password);
		TextFieldHandler handler = new TextFieldHandler();
		text1.addActionListener(handler);
		text2.addActionListener(handler);
		text3.addActionListener(handler);
		password.addActionListener(handler);
		setSize(325, 100);
		show();
		}
		
		public static void main(String args[]) {
			PanganibanACMLabExer50802 app = new PanganibanACMLabExer50802();
			app.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
				System.exit(0);
				}});
		}

		private class TextFieldHandler implements ActionListener {
			public void actionPerformed(ActionEvent e){
				String s = "";
				if (e.getSource() == text1)
				s = "text1: " + e.getActionCommand();
				else if (e.getSource() == text2)
				s = "text2: " + e.getActionCommand();
				else if (e.getSource() == text3)
				s = "text3: " + e.getActionCommand();
				else if (e.getSource() == password){
				 JPasswordField pwd = (JPasswordField) e.getSource();
				 s = "password: " + new String(pwd.getPassword());
				}
				JOptionPane.showMessageDialog(null, s);
			}
		}
}

