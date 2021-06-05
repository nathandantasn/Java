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

}
