import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double [] notaN1 = new double[4];
		double [] notaN2 = new double[4];
		double [] media = new double[4];
		
		for (int i=0; i<4; i++) {
			System.out.println("Digite a nota N1:");
			notaN1[i] = sc.nextDouble();
			
			System.out.println("Digite a nota N2:");
			notaN2[i] = sc.nextDouble();
			
			media[i] = (0.4 * notaN1[i] + 0.6 * notaN2[i]);
			System.out.println("Media final do aluno " + i + " é: " + media[i]);
		}
		
			for (int i=0; i<4; i++) {
				if (media[i] <= 5) {
					System.out.println("O aluno " + i + " reprovou com média " + media[i]);
				}
			}
		
		sc.close();
		
	}

}
