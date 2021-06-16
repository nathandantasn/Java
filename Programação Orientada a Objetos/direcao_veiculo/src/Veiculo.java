
public class Veiculo {
	
	private int anoFabricacao;
	private double preco;
	private String cor = "branco padrão";
	
	public Veiculo(int ano, double preco) {
		this.anoFabricacao = ano;
		this.preco = preco;
	}
	
	public Veiculo(int ano, double preco, String cor) {
		this.anoFabricacao = ano;
		this.preco = preco;
		this.cor = cor;
	}
	
	
	public int getAnoFabricacao() {
		return this.anoFabricacao;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setAnoFabricacao(int ano) {
		this.anoFabricacao = ano;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String precoAnoFabricacaoVeiculo() {
		return "Esse veículo foi fabricado em " + getAnoFabricacao()
		+ " , custa R$ " + getPreco() + " e tem cor " + getCor();
	}

}
