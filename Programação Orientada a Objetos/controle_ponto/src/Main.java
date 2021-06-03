
public class Main {

	public static void main(String[]args) {
		
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto();
		ControlePonto cp = new ControlePonto();
		
		ponto1.coordenadaX = 5;
		ponto2.coordenadaY = 6;
		
		System.out.println("Ponto X = " + ponto1.coordenadaX);
		System.out.println("Ponto Y = " + ponto2.coordenadaY);
		
		cp.incrementaCoordenadaX(ponto1, 9);
		cp.incrementaCoordenadaY(ponto2, 8);
		
		System.out.println("novo Ponto X = " + ponto1.coordenadaX);
		System.out.println("novo Ponto Y = " + ponto2.coordenadaY);
		cp.incrementaCoordenadaX(ponto1, 9);
		System.out.println("novo Ponto X = " + ponto1.coordenadaX);
	}
}
