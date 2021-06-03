
public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();

		pessoa.nome = "Fulano";
		
		System.out.println("nome pessoa " + pessoa.nome);
		
		Pessoa pessoa2 = new Pessoa("Ciclano");
		
		System.out.println("nome pessoa2 " + pessoa2.nome);
	}

}
