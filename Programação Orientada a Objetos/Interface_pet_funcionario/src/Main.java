import java.util.ArrayList;

public class Main {
	
	public static void main(String[]args) {
		Cachorro cachorro = new Cachorro("Dog", 21460929);
		Gato gato = new Gato("Cat", 21167898);
		Peixe peixe = new Peixe("Fish", 21544226);
		
		Vendedor vendedor = new Vendedor("Fulano", 34676526, 6787665, 2300);
		Veterinario veterinario = new Veterinario("Beltrano", 9271521, 9892271, 60);
		
		ArrayList <Identificavel> cadastrados = new ArrayList<>();
		
		cadastrados.add(cachorro);
		cadastrados.add(gato);
		cadastrados.add(peixe);
		cadastrados.add(vendedor);
		cadastrados.add(veterinario);
		
		for (int i=0; i < cadastrados.size(); i++) {
			Identificavel identificados = cadastrados.get(i);
			identificados.getIdentificacao();
		}
	}

}
