
public class Jedi extends Padawan {
	
	public Jedi(String nome) {
		super(nome);
	}
	
	public void convencer() {
		System.out.println("Esses não são os droids que vocês estão procurando - " + getNome());
	}

}
