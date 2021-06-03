package quadrado;

public class Quadrado {
	
	public Quadrado () {}
	
	public double calcularArea(double lado) {
		return lado * lado;
	}
	
	public double calcularArea(double base, double altura) {
		return base * altura;
	}
	
	public double calcularArea(double base, double altura, double comprimento) {
		return base * altura * comprimento;
	}

}
