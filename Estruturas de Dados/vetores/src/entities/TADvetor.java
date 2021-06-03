package entities;

public class TADvetor {

	//atributos
	
	private double vetor[];
	private int tamanho;
	
	//construtor
	
	public TADvetor(int tamanhoVetor) {
		vetor = new double [tamanhoVetor];
		this.tamanho = tamanhoVetor;
	}
	
	//metodos
	
	public void escreveValor(double valor, int pos) {
		this.vetor[pos] = valor;
	}
	
	public double leValor(int pos) {
		return this.vetor[pos];
	}
	
	public void imprimeVetor() {
		System.out.println("Valores do vetor:");
		for(int i = 0; i < this.tamanho; i++) {
			System.out.println(this.vetor[i]);
		}
	}
	
	public String toString() {
		String texto = "";
		for (int i = 0; i < this.tamanho; i++) {
			texto = texto + this.vetor[i]+ " ";
		}
		return texto;
	}

}
