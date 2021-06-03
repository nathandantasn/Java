
public class Exemplo2 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome = "Fulano";
		p2.nome = "Ciclano";
		
		System.out.println("p1 "+p1.nome);
		System.out.println("p2 "+p2.nome);
		
		System.out.println("antes de chamar o método " + p1.nome);
		alterar(p1);
		System.out.println("depois de chamar o método " + p1.nome);

	}

	public static void alterar (Pessoa pessoa) {
		pessoa.nome = "Beltrano";
	}
}
