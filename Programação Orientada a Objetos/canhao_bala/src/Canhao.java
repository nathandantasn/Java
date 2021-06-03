
public class Canhao {

	private Bala bala;
	
	public Canhao (Bala bala) {
		this.bala = bala;
	}
	
	public void disparar(double velocidadeInicial, double anguloInclinacao) {
		double radiano = Math.toRadians(anguloInclinacao);
		double cos = Math.cos(radiano);
		double sin = Math.sin(radiano);
		double posicaoFinal = 2 * Math.pow(velocidadeInicial, 2) * (cos * sin) / 9.81;
		this.bala.setPosicaoX(posicaoFinal);
	}
	
	public double getAlcanceMaximo() {
		return this.bala.getPosicaoX();
	}
	
	public void setBala(Bala bala) {
		this.bala = bala;
	}
	
	
	
}
