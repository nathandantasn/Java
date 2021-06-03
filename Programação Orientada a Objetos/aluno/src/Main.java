
public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(21460929);
		
		aluno.nome = "Nathan Dantas";
		
		System.out.println("nome: " + aluno.nome);
		System.out.println("RA: " + aluno.ra);
		
		Aluno aluno2 = new Aluno("José Carlos", 21436797);
		
		System.out.println("nome: " + aluno2.nome);
		System.out.println("RA: " + aluno2.ra);

	}

}
