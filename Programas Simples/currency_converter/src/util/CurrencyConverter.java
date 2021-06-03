package util;

public class CurrencyConverter {

	public static double dollar;
	
	public static double converter(double x) {
		
		return  ((x * dollar) * 0.06) + (x * dollar);
		
	}
	
}
