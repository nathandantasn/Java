
public class Quadrado extends Quadrilatero {
	private double lado1;
	private double lado2;
	
	public Quadrado(String nome, double lado, double lado2) {
		super(nome, lado, lado2);
		this.lado1 = lado;
		this.lado2 = lado2;
	}
	
	@Override
	public double calcularArea() {
		return this.lado1*this.lado2;
	}
}
