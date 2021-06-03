
public class Veterinario extends Funcionario{
	
	private int horasAtendimento;

	public Veterinario(String nome, int cpf, int rg, int horasAtendimento) {
		super(nome, cpf, rg);
		this.horasAtendimento = horasAtendimento;
	}
	
	@Override
	public double calcularSalario() {
		return 300*this.horasAtendimento;
	}
	
	@Override
	public void getIdentificacao() {
		System.out.println(this.getNome()+":\nCpf: " + this.getCpf() + " Rg: "+ this.getRg()+"\n");
	}
	
}
