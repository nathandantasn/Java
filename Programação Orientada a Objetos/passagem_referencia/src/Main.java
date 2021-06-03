
public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.nome = "Fulano";
		
		System.out.println("antes de chamar o metodo " + p.nome);
		renomear(p);
		System.out.println("depois de chamar o metodo " + p.nome);
	}

	public static void renomear(Pessoa pessoa) {
		pessoa.nome = "Ciclano";
	}
}
