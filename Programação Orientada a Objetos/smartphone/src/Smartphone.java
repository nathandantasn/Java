
public class Smartphone {

	String marca;
	double preco;
	double nota;
	double tempoFuncionamento;
	boolean isLigado;
	
	public void ligar() {
		isLigado = true;
	}
	
	public void desligar() {
		isLigado = false;
	}
	
	public void reiniciar() {
		desligar();
		ligar();
	}
	
	public String toString() {
		return "Marca: " + marca 
				+ "\nTempo de funcionamento: " + tempoFuncionamento 
				+ "\nPreço: R$ " + preco 
				+ "\nNota: " + nota
				+ "\nStatus: " + isLigado;
	}
}
