import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		ButtonFrame janela = new ButtonFrame();
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 200);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
	}

}
