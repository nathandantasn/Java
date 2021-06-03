import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero1 = input.nextInt();
		
		System.out.println("Digite o segundo número:");
		int numero2 = input.nextInt();
		
		SomaUniversal su = new SomaUniversal();
		
		try {
			int resultado = su.calcular(numero1, numero2);
			System.out.println("Soma: " + resultado);
			input.close();
		} catch (UniversalException ex) {
			System.out.println(ex.getMessage());
			input.close();
		}
	}
}
