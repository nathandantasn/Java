
public class Jedi extends Padawan {
	
	public Jedi(String nome) {
		super(nome);
	}
	
	public void convencer() {
		System.out.println("Esses n�o s�o os droids que voc�s est�o procurando - " + getNome());
	}

}
