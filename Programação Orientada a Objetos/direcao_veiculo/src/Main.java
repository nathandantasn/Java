
public class Main {

	public static void main(String[]args) {
		
		Veiculo ferrari = new Veiculo();
		Veiculo porsche = new Veiculo();
		
		ferrari.setAnoFabricacao(2007);
		ferrari.setPreco(900000);
		porsche.setAnoFabricacao(2021);
		porsche.setPreco(1241000);
		
		System.out.println(ferrari.precoAnoFabricacaoVeiculo());
		System.out.println(porsche.precoAnoFabricacaoVeiculo());
		
	}
	
}
