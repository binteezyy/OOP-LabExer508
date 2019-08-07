package labExer508;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanganibanACMLabExer50803 extends JFrame {
	private JButton plainButton, fancyButton;
	
	public PanganibanACMLabExer50803() {
		super("Testing Buttons");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		plainButton = new JButton("Plain Button");
		plainButton.setToolTipText("Button1");
		c.add(plainButton);
		Icon image1 = new ImageIcon("HTMLFILE.gif");
		Icon image2 = new ImageIcon("folder.gif");
		fancyButton = new JButton("Fancy Button", image1);
		fancyButton.setRolloverIcon(image2);
		fancyButton.setToolTipText("Button2");
		c.add(fancyButton);
		ButtonHandler handler = new ButtonHandler();
		fancyButton.addActionListener(handler);
		plainButton.addActionListener(handler);
		 setSize(275, 100);
		show();
	}
	
	public static void main(String args[]) {
		PanganibanACMLabExer50803 app = new PanganibanACMLabExer50803();
		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
	}
	
	private class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "You pressed: " +
			e.getActionCommand()); 
		}
	}
}