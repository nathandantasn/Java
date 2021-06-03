import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número n: ");
		int numeroN = sc.nextInt();
		imprimirSequencia(numeroN);
		sc.close();
	}
	
	public static void imprimirSequencia(int n) {
		int i = 1;
		while(i<=n) {
			System.out.printf("%d ", i);
			i++;
		}
	}
}
