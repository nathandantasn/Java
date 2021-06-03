
public class Peca {

	private String nome;
	private String cor;
	
	public Peca(String nome, String cor) {
		this.cor = cor;
		this.nome = nome;
	}
	
	public String toString() {
		return this.nome + " " + this.cor;
	}
}
