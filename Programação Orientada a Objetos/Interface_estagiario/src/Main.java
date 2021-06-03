import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Estagiario estagi1 = new Estagiario("Nathan", "Sistemas de Informa��o", 10, 20);
		Estagiario estagi2 = new Estagiario("Bruno", "Engenharia da Computa��o", 10, 20);
		Estagiario estagi3 = new Estagiario("Jo�o", "Ci�ncia da Computa��o", 10, 20);
		Supervisor supervisor = new Supervisor("Lucas", 10, 1500);

		ArrayList<Funcionario> funcionarios = new ArrayList<>();

		funcionarios.add(estagi1);
		funcionarios.add(estagi2);
		funcionarios.add(estagi3);
		funcionarios.add(supervisor);

		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println(
					funcionarios.get(i).getNome() + ":\n" + "Sal�rio: " + funcionarios.get(i).calcularSalario() + "\n");
		}

	}

}
