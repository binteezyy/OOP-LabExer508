package labExer508;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanganibanACMLabExer50804 extends JFrame {
	private JTextField t;
	private JCheckBox bold, italic;
	
	public PanganibanACMLabExer50804() {
		super("JCheckBox Test");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		t = new JTextField("Watch the font style change", 20);
		t.setFont(new Font("Verdana", Font.PLAIN, 14));
		c.add(t);
		bold = new JCheckBox("Bold");
		c.add(bold);
		italic = new JCheckBox("Italic");
		c.add(italic);
		CheckBoxHandler handler = new CheckBoxHandler();
		bold.addItemListener(handler);
		italic.addItemListener(handler);
		
		addWindowListener(
		new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		setSize(275,100);
		show();
	}
	
	public static void main(String args[]){
		new PanganibanACMLabExer50804();
	}
	
	private class CheckBoxHandler implements ItemListener {
		private int valBold = Font.PLAIN;
		private int valItalic = Font.PLAIN;
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == bold)
			if (e.getStateChange() == ItemEvent.SELECTED)
			 valBold = Font.BOLD;
			else
			 valBold = Font.PLAIN;
			if (e.getSource() == italic)
			if (e.getStateChange() == ItemEvent.SELECTED)
			 valBold = Font.ITALIC;
			else
			 valBold = Font.PLAIN;
		
			 t.setFont(new Font("Verdana", valBold+valItalic, 14));
			t.repaint();
		}
	}
} 