
public abstract class Funcionario implements Identificavel{

	private String nome;
	private int cpf;
	private int rg;
	
	public Funcionario(String nome, int cpf, int rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getRg() {
		return this.rg;
	}
	
	public int getCpf() {
		return this.cpf;
	}
	
	public abstract double calcularSalario();
}
