import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> idades = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		int entrada = 1;
		
		while (entrada > 0) {
			
			entrada = input.nextInt();
			idades.add(entrada);
		}
		
		int qtd = idades.size();
		
		for (int i = 0; i < qtd - 1; i++) {
			int idade = idades.get(i);
			System.out.println(idade);
		}

			input.close();
	}

}
