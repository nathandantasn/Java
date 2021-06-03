
public class Fila {

	private int[] filaComum;
	private int[] filaPreferencial;
	private int tamanhoFilaComum;
	private int tamanhoFilaPreferencial;
	private int posicaoFinalFilaComum;
	private int posicaoFinalFilaPreferencial;
	private int contFilaComum;
	private int contFilaPreferencial;
	private int contFilaRetirarComum;
	private int contFilaRetirarPreferencial;
	private int idade;

	public Fila(int tamanhoFila1, int tamanhoFila2) {
		this.filaComum = new int[tamanhoFila1];
		this.filaPreferencial = new int[tamanhoFila2];
		this.tamanhoFilaComum = tamanhoFila1;
		this.tamanhoFilaPreferencial = tamanhoFila2;
		this.posicaoFinalFilaComum = -1;
		this.posicaoFinalFilaPreferencial = -1;
	}

	public boolean filaComumVazia() {
		if (this.posicaoFinalFilaComum == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean filaPreferencialVazia() {
		if (this.posicaoFinalFilaPreferencial == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean filaComumCheia() {
		if (this.posicaoFinalFilaComum == tamanhoFilaComum - 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean filaPreferencialCheia() {
		if (this.posicaoFinalFilaPreferencial == tamanhoFilaPreferencial - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void entrarNaFila(int idade) {
		if (filaComumCheia() && filaPreferencialCheia()
				|| filaComumCheia() && filaPreferencialCheia() == false && idade < 60
				|| filaComumCheia() == false && filaPreferencialCheia() && idade > 60) {
			System.out.println("A fila está cheia, volte mais tarde");
		} else if (idade >= 60) {
			this.idade = idade;
			this.filaPreferencial[posicaoFinalFilaPreferencial + 1] = idade;
			this.posicaoFinalFilaPreferencial++;
		} else {
			this.idade = idade;
			this.filaComum[posicaoFinalFilaComum + 1] = idade;
			this.posicaoFinalFilaComum++;
		}
	}

	public void removerFilaComum() {
		if (filaComumVazia()) {
			System.out.println("Fila Comum está vazia!");
		} else {
			int atendido = this.filaComum[0];
			for (int i = 0; i < this.posicaoFinalFilaComum; i++) {
				this.filaComum[i] = this.filaComum[i + 1];
			}
			this.posicaoFinalFilaComum--;
			System.out.println("\n");
			System.out.println("");
			System.out.println("___________________________________________");
			System.out.println("\nAtendimento da Fila Comum (" + atendido + " anos).");
		}
	}

	public void removerFilaPreferencial() {
		if (filaPreferencialVazia()) {
			System.out.println("Fila Preferencial está vazia!");
		} else {
			int atendido = this.filaPreferencial[0];
			for (int i = 0; i < this.posicaoFinalFilaPreferencial; i++) {
				this.filaPreferencial[i] = this.filaPreferencial[i + 1];
			}
			this.posicaoFinalFilaPreferencial--;
			System.out.println("\n");
			System.out.println("");
			System.out.println("___________________________________________");
			System.out.println("\nAtendimento da Fila Preferencial (" + atendido + " anos).");

		}
	}

	public void remover() {
		if (this.contFilaRetirarPreferencial >= 2 || filaPreferencialVazia() || this.posicaoFinalFilaComum > 4
				&& this.posicaoFinalFilaPreferencial < 3 && this.contFilaRetirarComum < 3) {
			removerFilaComum();
			this.contFilaComum++;
			if (this.contFilaRetirarPreferencial >= 2) {
				this.contFilaRetirarPreferencial = 0;
			}
			this.contFilaRetirarComum++;
		} else {
			removerFilaPreferencial();
			this.contFilaPreferencial++;
			if (this.contFilaRetirarComum >= 3) {
				this.contFilaRetirarComum = 0;
			}
			this.contFilaRetirarPreferencial++;
		}
	}

	public void imprimirFila() {

		System.out.println("");
		if (filaComumVazia() && filaPreferencialVazia() == false) {
			System.out.println("\nA Fila Comum está vazia!\n");
			System.out.println("");
			for (int i = 0; i <= this.posicaoFinalFilaPreferencial; i++) {
				System.out.println(
						"Fila Preferencial: Posição [" + i + "], idade: " + this.filaPreferencial[i] + " anos");
			}
			System.out.println("\n");
		}

		else if (filaPreferencialVazia() && filaComumVazia() == false) {
			for (int i = 0; i <= this.posicaoFinalFilaComum; i++) {
				System.out.println("Fila Comum: Posição [" + i + "], idade: " + this.filaComum[i] + " anos");
			}
			System.out.println("");
			System.out.println("A Fila Preferencial está vazia!");
			System.out.println("\n");
		} else {
			for (int i = 0; i <= this.posicaoFinalFilaComum; i++) {
				System.out.println("Fila Comum: Posição [" + i + "], idade: " + this.filaComum[i] + " anos");
			}
			System.out.println("");
			for (int i = 0; i <= this.posicaoFinalFilaPreferencial; i++) {
				System.out.println(
						"Fila Preferencial: Posição [" + i + "], idade: " + this.filaPreferencial[i] + " anos");

			}
			System.out.println(" \n");
		}
		System.out.println("Pessoas Atendidas: \nFila Comum: " + this.contFilaComum + "\nFila Preferencial: "
				+ this.contFilaPreferencial);
		System.out.println("___________________________________________\n\n\n\n");

	}

}
