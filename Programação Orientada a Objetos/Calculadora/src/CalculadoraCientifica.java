
public class CalculadoraCientifica extends Calculadora {

	public void potencia(double n, double n2) {
		setResultado(Math.pow(n, n2));
		System.out.println("Resultado potência: " + getResultado());
	}
	
	public void raizQuadrada(double n) {
		setResultado(Math.sqrt(n));
		System.out.println("Resultado raiz quadrada: " + getResultado());
	}
}
