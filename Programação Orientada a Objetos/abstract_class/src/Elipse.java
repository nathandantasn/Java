
public class Elipse extends FiguraGeometrica{

	private double altura;
	private double base;
	
	public Elipse(String nome, double base, double altura) {
		super(nome);
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * this.altura * this.base;
	}
	
}
