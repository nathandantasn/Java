
public class Program {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();

		pessoa.nome = "Fulano";
		pessoa.idade = 22;
		pessoa.altura = 1.8;

		Pessoa pessoa2 = new Pessoa();

		pessoa2.nome = "Ciclano";
		pessoa2.idade = 30;
		pessoa2.altura = 1.76;

		int valor1 = 2;
		int valor2 = 50;

		System.out.println("Imprimindo dados da pessoa 1: ");
		System.out.println(pessoa.toString());

		System.out.println();

		System.out.println("Imprimindo dados da pessoa 2: ");
		System.out.println(pessoa2.toString());
	}

}
