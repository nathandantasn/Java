
public class FilaCircular {
	
	//atributos
	private double[] dados;
	private int tamMax;
	private int posInicio;
	private int posFinal;
	private int qtdeElementos;
	
	//construtor
	public FilaCircular(int tamLista) {
		this.dados = new double[tamLista];
		this.tamMax = tamLista;
		this.posInicio = 0;
		this.posFinal = this.posInicio;
		this.qtdeElementos = 0;
	}
	//metodos
	
	//vazio
public boolean isEmpty() {
		// if (this.qtdeElementos== 0) {return true;}
		//else { return false;}
	if (this.posInicio == this.posFinal) {
		return true;
	}
	else {
		return false;
	}
}
	
	// calcular tamanho
public int length() {
	
	int temp = this.posFinal - this.posInicio + 1;
	
	if (temp >= 0) {
		return temp;
	}
	else {
		return temp + this.tamMax;
	}	
}
	//cheio
public boolean isFull() {
	// if (this.qtdeElementos == this.tamMax) {return true;}
	// else {return false;}
	return false;
}
	//destroi
	//tamanho
	//inserir
	//remove
	//imprimir

}
