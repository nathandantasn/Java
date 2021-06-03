import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continuar = true;
		//do {
			try {
				System.out.println("Digite o numerador:");
				int numerador = input.nextInt();

				System.out.println("Digite o denominador:");
				int denominador = input.nextInt();

				Matematica ma = new Matematica();

				int resultado = ma.dividir(numerador, denominador);

				System.out.println("Resultado: " + resultado);
				continuar = false;
			} catch (ArithmeticException ex) {
				System.out.println("N�o existe divis�o por 0");
			
			} catch (InputMismatchException ex) {
				System.out.println("Digite um n�mero inteiro");
				input.nextLine();
			} finally {
				input.close();
			}
		//} while (continuar);

		System.out.println("Encerrando programa normalmente");

	}
}
