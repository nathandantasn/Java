
public class No {
	
	//dados
	private double valor;
	
	//referencia
	private No prox;
	
	public No() {}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setProx(No prox) {
		this.prox = prox;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public No getProx() {
		return this.prox;
	}

}
