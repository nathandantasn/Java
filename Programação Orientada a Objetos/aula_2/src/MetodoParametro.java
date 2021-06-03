import java.util.Scanner;

public class MetodoParametro {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do professor: ");
		String nome = sc.next();
		imprimirDadosDisciplina(nome);
		sc.close();
	}
	
	public static void imprimirDadosDisciplina(String nomeProfessor) {
		
		System.out.println("=======================");
		System.out.println("Programação Orientada a Objetos");
		System.out.println("Professor: " + nomeProfessor);
		System.out.println("=======================");
		
	}
}
