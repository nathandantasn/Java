
public class Funcionario {

	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public void aumentarSalario(double percentual) {
		this.salario += this.salario * percentual / 100;
	}

	public String toString() {
		return "Funcionário: \n[Nome]: " + this.nome + "\n[Salário]: " + this.salario;
	}
}
