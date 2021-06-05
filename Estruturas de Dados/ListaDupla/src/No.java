
public class No {

	//valor
	private double valor;
	
	//referencias
	private No anterior;
	private No posterior;
	
	public No() {}
	
	public No(double valor) {
		this.valor = valor;
	}
	
	public No(double valor, No anterior, No posterior) {
		this.valor = valor;
	}
	
	public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getPosterior() {
        return posterior;
    }

    public void setPosterior(No posterior) {
        this.posterior = posterior;
    }
	
	
}
