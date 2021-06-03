
public class Main {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.marca = "Sony";
		lampada.potenciaWatts = 100;
		lampada.preco = 20;
		
		
		System.out.println("Características da lâmpada: ");
		lampada.ligar();
		System.out.println(lampada.toString());
		
		System.out.println();

		System.out.println("Características da lâmpada: ");
		lampada.desligar();
		System.out.println(lampada.toString());
	}

}
