
public class Main {

	public static void main(String[] args) {
		
		aluno Nathan = new aluno();
		
		double somaNathan = Nathan.soma(5, 7);
		System.out.println("O soma do Nathan �: " + somaNathan);
		
		double subNathan = Nathan.sub(8, 13);
		System.out.println("A subtra��o do Nathan �: " + subNathan);

		double multNathan = Nathan.mult(8, 7);
		System.out.println("A multiplica��o do Nathan �: " + multNathan);
		
		double divNathan = Nathan.div(4, 2);
		System.out.println("A divis�o do Nathan �: " + divNathan);
		
	}

}
