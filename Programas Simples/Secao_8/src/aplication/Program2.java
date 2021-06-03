package aplication;

import java.util.Scanner;

import entities.Quadrado;

public class Program2 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		Quadrado x, y;
		
		x = new Quadrado();
		y = new Quadrado();
		
		System.out.println("Digite para calcular o perímetro do retângulo: ");
		x.h = sc.nextDouble();
		x.b = sc.nextDouble();
		
		System.out.println("Digite para calcular a área do retângulo: ");
		y.h = sc.nextDouble();
		y.b = sc.nextDouble();
		
		double areaX = x.perimetro();
		double areaY = y.area();
		
		System.out.printf("O perímetro é de %.2f cm%n", areaX);
		System.out.printf("O area é de %.2f cm%n", areaY);
		
		sc.close();
	}
}
