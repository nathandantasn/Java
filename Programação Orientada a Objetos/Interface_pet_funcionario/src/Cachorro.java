
public class Cachorro extends Pet {
	
	public Cachorro(String nome, int id) {
		super(nome, id);
	}

	@Override
	public void falar() {
		System.out.println("AuAu");
	}
	
	@Override
	public void getIdentificacao() {
		System.out.println(this.getNome()+": "+this.getId()+"\n");
	}
}
