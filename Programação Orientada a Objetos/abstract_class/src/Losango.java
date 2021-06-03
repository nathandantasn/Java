
public class Losango extends FiguraGeometrica {

	private double distanciaMaior;
	private double distanciaMenor;
	
	public Losango(String nome, double distanciaMaior, double distanciaMenor) {
		super(nome);
		this.distanciaMaior = distanciaMaior;
		this.distanciaMenor = distanciaMenor;
	}
	
	@Override
	public double calcularArea() {
		return (this.distanciaMaior*this.distanciaMenor)/2;
	}
	
}
