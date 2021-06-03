import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o tamanho da operação: ");
		int tamanhoFila = input.nextInt();
		
		Lista fila = new Lista(tamanhoFila);
		String elemento = "";
		int contador = 0;
		
		while (contador < tamanhoFila) {
			System.out.print("Digite o elemento para inserir na operação: ");
			elemento = input.next();
			fila.inserirElemento(elemento);	
			contador++;
		}
				
		fila.imprimir();
		fila.resolverOperacao();
		fila.imprimir();
		input.close();
	}

}
