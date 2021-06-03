
public class Lampada {

	private int potencia;
	private boolean estado;
	private int mudancaEstado;

	public Lampada(int potencia) {
		this.potencia = potencia;
		estado = false;
		mudancaEstado = 0;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estadoLampada) {
		int numeroTentativas = potencia / 10;
		if (mudancaEstado < numeroTentativas && numeroTentativas > 1) {
			if (estadoLampada == true && this.estado == false) {
				this.estado = true;
				mudancaEstado++;
			}
			else if (estadoLampada == false && this.estado == true){
				this.estado = false;
				mudancaEstado++;
			}
			else {
				this.estado = false;
			}
			}
		}
}
