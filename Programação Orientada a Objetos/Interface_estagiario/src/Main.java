import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Estagiario estagi1 = new Estagiario("Nathan", "Sistemas de Informação", 10, 20);
		Estagiario estagi2 = new Estagiario("Bruno", "Engenharia da Computação", 10, 20);
		Estagiario estagi3 = new Estagiario("João", "Ciência da Computação", 10, 20);
		Supervisor supervisor = new Supervisor("Lucas", 10, 1500);

		ArrayList<Funcionario> funcionarios = new ArrayList<>();

		funcionarios.add(estagi1);
		funcionarios.add(estagi2);
		funcionarios.add(estagi3);
		funcionarios.add(supervisor);

		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println(
					funcionarios.get(i).getNome() + ":\n" + "Salário: " + funcionarios.get(i).calcularSalario() + "\n");
		}

	}

}
