
public class Gato extends Pet{

	public Gato(String nome, int id) {
		super(nome, id);
	}
	
	@Override
	public void falar() {
		System.out.println("Miau");
	}
	
	@Override
	public void getIdentificacao() {
		System.out.println(this.getNome()+": "+this.getId()+"\n");
	}
}
