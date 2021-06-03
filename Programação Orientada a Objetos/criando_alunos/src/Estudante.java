
public class Estudante {

	private String nome;
	private double N1;
	private double N2;
	private double media;
	
	public Estudante (String nome, double n1, double n2) {
		this.nome = nome;
		this.N1 = n1;
		this.N2 = n2;
	}
	
	public void calcularMediaFinal() {
		this.media = this.N1 * 0.4 + this.N2 * 0.6;
	}
	
	public double media() {
		return this.media;
	}
	
	public String toString() {
		return "\nNome:" + nome
				+"\nMédia final: " + media() + "\n";
	}
}
