
public class Main {

	public static void main(String[]args) {
		
		Veiculo ferrari = new Veiculo(1997, 900000);
		Veiculo porsche = new Veiculo(2021, 1241000, "verde");
		
		System.out.println(ferrari.precoAnoFabricacaoVeiculo());
		System.out.println(porsche.precoAnoFabricacaoVeiculo());
		System.out.println("");
		ferrari.direcao.virarEsquerda();
		ferrari.mostrarDirecao();
		ferrari.direcao.virarDireita();
		ferrari.mostrarDirecao();
		ferrari.direcao.avancar();
		ferrari.mostrarDirecao();
		System.out.println("");
		porsche.direcao.virarDireita();
		porsche.mostrarDirecao();
		porsche.direcao.avancar();
		porsche.mostrarDirecao();
		porsche.direcao.virarEsquerda();
		porsche.mostrarDirecao();
	}
	
}
