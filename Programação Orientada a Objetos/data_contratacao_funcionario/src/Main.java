
public class Main {

	public static void main(String[]args) {
		
		Funcionario funcionario = new Funcionario("Nathan Dantas Nascimento");
		funcionario.setOcupacao("Auxiliar de Biblioteca");
		
		Data dataContratacao = new Data(20, 05, 2019);
		
		funcionario.setDataContratacao(dataContratacao);
		
		Data dataNascimento = new Data(28, 12, 1998);
		
		funcionario.setDataNascimento(dataNascimento);
		
		System.out.println(funcionario.toString());
	
		System.out.println("\nTestando método funcionario.get");
		System.out.println(funcionario.getDataContratacao());
	}
}
