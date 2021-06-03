import java.util.Scanner;

public class MetodoComRetorno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean result = isPar(number);
		System.out.println(result);
		sc.close();
	}

	public static boolean isPar(int n1) {
		if (n1 % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
