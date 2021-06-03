import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double resultado = 0;
		System.out.print("Digite um valor para converter: ");
		double valor = input.nextDouble();
		System.out.print("Digite 1, 2, 3, 4, 5 ou 6 para converter em:"
				+ " \n1: decimetros para metros\n2: centimetros para metros"
				+ "\n3: milimetros para metros\n4: metros para decimetros"
				+ "\n5: metros para centimetros\n6: metros para milimetros"
				+ "\n\nOpção: ");
		int numero = input.nextInt();
		
		switch (numero) {
		case 1:
			resultado = Conversor.decimetersToMeters(valor);
			break;
		case 2:
			resultado = Conversor.centimetersToMeters(valor);
			break;
		case 3:
			resultado = Conversor.millimetersToMeters(valor);
			break;
		case 4:
			resultado = Conversor.metersToDecimeters(valor);
			break;
		case 5:
			resultado = Conversor.metersToCentimeters(valor);
			break;
		case 6:
			resultado = Conversor.metersToMillimeters(valor);
			break;
		default:
			System.out.println("Opção inválida.");
		}

		System.out.println("\nResultado: "+ resultado);
	}

}
