
public class Veiculo {
	
	private int anoFabricacao;
	private double preco;
	private String cor = "branco padr�o";
	Direcao direcao;
	
	public Veiculo(int ano, double preco) {
		this.anoFabricacao = ano;
		this.preco = preco;
		this.direcao = new Direcao();
	}
	
	public Veiculo(int ano, double preco, String cor) {
		this.anoFabricacao = ano;
		this.preco = preco;
		this.cor = cor;
		this.direcao = new Direcao();
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
	
	public void mostrarDirecao() {
		if (direcao.sentido == 'E') {
			System.out.println("Dire��o: Esquerda");
		} else if (direcao.sentido == 'D') {
			System.out.println("Dire��o: Direita");
		} else if (direcao.sentido == 'F') {
			System.out.println("Dire��o: Frente");
		}
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
		return "Esse ve�culo foi fabricado em " + getAnoFabricacao()
		+ " , custa R$ " + getPreco() + " e tem cor " + getCor();
	}

}
