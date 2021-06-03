
public class SomaUniversal {
	
	public int calcular(int numero1, int numero2) throws UniversalException{
		int resultado = numero1 + numero2;
		if (resultado == 42) {
			throw new UniversalException();
		} else {
			return resultado;
		}
	}

}
