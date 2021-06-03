import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {

	private Date data = new Date();
	private String dataFormatada = new SimpleDateFormat("yyyymdd").format(data);
	private String nome;
	private String RA = dataFormatada;
	public static int contadorDeRA;
	
	public Aluno(String nome) {
		this.nome = nome;
		contadorDeRA++;
		this.RA += contadorDeRA;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getRA() {
		return this.RA;
	}
	
	public String toString() {
		return "\nAluno: " + this.nome
				+ "\nRA: " + this.RA + "\n";
	}
}
