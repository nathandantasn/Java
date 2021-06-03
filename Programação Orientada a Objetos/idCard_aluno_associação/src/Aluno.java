
public class Aluno {

	private String nome;
	private int idade;
	public Cartao cartao;
	
	public Aluno(String nome, int idade, Cartao cartao) {
		this.nome = nome;
		this.idade = idade;
		this.cartao = cartao;
	}
	
	public String toString() {
		return "Nome: " + this.nome + 
				"\nIdade: " + this.idade + 
				"\nCartão: " + this.cartao.toString();
	}
	
}
