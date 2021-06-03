import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
	
		ArrayList <Aluno> alunos = new ArrayList();
		
		Scanner input = new Scanner(System.in);
		
		for (int i=1; i <= 5; i++) {
			System.out.print("Digite o nome do " + i +"º aluno: ");
			String texto = input.nextLine();
			Aluno aluno = new Aluno(texto);
			alunos.add(aluno);
		}
		
		for (int i=0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i).toString());
		}
		
	}
}
