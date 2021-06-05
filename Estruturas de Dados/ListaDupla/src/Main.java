public class Main {

	public static void main(String[] args) {
		
		 ListaDupla lista = new ListaDupla();
	        
	        
	        lista.insereComeco(5);
	        lista.insereComeco(10);
	        lista.insereComeco(20);
	        
	        
	        
	        lista.insereFinal(8);
	        lista.insereFinal(87);
	        lista.insereFinal(985);
	        
	        
	        lista.insereMeio(0, 6);
	        lista.insereMeio(0, 7);
	        lista.insereMeio(0, 9);
	        lista.imprime();
	        System.out.println("--------------");
	       // ld.insereMeio(4, 15);
	        
	        
	        lista.imprimeinverso();

	}

}
