
public abstract class FormaDuasDimensoes extends FormaGeometrica{

	private String nome;
	
	public FormaDuasDimensoes(String nome) {
		this.nome = nome;
	}
	
	public abstract void calcularArea();
	
	public abstract double getArea();
}
