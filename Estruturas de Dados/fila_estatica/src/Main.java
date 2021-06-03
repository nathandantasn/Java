
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello Queue!");
		
		FilaEstatica fila = new FilaEstatica(10);
		
		System.out.println("Vazia? "+ fila.isEmpty());
		System.out.println("Cheia? "+ fila.isFull());
		
		fila.enQueue("a");
		fila.imprimir();
		
		fila.enQueue("e");
		fila.imprimir();
		
		fila.enQueue("n");
		fila.imprimir();
		
		fila.enQueue("b");
		fila.imprimir();
		
		fila.enQueue("I");
		fila.imprimir();
		
		System.out.println("Quantidade de vogais: " + fila.quantidadeDeVogais());
		
		System.out.println("Removeu: " + fila.deQueue());
		fila.imprimir();
		
		System.out.println("Quantidade de vogais: " + fila.quantidadeDeVogais());
		
		System.out.println("Removeu: " + fila.deQueue());
		fila.imprimir();
		
		System.out.println("Quantidade de vogais: " + fila.quantidadeDeVogais());
	}

}
