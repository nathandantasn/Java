
public class Main {

	public static void main(String[]args) {
		
		Veiculo ferrari = new Veiculo(1997, 900000);
		Veiculo porsche = new Veiculo(2021, 1241000, "verde");
		
		System.out.println(ferrari.precoAnoFabricacaoVeiculo());
		System.out.println(porsche.precoAnoFabricacaoVeiculo());
		
	}
	
}
