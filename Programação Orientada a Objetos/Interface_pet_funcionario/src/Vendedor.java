
public class Vendedor extends Funcionario{
	
	private double salario;

	public Vendedor(String nome, int cpf, int rg, double salario) {
		super(nome, cpf, rg);
		this.salario = salario;
	}
	
	@Override
	public double calcularSalario() {
		return this.salario;
	}
	
	@Override
	public void getIdentificacao() {
		System.out.println(this.getNome()+":\nCpf: " + this.getCpf() + " Rg: "+ this.getRg()+"\n");
	}
}
