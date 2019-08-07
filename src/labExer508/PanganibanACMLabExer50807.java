package labExer508;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class PanganibanACMLabExer50807 extends JFrame {
	private JList colorList;
	private Container c;
	private String colorNames[] = {"Black", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
	"Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
	private Color colors[] = {Color.black, Color.cyan, Color.darkGray, Color.gray, Color.green,
	Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.red,
	Color.white, Color.yellow};
	public PanganibanACMLabExer50807() {
		super("List Test");
		c = getContentPane();
		c.setLayout(new FlowLayout());
		colorList = new JList(colorNames);
		colorList.setVisibleRowCount(5);
		
		colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		c.add(new JScrollPane(colorList));
		colorList.addListSelectionListener (
			new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e){
					c.setBackground(colors[colorList.getSelectedIndex()]);
				}
			});
		setSize(350, 150);
		show();
	}
	public static void main(String args[]) {
		PanganibanACMLabExer50807 app = new PanganibanACMLabExer50807();
		app.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		});
	}
}
