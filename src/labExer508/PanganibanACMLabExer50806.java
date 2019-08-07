package labExer508;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PanganibanACMLabExer50806 extends JFrame {
	private JComboBox images;
	private JLabel label;
	private String names[] = {"SUPERMAN.gif","KITEL1B.gif","PCENTERO.gif", "FISH5.gif"};
	private Icon icons[] = {new ImageIcon(names[0]), new ImageIcon(names[1]),
	 new ImageIcon(names[2]), new ImageIcon(names[3])};
	
	public PanganibanACMLabExer50806() {
		super("Testing JComboBox");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		images = new JComboBox(names);
		images.setMaximumRowCount(3);
		images.addItemListener(
		new ItemListener() {
			public void itemStateChanged(ItemEvent e){
			 label.setIcon(icons[images.getSelectedIndex()]);
			}
		});
		c.add("North", images);
		label = new JLabel(icons[0]);
		c.add("Center", label);
		setSize(350, 300);
		show();
	}
	
	public static void main(String args[]) {
		PanganibanACMLabExer50806 app = new PanganibanACMLabExer50806();
		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
 } 
