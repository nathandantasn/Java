
public class Calculadora implements Trigonometrica {
	
	private double resultado;
	
	private void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	public void soma(double a, double b) {
		double resultado = a + b;
		setResultado(resultado);
		System.out.println("Resultado da soma: " + getResultado());
	}
	
	public void subtracao(double a, double b) {
		double resultado = a - b;
		setResultado(resultado);
		System.out.println("Resultado da subtração: " + getResultado());
	}
	
	public void divisao(double a, double b) {
		if (b ==0) {
			System.out.println("Não é possível dividir por 0");
		} else {
			double resultado = a / b;
			setResultado(resultado);
			System.out.println("Resultado da subtração: " + getResultado());
		}
	}
	
	public void multiplicacao(double a, double b) {
		double resultado = a * b;
		setResultado(resultado);
		System.out.println("Resultado da subtração: " + getResultado());
	}

	public void seno(double angulo) {
		double radiano = Math.toRadians(angulo);
		double seno = Math.sin(radiano);
		setResultado(seno);
		System.out.println("Resultado seno: " + getResultado());
	}
	
	public void cosseno(double angulo) {
		double radiano = Math.toRadians(angulo);
		double cosseno = Math.cos(radiano);
		setResultado(cosseno);
		System.out.println("Resultado cosseno: " + getResultado());
	}
	
	public void tangente(double angulo) {
		double radiano = Math.toRadians(angulo);
		double tangente = Math.tan(radiano);
		setResultado(tangente);
		System.out.println("Resultado tangente: " + getResultado());
	}

}
