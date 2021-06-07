import javax.swing.JOptionPane;

public class TesteJanela {
	
	public static void main (String[]args) {
		
		String snumero1 = JOptionPane.showInputDialog("Digite um número: ");
		String snumero2 = JOptionPane.showInputDialog("Digite outro número: ");
		
		int numero1 = Integer.parseInt(snumero1);
		int numero2 = Integer.parseInt(snumero2);
		
		int resultado = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, resultado, "Soma dos resultados", JOptionPane.PLAIN_MESSAGE);
	}

}
