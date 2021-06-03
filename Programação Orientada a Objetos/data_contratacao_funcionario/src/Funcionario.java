
public class Funcionario {

	private String nome;
	private String ocupacao;
	private Data dataNascimento;
	private Data dataContratacao;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public void setDataNascimento(Data dataNascimento ) {
		this.dataNascimento = dataNascimento;
	}
	
	public Data getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setDataContratacao(Data dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	public Data getDataContratacao() {
		return this.dataContratacao;
	}
	
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	
	public String getOcupacao() {
		return this.ocupacao;
	}
	
	public String toString() {
		return "Nome : " + this.nome +
				"\nOcupação: " + this.ocupacao +
				this.dataNascimento +
				this.dataContratacao;
	}
}
