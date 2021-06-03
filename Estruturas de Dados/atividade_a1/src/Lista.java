
public class Lista {

	private String[] dados;
	private int tamanhoFila;
	private int posicaoFinal;
	private int nItens;
	private double resultado;
	
	public Lista(int tamanhoFila) {
		this.dados = new String[tamanhoFila];
		this.tamanhoFila = tamanhoFila;
		this.posicaoFinal = -1;
		this.nItens = 0;
	}
	
	public void inserirElemento(String elemento) {
		if (nItens == this.tamanhoFila) {
			System.out.println("Não inseriu elemento. Fila está cheia!");
		}
		else { 
			this.dados[posicaoFinal+1] = elemento;
			this.posicaoFinal++;
			this.nItens++;
		}
	}
	
	public String deQueue() {
		if (nItens == 0) {
			return "Não existe dado. Fila está vazia!";
		}
		else {
			String elemento = this.dados[0];
			for (int i = 0; i < this.posicaoFinal; i++) {
				this.dados[i] = this.dados[i+1];
			}
			this.posicaoFinal--;
			this.nItens--;
			return elemento;
		}
	}
	
	public void resolverOperacao() {
		int qtdeParentesesAberto = 0;
		int qtdeParentesesFechado = 0;
		
		for (int i = 0; i < this.posicaoFinal+1; i++) {
			
			if (this.dados[i].compareTo("(") == 0) {
				qtdeParentesesAberto++;
			}
			
			if (this.dados[i].compareTo(")") == 0) {
				qtdeParentesesFechado++;
			}
		}
		
		if (qtdeParentesesAberto != qtdeParentesesFechado ) {
			System.out.println("Quantidade de parenteses está errada, refaça a operação");
		}
		else if (qtdeParentesesAberto == qtdeParentesesFechado ) {
			System.out.println("Parenteses: OK");
		}
		
		for (int i = 0; i < this.posicaoFinal; i++) {
			if  (this.dados[i].compareTo(this.dados[i+1]) == 0) {
				if (this.dados[i].compareTo("(") == 0 || this.dados[i].compareTo(")") == 0 ) {
					System.out.println("Sinais e numeros: OK");
				}
				else {
					System.out.println("Operação invalida, verifique os sinais");	
				}
			}
			
		}
		String d = "2/5";
		double d1 = Double.parseDouble(d);
		System.out.println("Era pra resolver né? Pois é...Pegue sua calculadora e copie exatamente isso ai");
	}
	
	public void imprimir() {

		System.out.println("-------------------------------");
		if (nItens == 0) {
			System.out.println("Não existe dado. Fila está vazia!");
		}
		else {
			for (int i = 0; i <= this.posicaoFinal; i++) {
				System.out.print(this.dados[i]);
			}
		}
		System.out.println("\nResultado = " + this.resultado);
		System.out.println("\n-------------------------------");
	}
	
	public String peek () {
		return this.dados[0];
	}
	
	public int length () {
		return this.posicaoFinal + 1;
	}
	
	public void destruir() {
		this.dados = null;
		System.gc();
	}
	
}
