
public class Lampada {

	String marca;
	int potenciaWatts;
	double preco;
	boolean isLigado;
	
	public String toString() {
		return "Marca: " + marca + "\nPot�ncia em Watts: " + potenciaWatts + "w" + "\nPre�o: R$ " + preco + "\nStatus: " + isLigado;
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
