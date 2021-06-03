public abstract class FiguraGeometrica {

	private String nome;
	
	public FiguraGeometrica(String nome) {
		this.nome = nome;
	}
	
	public abstract double calcularArea();
	
	public String getNome() {
		return this.nome;
	}
}
