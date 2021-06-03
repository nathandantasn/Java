
public class ListaDinamica {

	private No inicio;
	private No fim;
	private int tamanho;

	public ListaDinamica() {
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

	public void insereComeco(double valor) {
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

	public void insereFinal(double valor) {
		No temp = new No();
		if (isEmpty()) {
			inserePrimeiro(valor);
		} else {
			temp.setValor(valor);
			temp.setProx(null);
			this.fim.setProx(temp);
			this.fim = temp;
			this.tamanho++;
		}
	}

	public void insereMeio(double valor, int pos) {
		No temp = new No();
		if (isEmpty() && pos == 0) {
			inserePrimeiro(valor);
		} else if (!isEmpty() && pos == 0) {
			insereComeco(valor);
		} else if (pos == this.tamanho) {
			insereFinal(valor);
		} else if (pos < 0 || pos > this.tamanho) {
			System.out.println("Posição inválida\n");
		} else {
			No ant = this.inicio;
			No prox = ant.getProx();
			for (int i = 1; i < pos; i++) {
				ant = prox;
				prox = ant.getProx();
			}
			temp.setValor(valor);
			temp.setProx(prox);
			ant.setProx(temp);
			this.tamanho++;
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

	public double leElemento(int pos) {
		if (isEmpty()) {
			System.out.println("Lista vazia");
			return 0;
		} else if (pos < 0 || pos > this.tamanho - 1) {
			System.out.println("Posição inválida");
			return 0;
		} else if (pos == 0) {
			return this.inicio.getValor();
		} else if (pos == this.tamanho - 1) {
			return this.fim.getValor();
		} else {
			No ant = this.inicio;
			No prox = ant.getProx();

			for (int i = 1; i < pos; i++) {
				ant = prox;
				prox = ant.getProx();
			}
			return prox.getValor();
		}
	}

	public double removeUltimo() {
		if (isEmpty()) {
			System.out.println("Lista vazia");
			return 0;
		} else if (this.tamanho > 1) {
			System.out.println("Vários elementos");
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

	public double removeComeco() {
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
	
	public double removeFinal() {
		if (isEmpty()) {
			System.out.println("Lista vazia");
			return 0;
		}
		else if (this.tamanho == 1) {
			return removeUltimo();
		}
		else {
			No ant = this.inicio;
			No prox = ant.getProx();
			for (int i = 1; i < this.tamanho-1; i++) {
				ant = prox;
				prox = ant.getProx();
			}
			this.fim = ant;
			ant.setProx(null);
			double valor = prox.getValor();
			prox = null;
			System.gc();
			this.tamanho--;
			return valor;
		}
	}
	
	public double removeMeio(int pos) {
		if (isEmpty()) {
			System.out.println("Lista vazia");
			return 0;
		}
		else if (this.tamanho==1 && pos == 0) {
			return removeUltimo();
		}
		else if (this.tamanho==1 && pos > 0) {
			System.out.println("Apenas 1 elemento na lista");
			return 0;
		}
		else if (this.tamanho > 1 && pos == 0) {
			return removeComeco();
		}
		else if (pos == this.tamanho-1) {
			return removeFinal();
		}
		else {
			No ant = this.inicio;
			No prox = ant.getProx();
			for (int i = 1; i < pos; i++) {
				ant = prox;
				prox = ant.getProx();
			}
			ant.setProx(prox.getProx());
			double valor = prox.getValor();
			prox = null;
			System.gc();
			this.tamanho--;
			return valor;
		}
	}
	
	public void destroy() {
		for (int i =0; i < this.tamanho; i++) {
			removeComeco();
		}
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}
	
	public void ordenar() {
		if (isEmpty()) {
			System.out.println("Lista vazia");
		}else {
			No ant = this.inicio;
			No prox = ant.getProx();
			if (ant.getValor() > prox.getValor()) {
				for (int i = 1; i < length()-1; i++) {
					ant = prox;
					prox = ant.getProx();
				}	
			}
		}
	}
	

}
