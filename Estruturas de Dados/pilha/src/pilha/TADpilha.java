package pilha;

public class TADpilha {

	private double[] dados;
	private int tamMax;
	private int posFinal;

	public TADpilha(int tamMax) {
		this.dados = new double[tamMax];
		this.tamMax = tamMax;
		this.posFinal = -1;
	}

	public void destroy() {
		this.dados = null;
		System.gc();
	}

	public boolean isEmpty() {
		if (posFinal == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (posFinal == tamMax - 1) {
			return true;
		} else {
			return false;
		}
	}

	public int length() {
		return (this.posFinal + 1);
	}

	public void push(double valor) {
		if (isFull()) {
			System.out.println("Pilha cheia");
		} else {
			this.dados[this.posFinal + 1] = valor;
			this.posFinal++;
		}
	}
	
	public double pop() {
		if (isEmpty()) {
			System.out.println("Pilha vazia");
			return 0;
		}
		else {
			double elemento = this.dados[this.posFinal];
			this.posFinal--;
			return elemento;
		}
	}
	
	public double peek() {
	return this.dados[this.posFinal];
	}

	public void printPilha() {
		System.out.println("------------------------------------------------------");
		if (isEmpty()) {
			System.out.println("Pilha vazia");
		} else {
			for (int i = this.posFinal; i >= 0; i--) {
				System.out.println("Elemento [" + (this.posFinal-i)  + "]"+ this.dados[i]);
			}
		}
		System.out.println("------------------------------------------------------");
	}
}
