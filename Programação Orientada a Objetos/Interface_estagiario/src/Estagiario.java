
public class Estagiario extends Estudante implements Funcionario{
	
	private int horasTrabalhoSemana;

	public Estagiario (String nome, String curso, int horasEstudoSemana, int horasTrabalhoSemana) {
		super(nome, curso, horasEstudoSemana);
		this.horasTrabalhoSemana = horasTrabalhoSemana;
	}
	
	public int getHorasTrabalhoSemana() {
		return this.horasTrabalhoSemana;
	}
	
	public int horasDedicacao() {
		return this.getHorasEstudoSemana() + this.getHorasTrabalhoSemana();
	}
	
	@Override
	public double calcularSalario() {
		return this.getHorasTrabalhoSemana()*10;
	}
}
