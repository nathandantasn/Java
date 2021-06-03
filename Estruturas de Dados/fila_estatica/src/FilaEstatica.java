
public class FilaEstatica {

	// atributos
	private String[] dados;
	private int tamMax;
	private int posFinal;

	// construtor
	public FilaEstatica(int tamanhoFila) {
		this.dados = new String[tamanhoFila];
		this.tamMax = tamanhoFila;
		this.posFinal = -1;
	}

	// métodos
	// destruir a fila
	public void delete() {
		this.dados = null;
		System.gc();
	}

	// testar se a lista está vazia
	public boolean isEmpty() {
		if (posFinal == -1) {
			return true;
		} else {
			return false;
		}
	}

	// testar se a lista está cheia
	public boolean isFull() {
		if (this.posFinal == (this.tamMax - 1)) {
			return true;
		} else {
			return false;
		}
	}

	// inserir um elemento
	public void enQueue(String valor) {
		if (isFull()) {
			System.out.println("Não inseriu elemento. Fila está cheia!");
		} else {
			this.dados[posFinal + 1] = valor;
			this.posFinal++;
		}
	}

	// remover um elemento
	public String deQueue() {
		if (isEmpty()) {
			System.out.println("Não existe dado. Fila está vazia!");
			return "";
		} else {
			String elemento = this.dados[0];
			for (int i = 0; i < this.posFinal; i++) {
				this.dados[i] = this.dados[i + 1];
			}
			this.posFinal--;
			return elemento;
		}
	}

	// peek - lê o dado acessível
	public String peek() {
		return this.dados[0];
	}

	// tamanho da fila
	public int length() {
		return this.posFinal + 1;
	}

	public int quantidadeDeVogais() {
		int contador = 0;
		for (int i = 0; i < this.posFinal+1; i++) {
			if (dados[i] == "a"|| dados[i] == "A" || dados[i] == "e"||dados[i]=="E" || dados[i]=="i" || dados[i]=="I"
					|| dados[i]=="o" || dados[i]== "O" || dados[i]== "u" || dados[i]== "U") {
				contador++;
			}
		}
		return contador;
	}

	// imprimir fila

	public void imprimir() {

		System.out.println("-------------------------------");
		if (isEmpty()) {
			System.out.println("Não existe dado. Lista está vazia!");
		} else {
			for (int i = 0; i <= this.posFinal; i++) {
				System.out.println("Elemento [" + i + "] = " + this.dados[i]);
			}
		}
		System.out.println("-------------------------------");
	}

	public String toString() {
		String texto = "";
		return texto;
	}
}
