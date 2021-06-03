import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo("Circulo", 2.5); 

		Quadrado quadrado = new Quadrado("Quadrado", 4);
		
		Triangulo triangulo = new Triangulo("Triângulo", 1, 3);
		
		Losango losango = new Losango("Losango", 5, 3);
		
		Elipse elipse = new Elipse("Elipse", 6, 8);
		
		ArrayList <FiguraGeometrica> figuras = new ArrayList <>();
		
		figuras.add(circulo);
		figuras.add(quadrado);
		figuras.add(triangulo);
		figuras.add(elipse);
		figuras.add(losango);
		
		for(int i=0;  i < figuras.size(); i++) {
			System.out.println(figuras.get(i).getNome());
			System.out.println(figuras.get(i).calcularArea());
		}
	}

}
