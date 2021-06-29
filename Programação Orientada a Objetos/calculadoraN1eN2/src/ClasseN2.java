
public class ClasseN2 {

	private double aps;
	private double prova;
	
	public ClasseN2() {}
	
	public void notaAps(double aps) {
		this.aps = aps;
	}
	
	public void notaProva(double prova) {
		this.prova = prova;
	}	
	
	public double getAps() {
		return this.aps;
	}
	
	public double getProva() {
		return this.prova;
	}
	
	public double calcularN2() {
		return getAps() + getProva()* 0.9;
	}
	
	public double calcularN2Ead() {
		return getProva()* 0.9;
	}
	
}
