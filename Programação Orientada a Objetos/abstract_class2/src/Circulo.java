
public class Circulo extends Conica {
	
	private double raio;
	
	public Circulo (String nome, double raio) {
		super (nome, raio, raio);
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * this.raio* this.raio;
	}

}
