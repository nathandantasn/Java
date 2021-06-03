import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> tarefas = new ArrayList<>();
		
		tarefas.add("Arrumar a cama");
		tarefas.add("Limpar o quarto");
		tarefas.add("Fazer a lição de casa");
		tarefas.add("Ir ao mercado");
		tarefas.add("Responder e-mails");
		tarefas.add("Pagar contas");
		tarefas.add("Levar o cachorro para passear");
		tarefas.add("Varrer o quintal");
		tarefas.add("Treinar programação");
		tarefas.add("Cozinhar");
		tarefas.add("Preparar marmita");
		
		int qtdTarefas = tarefas.size();
		
		for (int i = 0; i < qtdTarefas; i++) {
			
			String taf = tarefas.get(i);
			System.out.println(i + ": " +taf);
		}

	}

}
