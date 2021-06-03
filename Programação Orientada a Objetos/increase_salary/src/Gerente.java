
public class Gerente extends Funcionario {

	private int nrFuncionario;

	public Gerente(String nome, double salario, int nrFuncionario) {
		super(nome, salario);
		this.nrFuncionario = nrFuncionario;
	}
	
	@Override
	public void aumentarSalario(double percentual) {
		super.aumentarSalario(percentual + 20);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n[Número de funcionários]: " + this.nrFuncionario;
	}
	
}
