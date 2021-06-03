package entities;

public class Ponto {

	//private double coordX;
	//private double coordY;
	
	private double[] coord = {0,0};
	
	public Ponto() {}
	
	public void setPoint(double x, double y) {
		//this.coordX = x;
		//this.coordY = y;
		this.coord[0] = x;
		this.coord[1] = y;
	}
	
	public void printPoint() {
		//System.out.println(this.coordX + " " + this.coordY);
		System.out.println(this.coord[0] + " " + this.coord[1]);
	}
}
