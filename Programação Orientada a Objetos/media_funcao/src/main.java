import java.util.Scanner;

public class main {

	public static void main(String[]args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros para calcular a m�dia:");
		
		double A = enter.nextDouble();
		double B = enter.nextDouble();
		
		double result = media(A, B);
		
		System.out.println("M�dia: " + result);
		
		enter.close();

	}
	
	public static double media(double x, double y) {
		return (x + y)/2;
	}

}
