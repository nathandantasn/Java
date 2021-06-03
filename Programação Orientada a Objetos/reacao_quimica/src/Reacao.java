
public class Reacao {

	private int A;
	private int B;
	private int C;
	private int qtdC;

	public Reacao(int x, int y) {
		A = x;
		B = y;
		C = x + y;
		qtdC = 0;
	}

	public void adicionarA(int x) {
		A =+ x;
	}

	public void adicionarB(int y) {
		B =+ y;
	}

	public void agitar() {
		if (A + B >= C) {
			if ((A + B) == C) {
				qtdC = qtdC + ((A + B) / C);
				A = 0;
				B = 0;
			} 
			
			else if (A + B % C == 0 && A + B > C) {
				qtdC = qtdC + ((A + B) / C);
				A = 0;
				B = 0;
			}
			else if ((A + B) % C != 0) {
				qtdC = qtdC + ((A + B) / C);
				A = A - C;
				B = B - C - A;
			}
		}
	}

	public int getC() {
		return this.qtdC;
	}
}
