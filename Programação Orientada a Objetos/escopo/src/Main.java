
public class Main {

	public static void main(String[] args) {

		int numero = 10;
		
		System.out.println("antes de chamar o método: "+ numero);
		incrementar(numero);
		System.out.println("depois de chamar o método: " + incrementar(numero));

	}

	public static int incrementar(int valor) {
		valor = valor + 1;
		return valor;
	}
}
