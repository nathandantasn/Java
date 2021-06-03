
public class Main {

	public static void main(String[] args) {
		
		aluno Nathan = new aluno();
		
		double somaNathan = Nathan.soma(5, 7);
		System.out.println("O soma do Nathan é: " + somaNathan);
		
		double subNathan = Nathan.sub(8, 13);
		System.out.println("A subtração do Nathan é: " + subNathan);

		double multNathan = Nathan.mult(8, 7);
		System.out.println("A multiplicação do Nathan é: " + multNathan);
		
		double divNathan = Nathan.div(4, 2);
		System.out.println("A divisão do Nathan é: " + divNathan);
		
	}

}
