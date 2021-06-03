
public class Triangulo extends FiguraGeometrica {

	private double altura;
	private double base;
	
	public Triangulo (String nome, double base, double altura) {
		super(nome);
		this.altura = altura;
		this.base = altura;
	}
	
	@Override
	public double calcularArea() {
		return (base*altura)/2;
	}
}
