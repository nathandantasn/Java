import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton botao1;
	private JButton botao2;

	public ButtonFrame(){
		super("Janela com botões");
		
		setLayout(new FlowLayout());
		botao1 = new JButton("Botão simples");
		add(botao1);
		
		BotaoHandler btn1 = new BotaoHandler();
		botao1.addActionListener(btn1);
		
		botao2 = new JButton();
		Icon iconeJava = new ImageIcon(getClass().getResource("java64.png"));
		botao2.setIcon(iconeJava);
		add(botao2);
		
		Botao2Handler btn2 = new Botao2Handler();
		botao2.addActionListener(btn2);
	}
	
	private class BotaoHandler implements ActionListener {
		
		@Override
		public void actionPerformed (ActionEvent event) {
			String mensagem = "Eu sou uma mensagem";
			JOptionPane.showMessageDialog(null, mensagem);
		}
	}
	
private class Botao2Handler implements ActionListener {
		
		@Override
		public void actionPerformed (ActionEvent event) {
			String mensagem = "Eu sou um botao com ícone";
			JOptionPane.showMessageDialog(null, mensagem);
		}
	}
}
