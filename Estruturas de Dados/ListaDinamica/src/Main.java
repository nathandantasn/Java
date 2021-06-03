
public class Main {

	public static void main(String[] args) {

		ListaDinamica lista = new ListaDinamica();

		lista.insereComeco(30);
		lista.insereFinal(11);
		lista.insereMeio(5, 0);
		lista.insereMeio(77, lista.length() - 1);
		lista.insereFinal(96);
		lista.insereFinal(7852);
		lista.insereComeco(20);
		lista.insereMeio(87, 1);
		lista.imprimir();
		System.out.println(lista.leElemento(5));
		System.out.println(lista.removeComeco());
		System.out.println(lista.removeFinal());
		System.out.println(lista.removeMeio(lista.length() - 1));
		lista.ordenar();
		lista.imprimir();
		lista.destroy();
		lista.imprimir();

	}

}
