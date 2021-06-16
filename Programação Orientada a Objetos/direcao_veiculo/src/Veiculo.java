
public class Veiculo {
	
	private double preco;
	private int anoFabricacao;
	
	
	public int getAnoFabricacao() {
		return this.anoFabricacao;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setAnoFabricacao(int ano) {
		this.anoFabricacao = ano;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String precoAnoFabricacaoVeiculo() {
		return "Esse veículo foi fabricado em " + getAnoFabricacao()
		+ " e custa R$ " + getPreco();
	}

}
