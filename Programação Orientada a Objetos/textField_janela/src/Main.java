import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		TextFrame janela = new TextFrame();
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(350, 200);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);

	}

}
