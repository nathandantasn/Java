package pilha;

public class Main {

	public static void main(String[]args) {
		
		TADpilha pilha = new TADpilha(5);
		
		pilha.printPilha();
		
		pilha.push(50);
		pilha.printPilha();
		
		pilha.push(10);
		pilha.printPilha();
		
		pilha.push(81);
		pilha.printPilha();
		
		pilha.push(34);
		pilha.printPilha();
		
		pilha.push(99);
		pilha.printPilha();
		
		System.out.println(pilha.pop());
		pilha.printPilha();
		
		System.out.println(pilha.pop());
		pilha.printPilha();
		
	}
}
