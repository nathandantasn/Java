
public class Quadrado extends FiguraGeometrica {

	private double lado;
	
	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return this.lado*this.lado;
	}
}
