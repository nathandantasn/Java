
public class PilhaDinamica {

	private No inicio;
	private No fim;
	private int tamanho;

	public PilhaDinamica() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}
	
	public boolean isEmpty() {
		if (this.inicio == null && this.fim == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public int length() {
		return this.tamanho;
	}
	
	public void inserePrimeiro(double valor) {
		No temp = new No();
		temp.setValor(valor);
		temp.setProx(null);
		this.inicio = temp;
		this.fim = temp;
		this.tamanho++;
	}
	
	public void push(double valor) {
		No temp = new No();
		if (isEmpty()) {
			inserePrimeiro(valor);
		} else {
			temp.setValor(valor);
			temp.setProx(this.inicio);
			this.inicio = temp;
			this.tamanho++;
		}
	}
	
	public double removeUltimo() {
		if (isEmpty()) {
			System.out.println("Lista vazia");
			return 0;
		} else if (this.tamanho > 1) {
			System.out.println("V�rios elementos");
			return 0;
		} else {
			No temp = this.inicio;
			this.inicio = null;
			this.fim = null;
			this.tamanho = 0;
			double valor = temp.getValor();
			temp = null;
			System.gc();
			return valor;
		}
	}
	
	public double pop() {
		if (isEmpty()) {
			System.out.println("Lista vazia");
			return 0;
		} else if (this.tamanho == 1) {
			return removeUltimo();
		} else {
			No temp = this.inicio;
			this.inicio = temp.getProx();
			double valor = temp.getValor();
			temp = null;
			System.gc();
			this.tamanho--;
			return valor;
		}
	}
	
	public void destroy() {
		for (int i =0; i < this.tamanho; i++) {
			pop();
		}
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}
	
	public double peek() {
		if (isEmpty()) {
			System.out.println("Lista vazia");
			return 0;
		} else {
			return this.inicio.getValor();
		}
	}
	
	public void imprimir() {
		int i = 0;
		if (isEmpty()) {
			System.out.println("Lista vazia");
		} else if (this.tamanho == 1) {
			System.out.println("==========================");
			System.out.println("Quantidade de elementos: " + this.tamanho);
			System.out.println("Elemento [" + i + "] = " + this.inicio.getValor());
		} else {
			No ant = this.inicio;
			No prox = ant.getProx();
			System.out.println("==========================");
			System.out.println("Quantidade de elementos: " + this.tamanho);
			System.out.println("Elemento [" + i + "] = " + ant.getValor());
			i = 1;
			while (prox.getProx() != null) {
				System.out.println("Elemento [" + i + "] = " + prox.getValor());
				ant = prox;
				prox = ant.getProx();
				i++;
			}
			System.out.println("Elemento [" + i + "] = " + prox.getValor());
			System.out.println("==========================");
		}

	}
}
