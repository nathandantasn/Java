
public class Direcao {
	
	char sentido = 'F';
	double velocidade;
	
	public void virarEsquerda() {
		this.sentido = 'E';
	}
	
	public void virarDireita() {
		this.sentido = 'D';
	}
	
	public void avancar() {
		this.sentido = 'F';
	}

}
