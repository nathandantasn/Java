
public class Elipse extends Conica{

	private double distanciaCentroMaior;
	private double distanciaCentroMenor;
	
	public Elipse(String nome, double distanciaCentroMaior, double distanciaCentroMenor) {
		super(nome, distanciaCentroMaior, distanciaCentroMenor);
		this.distanciaCentroMaior = distanciaCentroMenor;
		this.distanciaCentroMenor = distanciaCentroMenor;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * this.distanciaCentroMenor * this.distanciaCentroMaior;
	}
	
}
