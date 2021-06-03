
public class Main {

	public static void main(String[]args) {
		
		Biblioteca biblio = new Biblioteca();
		
		Livro livro = new Livro();
		
		biblio.livro = livro;
		
		biblio.livro.nome = "Como programar em java";
		
		System.out.println(biblio.livro.nome);
		
	}
	
}
