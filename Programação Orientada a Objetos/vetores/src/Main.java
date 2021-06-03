import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] idades = new int [10];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite a idade da pessoa "+ i+":");
			idades[i] = sc.nextInt();
		}
		for (int i=0; i<10; i++) {
			System.out.println(idades[i]);
		}
		sc.close();

	}

}
