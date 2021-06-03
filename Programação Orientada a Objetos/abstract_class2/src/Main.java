import java.util.ArrayList;

public class Main {

	public static void main(String[]args) {
		
		ArrayList <FiguraGeometrica> figuras = new ArrayList<>();
		
		figuras.add(new Circulo("Circulo", 2));
		figuras.add(new Losango("Losango", 2,2));
		figuras.add(new Quadrado("Quadrado", 5,5));
		figuras.add(new Triangulo("Triangulo", 6,4));
		figuras.add(new Elipse("Elipse", 1, 4));
		
		for(int i=0;  i < figuras.size(); i++) {
			System.out.println(figuras.get(i).getNome());
			System.out.println(figuras.get(i).calcularArea());
			
			if (figuras.get(i) instanceof Quadrilatero) {
				System.out.println("tenho 4 lados\n");
			}
			
			else if (figuras.get(i) instanceof Conica) {
				System.out.println("não tenho lado\n");
			}
			
			else {
				System.out.println("tenho 3 lados\n");
			}
			
		}
	}
}
