import java.util.ArrayList;

public class ClasseN1 {

	private double pontoExtra;
	private ArrayList <No> lista = new ArrayList<>();
	
	public void adicionarAtividade(double valor) {
		No novoNo = new No();
		novoNo.setValor(valor);
		lista.add(novoNo);
	}
	
	public double getNota(int posicao) {
		No nota = lista.get(posicao);
		return nota.getValor();
	}
	
	public void setPontoExtra(double ponto) {
		this.pontoExtra = ponto;
	}
	
	public double getPontoExtra() {
		return this.pontoExtra;
	}
	
	public double calcularN1() {
		double somaNotas = 0;
		for (int i=0; i < lista.size(); i++) {
			No n = lista.get(i);
			 somaNotas = somaNotas + n.getValor();
		}
		return (somaNotas+getPontoExtra())/lista.size();
	}
	
	public void mostrarQuantoFaltaN2(double var) {
		double resultado = (6-(calcularN1()*0.4));
		double aps = (resultado/0.6 - var)/0.9; 
		double resultadoFinal = (resultado/0.6)/0.9;
		System.out.printf("\nPara ficar com 6 na média final, você precisa tirar : %.2f na prova N2 ou %.2f contando com sua nota da APS\n", resultadoFinal, aps);
	}
	
	public void mostrarQuantoFaltaN2Ead() {
		double resultado = (6-(calcularN1()*0.4)); 
		double resultadoFinal = (resultado/0.6);
		System.out.printf("\nPara ficar com 6 na média final, você precisa tirar : %.2f na prova N2 Ead\n", resultadoFinal);
	}
	
	
}
