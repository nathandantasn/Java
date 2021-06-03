
public class Produto {

	private int qtdProduto;
	private float valorProduto;
	private float receita;
	private int qtdProdutoVendido;

	public Produto(int qtdProduto, float valorProduto) {
		this.qtdProduto = qtdProduto;
		this.valorProduto = valorProduto;
	}

	public int getEstoque() {
		return qtdProduto;
	}

	public float getPreco() {
		return valorProduto;
	}

	public void ajustarPreco(float porcentagem) {
		this.valorProduto = this.valorProduto * (porcentagem / 100) + this.valorProduto;
	}

	public float tentarCompra(float pagamento) {

		float troco = 0;
		if (qtdProduto == 0) {
			return pagamento;
		} else if (pagamento > valorProduto && qtdProduto > 0) {

			troco = pagamento - valorProduto;
			qtdProduto--;
			qtdProdutoVendido++;

			if (troco > 0) {
				return troco;
			} else {
				return pagamento;
			}
		} else {
			return pagamento;
		}

	}
	public float getReceita() {
		this.receita = qtdProdutoVendido * valorProduto;
		return receita;
	}
}
