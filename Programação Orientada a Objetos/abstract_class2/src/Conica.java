
public abstract class Conica extends FiguraGeometrica{

	private double distanciaCentroMaior;
	private double distanciaCentroMenor;
	
	public Conica(String nome, double distanciaCentroMaior, double distanciaCentroMenor) {
		super(nome);
		this.distanciaCentroMaior = distanciaCentroMaior;
		this.distanciaCentroMenor = distanciaCentroMenor;
	}
	
	
}
