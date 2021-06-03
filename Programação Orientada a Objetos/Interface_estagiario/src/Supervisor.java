
public class Supervisor implements Funcionario{

	private String nome;
	private int qtdSupervisionados;
	private double salarioBase;
	
	public Supervisor(String nome, int qtdSupervisionados, double salarioBase) {
		this.nome = nome;
		this.qtdSupervisionados = qtdSupervisionados;
		this.salarioBase = salarioBase;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	public int getQtdSupersivionados() {
		return this.qtdSupervisionados;
	}
	
	@Override
	public double calcularSalario() {
		return this.getSalarioBase() * this.getQtdSupersivionados();
	}
}
