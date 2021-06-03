
public abstract class Estudante {
	
	private String nome;
	private String curso;
	private int horasEstudoSemana;
	
	public Estudante(String nome, String curso, int horasEstudoSemana) {
		this.nome = nome;
		this.curso = curso;
		this.horasEstudoSemana = horasEstudoSemana;
	}
	
	public int getHorasEstudoSemana() {
		return this.horasEstudoSemana;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCuso() {
		return this.curso;
	}

}
