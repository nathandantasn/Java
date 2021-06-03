package entitities;

public class Rectangle {
	public double height;
	public double width;
	
	public double area() {
		return height * width;
	}
	public double perimeter() {
		return 2*height + 2*width;
	}
	public double diagonal() {
		return Math.sqrt((Math.pow(height, 2)+ Math.pow(width, 2)));
	}
	public String toString() {
		return String.format("AREA = %.2f%n", area())
			+ String.format("PERIMETER = %.2f%n", perimeter())
			+ String.format("DIAGONAL = %.2f%n", diagonal());
	}
}
