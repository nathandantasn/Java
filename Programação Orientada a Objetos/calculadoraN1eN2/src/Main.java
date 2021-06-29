import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double var = 0;
		double var1 = 1;
		ClasseN1 n1 = new ClasseN1();
		ClasseN2 n2 = new ClasseN2();
		System.out.print("Digite a nota da prova N1: ");
		var = input.nextDouble();
		n1.adicionarAtividade(var);
		while(var1 != 0 ) {
			System.out.print("Para adicionar uma atividade clique 1: ");
			var1 = input.nextDouble();
			if (var1 == 1) {
				System.out.print("Digite a nota da atividade: ");
				var = input.nextDouble();
				n1.adicionarAtividade(var);
			}
		}
		System.out.printf("\nSua nota N1: %.2f" , n1.calcularN1()*0.4);
		//System.out.print("\nDigite a nota da APS da N2: ");
		//var = input.nextDouble();
		//n2.notaAps(var);
		n1.mostrarQuantoFaltaN2(n2.getAps());
		n1.mostrarQuantoFaltaN2Ead();
		System.out.print("Digite a nota da prova da N2: ");
		var = input.nextDouble();
		n2.notaProva(var);
		double resultado = (n1.calcularN1()*0.4) + (n2.calcularN2()*0.6);
		double resultadoEad = (n1.calcularN1()*0.4) + (n2.calcularN2Ead()*0.6);
		System.out.printf("\nSua nota N2: %.2f" , n2.calcularN2()*0.6);
		System.out.printf("\nSua nota N2 Ead: %.2f" , n2.calcularN2Ead()*0.6);
		System.out.printf("\nSua média final: %.2f" , resultado);
		input.close();
	}

}
