import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFrame extends JFrame {

	private JTextField myText1;
	private JTextField myText2;
	private JTextField myText3;
	private JPasswordField myText4;
	
	public TextFrame() {
		super("Janela com textos de entrada");
		setLayout(new FlowLayout());
		
		myText1 = new JTextField(20);
		add(myText1);
		
		myText2 = new JTextField("Digite seu texto aqui");
		add(myText2);
		
		myText3 = new JTextField("Alguma mensagem", 25);
		add(myText3);
		
		myText4 = new JPasswordField(20);
		myText4.setEchoChar('*');
		add(myText4);
		
	}
}
