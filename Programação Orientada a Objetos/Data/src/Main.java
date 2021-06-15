import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		int dia = in.nextInt();
		
		System.out.println("Digite o mes: ");
		int mes = in.nextInt();
		
		System.out.println("Digite o ano: ");
		int ano = in.nextInt();
		
		Data data = new Data(dia, mes, ano);
		if (data.getAno() != 0 && data.getDia() != 0 && data.getMes() != 0) {
			data.displayData();
		}
		
		in.close();
	}

}
