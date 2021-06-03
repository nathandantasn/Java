
public class Proprietario {

	private String nome;
	private int telefone;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getTelefone() {
		return this.telefone;
	}
	
	public String toString() {
		return "nome: " + this.nome +
				"\ntelefone: " + this.telefone;
	}
}
