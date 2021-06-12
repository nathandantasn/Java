public class ListaDupla {
	
	private No inicio;
    private No fim;
    private int tamanho;
    
    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public boolean isEmpty() {
        if (this.inicio == null && this.fim == null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int length() {
        return this.tamanho;
    }
    
    private void inserePrimeiro(double valor) {
        No temp = new No(valor, null, null);
        this.inicio = temp;
        this.fim = temp;
        this.tamanho = 1;
    } 
    
    
    public void insereComeco(double valor) {
        if(isEmpty()) {
            inserePrimeiro(valor);
        }
        else {
            No temp = new No(valor, null, null);
            temp.setPosterior(this.inicio);
            this.inicio.setAnterior(temp);
            this.inicio = temp;
            this.tamanho++;
        }
    }
    
    
    public void insereFinal(double valor) {
        if(isEmpty()) {
            inserePrimeiro(valor);
        }
        else {
            No temp = new No(valor, null, null);
            temp.setAnterior(this.fim);
            this.fim.setPosterior(temp);
            this.fim = temp;
            this.tamanho++;
        }
    }
    
    public void insereMeio(int pos, double valor) {
        if(isEmpty() && pos == 0) {
            inserePrimeiro(valor);
        }
        else if (!isEmpty() && pos == 0) {
            insereComeco(valor);
        }
        else if (isEmpty() && pos > 0 ) {
            System.out.println("posição errada - lista vazia");
        }
        else if (pos == length()) {
            insereFinal(valor);
        }
        else if (pos < 0 || pos > length()) {
            System.out.println("posição errada");
        }
        else {
            No temp = new No(valor, null, null);
            
            No ant = this.inicio;
            No prox = ant.getPosterior();
            
            for(int i = 1; i < pos; i++) {
                ant = prox;
                prox = ant.getPosterior();
            }
            
            temp.setAnterior(ant);
            temp.setPosterior(prox);
            
            ant.setPosterior(temp);
            prox.setAnterior(temp);
            
            this.tamanho++;
        }
    }
    
    
    
   public void imprime() {
       if(isEmpty()) {
           System.out.println("Lista vazia");
       }
       else {
           No ant = this.inicio;
           No prox = ant.getPosterior();
           
           System.out.println("Elemento = " + ant.getValor());
           for (int i = 1; i < length(); i++) {
               System.out.println("Elemento = " + prox.getValor());
               ant = prox;
               prox = ant.getPosterior();
           }
       }      
   } 
   
   
   public void imprimeinverso() {
         if(isEmpty()) {
           System.out.println("Lista vazia");
       }
       else {
           No ant = this.fim;
           No prox = ant.getAnterior();
           
           System.out.println("Elemento = " + ant.getValor());
           for (int i = 1; i < length(); i++) {
               System.out.println("Elemento = " + prox.getValor());
               ant = prox;
               prox = ant.getAnterior();
           }
       }      
       
   }
   
   public double leElemento(int pos) {
	   if (isEmpty()) {
		   System.out.println("Lista vazia");
		   return 0;
	   } else if (pos == 0) {
		   return this.inicio.getValor();
	   } else if (pos == length() - 1) {
		   return this.fim.getValor();
	   } else if (pos < (length()/2+1)) {
		   No ant = this.inicio;
		   No prox = ant.getPosterior();
		   
		   for (int i=1; i<pos;i++) {
			   ant = prox;
			   prox = ant.getPosterior();
		   }
		   return prox.getValor();
	   } else if (pos > length()/2-1){
		   No ant = this.fim;
		   No prox = ant.getAnterior();
		   for (int i=length()-1; i >= pos; i--) {
			   ant = prox;
			   prox = ant.getAnterior();
		   }
		   return prox.getValor();
	   } else {
		   return 0;
	   }
   }
   
   private double removeUnico() {
	   No temp = this.inicio;
	   
	   this.inicio = null;
	   this.fim = null;
	   this.tamanho = 0;
	   
	   double valor = temp.getValor();
	   temp = null;
	   System.gc();
	   
	   return valor;
   }
   
   public double removeComeco() {
	   if (isEmpty()) {
		   System.out.println("Lista vazia");
		   return 0;
	   } else if (length()==1) {
		   return removeUnico();
	   } else {
		   No temp = this.inicio;
		   double valor = temp.getValor();
		   this.inicio = temp.getPosterior();
		   this.inicio.setAnterior(null);
		   this.tamanho--;
		   
		   temp = null;
		   System.gc();
		   return valor;
	   }
   }
   
   public double removeFinal() {
	   if (isEmpty()) {
		   System.out.println("Lista vazia");
		   return 0;
	   } else if (length()==1) {
		   return removeUnico();
	   } else {
		   No temp = this.fim;
		   double valor = temp.getValor();
		   
		   this.fim = temp.getAnterior();
		   this.fim.setPosterior(null);
		   this.tamanho--;
		   
		   temp = null;
		   System.gc();
		   
		   return valor;
	   }
   }
   
   public double removeMeio(int pos) {
	   if (isEmpty()) {
		   System.out.println("Lista vazia");
		   return 0;
	   } else if (pos == 0) {
		   return removeComeco();
	   } else if (pos == (length()-1)) {
		   return removeFinal();
	   } else if (pos >= length()/2+1) {
		   No ant = this.inicio;
		   No prox = ant.getPosterior();
		   
		   for(int i =1; i < pos; i++) {
			   ant = prox;
			   prox = ant.getPosterior();
		   }
		   
		   No prox1 = prox.getPosterior();
		   No temp = prox;
		   double valor = temp.getValor();
		   ant.setPosterior(prox1);
		   prox1.setAnterior(ant);
		   this.tamanho--;
		   temp= null;
		   System.gc();
		   return valor;
	   } else if (pos > length()/2-1) {
		   No ant = this.fim;
		   No prox = ant.getAnterior();
		   
		   for (int i=length()-2; i > pos; i--) {
			   ant = prox;
			   prox = ant.getAnterior();
		   }
		   
		   No prox1 = prox.getAnterior();
		   No temp = prox;
		   double valor = temp.getValor();
		   ant.setAnterior(prox1);
		   prox.setPosterior(ant);
		   this.tamanho--;
		   temp = null;
		   System.gc();
		   return valor;
	   } else {
		   return 0;
	   }
   }

}
