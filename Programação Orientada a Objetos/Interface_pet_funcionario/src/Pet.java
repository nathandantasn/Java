
public abstract class Pet implements Identificavel{

	private String nome;
	private int id;
	
	public Pet(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	public abstract void falar();
	
	public String getNome() {
		return this.nome;
	}
	
	public int getId() {
		return this.id;
	}

}
