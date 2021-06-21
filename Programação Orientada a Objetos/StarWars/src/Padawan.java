
public class Padawan {
	
	private String nome;
	
	public Padawan(String nome) {
		this.nome = nome;
	}
	
	public void usarForca() {
		System.out.println("Usando a força - " + this.nome);
	}
	
	public String getNome(){
		return this.nome;
	}

}
