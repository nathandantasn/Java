
public class TadLista {

	double dados[];
	int tamanhoMaxLista;
	int posFinalLista;

	public TadLista(int tamanhoMaxLista) {
		this.dados = new double[tamanhoMaxLista];
		this.tamanhoMaxLista = tamanhoMaxLista;
		this.posFinalLista = -1;
	}

	public void destroiLista() {
		this.dados = null;
		System.gc();
	}

	public void inserirElementoComeco(double valor) {
		if (this.posFinalLista == this.tamanhoMaxLista - 1) {
			System.out.println("Lista cheia");
		} else {
			for (int i = this.posFinalLista; i > 0; i--) {
				this.dados[i] = this.dados[i - 1];
			}
			this.dados[0] = valor;
			this.posFinalLista++;
			System.out.print("Elemento Inserido");
		}
	}

	public void inserirElementoMeio(int posicao, double valor) {
		if (this.posFinalLista == this.tamanhoMaxLista - 1) {
			System.out.println("Lista cheia");
		} else if ((posicao < 0) || (posicao > this.posFinalLista)) {
			System.out.println("Posição inválida");
		} else {
			for (int i = this.posFinalLista + 1; i > posicao; i--) {
				this.dados[i] = this.dados[i - 1];
			}
			this.dados[posicao] = valor;
			this.posFinalLista++;
		}
	}

	public void inserirElementoFinal(double valor) {
		if (this.posFinalLista == this.tamanhoMaxLista - 1) {
			System.out.println("Lista cheia");
		} else {
			this.dados[this.posFinalLista] = valor;
			this.posFinalLista++;
		}
	}

	public double removerElementoComeco() {
		if (this.posFinalLista == -1) {
			System.out.println("Lista Vazia");
			return 0;
		} else {
			double elemento = this.dados[0];
			for (int i = 0; i < this.posFinalLista; i++) {
				this.dados[0] = this.dados[i+1];
			}
			this.posFinalLista--;
			return elemento;
		}

	}
	
	public double removerElementoMeio(int posicao) {
		if (this.posFinalLista == -1) {
			System.out.println("Lista Vazia");
			return 0;
		} else if ((posicao < 0) || (posicao > this.posFinalLista)) {
			System.out.println("Posição Inválida");
			return 0;
		} else {
			double elemento = this.dados[posicao];
			for (int i = posicao; i < this.posFinalLista; i++) {
				this.dados[i] = this.dados[i+1];
			}
			this.posFinalLista--;
			return elemento;
		}
	}
	
	public double removerElementoFinal() {
		if (this.posFinalLista == -1) {
			System.out.println("Lista Vazia");
			return 0;
		}
		else {
			double elemento = this.dados[this.posFinalLista];
			this.posFinalLista--;
			return elemento;
		}
	}
	
	public void imprimeLista() {
		for(int i = 0; i <= this.posFinalLista+1; i++) {
			System.out.printf("Elemento [%d] = %.2f%n", i, this.dados[i]);
		}
	}
	
	public void ordenarLista() {
		
	}
}
