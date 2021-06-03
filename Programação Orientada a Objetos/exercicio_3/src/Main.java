import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = entrada.nextInt();
		
		double valorMedia = media(num1, num2);
		System.out.println("Valor da media: ");
		System.out.println(valorMedia);
		entrada.close();

	}

	public static double media(int n1, int n2){
		double resultado = (n1 + n2)/2.0;
		return resultado;
	}
}
