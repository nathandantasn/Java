import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int qtdeAlunos = 0;
		ArrayList<Estudante> estudantes = new ArrayList<>();

		do {
			try {
				System.out.print("Digite o nome do aluno: ");
				String nome = input.nextLine();

				System.out.print("Digite a nota N1 do aluno: ");
				double notaN1 = input.nextDouble();

				System.out.print("Digite a nota N2 do aluno: ");
				double notaN2 = input.nextDouble();
				input.nextLine();

				if (notaN1 >= 0 && notaN1 <= 10 && notaN2 >= 0 && notaN2 <= 10) {
					Estudante aluno = new Estudante(nome, notaN1, notaN2);
					estudantes.add(aluno);
				}

				qtdeAlunos++;

			} catch (Exception ex) {
				qtdeAlunos++;
			}

		} while (qtdeAlunos < 5);

		for (int i = 0; i < estudantes.size(); i++) {
			Estudante a = estudantes.get(i);
			System.out.print("\nEstudante " + i + ":\n" + a.toString());
		}
		input.close();

	}

}
