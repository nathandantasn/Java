import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Peca bispo = new Peca("Bispo", "Preta");
		Peca cavalo = new Peca("Cavalo", "Branca");
		Peca torre = new Peca("Torre", "Preta");
		Peca peao = new Peca("Peão", "Branca");
		Peca rainha = new Peca("Rainha", "Preta");

		System.out.println(bispo.toString());
		
		ArrayList<Peca> pecas = new ArrayList<>();
		
		pecas.add(bispo);
		pecas.add(cavalo);
		pecas.add(torre);
		pecas.add(peao);
		pecas.add(rainha);
		
		int qtdPecas = pecas.size();
		
		System.out.println(qtdPecas);
		
		Peca p = pecas.get(1);
		
		System.out.print(p.toString()+ "\n\n");
		
		for (int i = 0; i < qtdPecas; i++) {
			Peca peca = pecas.get(i);
			System.out.println(peca);
		}
		
	}

}
