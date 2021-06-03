
public class Main {

	public static void main(String[] args) {

		/*Funcionario funcionario = new Funcionario("Nathan Dantas", 1344);

		System.out.println(funcionario.toString());
		funcionario.aumentarSalario(10);
		System.out.println("\n" + funcionario.toString());
		
		Gerente gerente = new Gerente("Nathan Dantas", 4000, 15);
		
		System.out.println("\n" + gerente.toString());
		gerente.aumentarSalario(10);
		System.out.println("\n" + gerente.toString());

*/
		Funcionario funcionario = new Funcionario("Nathan Dantas", 1344);
		Funcionario funcionario2 = new Funcionario("João Carlos", 1200);
		Gerente gerente = new Gerente("Marília Mendonsa", 6000, 2);
		
		Departamento depart = new Departamento ();
		
		depart.addFuncionario(funcionario);
		depart.addFuncionario(funcionario2);
		depart.addFuncionario(gerente);
		
		depart.aumentarSalarioEquipe(10);
		depart.imprimir();
		
	}

}
