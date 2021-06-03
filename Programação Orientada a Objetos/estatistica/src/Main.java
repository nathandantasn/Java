import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Estatistica dados = new Estatistica();
		
		double x = 5;
		double y = 6;
		double z = 7;
		
		double media = dados.media(x,y,z);
		System.out.println("media: " + media);
		
		double absoluto = dados.valorAbsoluto(x, y);
		System.out.println("diferença: " + absoluto);
		

	}

}
