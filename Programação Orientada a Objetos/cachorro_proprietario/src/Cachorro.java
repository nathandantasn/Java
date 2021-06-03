
public class Cachorro {

	private String nome;
	private String raca;
	private String cor;
	private int anoNascimento;
	private Proprietario proprietario;
	
	public Cachorro(String nome, int anoDoNascimento, Proprietario proprietario) {
		
		this.nome = nome;
		this.anoNascimento = anoDoNascimento;
		this.proprietario = proprietario;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getRaca() {
		return this.raca;
	}
	
	public String toString() {
		return "Proprietário: \n" + this.proprietario.toString() +
				"\nCachorro:\nnome: " + this.nome +
				"\nraça: " + this.raca +
				"\ncor: " + this.cor + 
				"\nAno de Nascimento: " + this.anoNascimento;
	}
}
