
public class Main {

	public static void main(String[] args) {
		CalculadoraCientifica calculadora = new CalculadoraCientifica();
		
		calculadora.somar(10, 50);
		calculadora.subtrair(6, 7);
		calculadora.multiplicar(5, 10);
		calculadora.dividir(10, 0);
		calculadora.dividir(30, 10);
		calculadora.potencia(10, 3);
		calculadora.raizQuadrada(64);
	}
	

}
