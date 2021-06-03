import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char [] gabarito = new char[5];
		
		System.out.println("Digite o gabarito da prova: ");
	
		for (int i=0; i<5; i++) {
			gabarito[i] = sc.nextLine().charAt(0);
		}
		
		char [] notas = new char [5];
		
		System.out.println("Informe as respostas de um aluno: ");
		
		for (int i=0; i<5; i++) {
			notas[i] = sc.nextLine().charAt(0);
		}
		double notaProva = 0;
		
		for (int i=0; i<5; i++) {
			if (notas[i] == gabarito[i]) {
				notaProva = notaProva + 2;
			}
		}
		
		System.out.println("A nota do aluno foi: " + notaProva);
		
		sc.close();

	}

}