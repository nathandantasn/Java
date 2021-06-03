
public class Lampada {

	String marca;
	int potenciaWatts;
	double preco;
	boolean isLigado;
	
	public String toString() {
		return "Marca: " + marca + "\nPotência em Watts: " + potenciaWatts + "w" + "\nPreço: R$ " + preco + "\nStatus: " + isLigado;
	}
	public boolean ligar() {
		isLigado = true;
		return isLigado;
	}
	public boolean desligar() {
		isLigado = false;
		return isLigado;
	}
	public void mudarCor(String cor) {
		System.out.println("Mudei para " + cor);
	}
}
