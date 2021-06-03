import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int i=1; i<=N; i++) {
			System.out.print(i + " ");
			double x = Math.pow(i, 2);
			System.out.print(x + " ");
			x = Math.pow(i, 3);
			System.out.println(x);
		}
		sc.close();
	}
		
}