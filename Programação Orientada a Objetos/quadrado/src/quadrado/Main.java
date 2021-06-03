package quadrado;

public class Main {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado();
		
		double area = q1.calcularArea(2);
		System.out.println("area: " + area);
		
		double areaRetangulo = q1.calcularArea(2, 4);
		System.out.println("area: " + areaRetangulo);
		
		double areaQuadrado = q1.calcularArea(2, 3, 4);
		System.out.println("area: " + areaQuadrado);

	}

}
