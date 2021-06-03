
public class Personagem {

	private int nivel;
	private int pontosXP;
	private int manaMaxima;
	private int manaJogador;
	private int habilidade0;
	private int nivelHabilidade0;
	private int habilidade1;
	private int nivelHabilidade1;
	private int habilidade2;
	private int nivelHabilidade2;
	private int habilidadeUltimate;
	private int nivelHabilidadeUltimate;
	private int contador;

	public Personagem(int A, int B, int C, int D, int E) {
		nivel = 1;
		manaMaxima = A;
		manaJogador = B + C + D + E;
		habilidade0 = B;
		habilidade1 = C;
		habilidade2 = D;
		habilidadeUltimate = E;
		contador = 0;
	}

	public void adicionarXP(int x) {
	
	}

	public int getNivel() {
		return nivel;
	}

	public boolean melhorarHabilidade(int x) {
		return false;
	}

	public boolean usarHabilidade(int x) {
		return false;
	}

	public void consumirPocao() {
		manaJogador = manaJogador + 350;
		if (manaJogador > manaMaxima) {
			manaJogador = manaMaxima;
		}

	}
}
