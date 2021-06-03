package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		CurrencyConverter.dollar = sc.nextDouble();
		
		System.out.printf("How many dollar will be bought? ");
		double dollarToBuy = sc.nextDouble();
		
		double dollarBought = CurrencyConverter.converter(dollarToBuy);
		
		System.out.printf("Amount to be paid in reais = %.2f%n" , dollarBought);
		
		sc.close();

	}

}
