import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelFrame extends JFrame{

	private JLabel myLabel1;
	private JLabel myLabel2;
	private JLabel myLabel3;
	private JLabel myLabel4;
	
	public LabelFrame () {
		super("Minha primeira janela");
		setLayout(new FlowLayout());
		
		myLabel1 = new JLabel("Hello World...da Janela");
		add(myLabel1);
		
		myLabel2 = new JLabel();
		Icon iconCafe = new ImageIcon(getClass().getResource("coffee.png"));
		myLabel2.setIcon(iconCafe);
		add(myLabel2);
		
		myLabel3 = new JLabel("Aprendendo sobre GUI");
		add(myLabel3);
		
		myLabel4 = new JLabel("Na aula de POO");
		add(myLabel4);
		
		
	}
	
}
