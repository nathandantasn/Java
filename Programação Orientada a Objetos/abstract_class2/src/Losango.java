
public class Losango extends Quadrilatero {

	private double distanciaMaior;
	private double distanciaMenor;
	
	public Losango(String nome, double distanciaMaior, double distanciaMenor) {
		super(nome, distanciaMaior, distanciaMenor);
		this.distanciaMaior = distanciaMaior;
		this.distanciaMenor = distanciaMenor;
	}
	
	@Override
	public double calcularArea() {
		return (this.distanciaMaior*this.distanciaMenor)/2;
	}
	
}
