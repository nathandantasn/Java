
public class Main {

	public static void main(String[] args) {
		
		FilaDinamica fila = new FilaDinamica();
		
		fila.enqueue(90);
		fila.enqueue(98);
		fila.enqueue(123);
		fila.enqueue(26);
		fila.enqueue(12);
		fila.enqueue(31);
		fila.enqueue(431);
		fila.enqueue(54);
		System.out.println(fila.peek());
		fila.imprimir();
		
		fila.dequeue();
		System.out.println(fila.peek());
		fila.imprimir();
		fila.dequeue();
		System.out.println(fila.peek());
		fila.imprimir();
		

	}

}
