import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nome;
		System.out.println("Digite seu nome: ");
		nome = entrada.next();

		int idade;
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();

		if (idade > 18) {
			System.out.println("-------------------------");
			System.out.println("Meu nome eh: " + nome);
			System.out.println("Minha idade eh: " + idade);
			System.out.println("-------------------------");
		}
		entrada.close();
	}

}
