
public class Cartao {
	
	private int anoDeIngresso;
	private int codigo;
	private int RA;
	private String universidade;
	private String curso;
	private String periodo;
	
	public Cartao(int RA, int codigoCartao, int anoDeIngresso) {
		this.codigo = codigoCartao;
		this.RA = RA;
		this.anoDeIngresso = anoDeIngresso;
	}
	
	public void setNomeUniversidade(String nome) {
		this.universidade = nome;
	}
	
	public void setNomeCurso(String nome) {
		this.curso = nome;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public String getPeriodo() {
		return this.periodo;
	}
	public String toString() {
		return "\nAno de ingresso: " + this.anoDeIngresso + 
				"\nCódigo: " + this.codigo + 
				"\nRA: " + this.RA + 
				"\nUniversidade: " + this.universidade +
				"\nCurso: " + this.curso;
	}
}
