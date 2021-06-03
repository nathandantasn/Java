/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

/**
 *
 * @author BrunoMulina
 */
public class Lista {
     //atributos
   private No inicio;
   private No fim;
    
   private int tamanho;
    
    //construtor
    public Lista () {
        this.inicio = null;
        this.fim = null;
        
        this.tamanho = 0;
    }
    
    
    //metodos
    public boolean isEmpty() {
        if ((this.inicio == null) && (this.fim == null)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int length() {
        //vamos melhorar depois
        return this.tamanho;
    }
 
    public void inserePrimeiro(double valor) {
        if(isEmpty()) {
            No temp = new No();
            temp.setValor(valor);
            temp.setProx(null);
            
            this.inicio = temp;
            this.fim = temp;
            
            this.tamanho++;
        }
        else {
            System.out.println("Já existem elementos");
        }
    } 
    
 public void insereComeco(double valor) {
     if (isEmpty()) {
         inserePrimeiro(valor);
     }
     else {
         No temp = new No();
         temp.setValor(valor);
         temp.setProx(this.inicio);
         this.inicio = temp;
         
         this.tamanho++;
     }
 }    
 
 
 public void insereFinal(double valor) {
     if(isEmpty()) {
         inserePrimeiro(valor);
     }
     else {
         No temp = new No();
         temp.setValor(valor);
         temp.setProx(null);
         
         this.fim.setProx(temp);
         this.fim = temp;
         
         this.tamanho++;
     }
 }
 
 public void insereMeio(double valor, int pos) {
     if(isEmpty()) {
         inserePrimeiro(valor);
     }
     else if(pos == 0) {
         insereComeco(valor);
     }
     else if (pos <= 0 || pos > length()) {
         System.out.println("Posição errada");
     }
     else if (pos == length()) {
         insereFinal(valor);
     }
     else {
         
        No temp = new No();
        temp.setValor(valor);
         
        No ant = this.inicio;
        No seg = ant.getProx();
         
        for (int i = 0; i < (pos -1); i++) {
            ant = seg;
            seg = ant.getProx();
        }
        ant.setProx(temp);
        temp.setProx(seg);
        
        this.tamanho++;
     }
       
 }
 
 
 public void imprime() {
     if(isEmpty()) {
         System.out.println("lista vazia");
     }
     else {
         No temp = this.inicio;
              
        do {
            System.out.println("Elemento = " + temp.getValor());
            temp = temp.getProx();         
        } while (temp != null);
     }
     
 }
 
 
 public double removeUltimo() {
     if (isEmpty()) {
         System.out.println("Lista Vazia");
         return 0;
     }
     else if (length() > 1) {
        System.out.println("Existem varios elementos");
        return 0;
    }
    else {
         No temp = this.inicio;
         double valor = temp.getValor();
         
         this.inicio = null;
         this.fim = null;
         this.tamanho = 0;
         temp = null;   
         System.gc();
         
         this.tamanho--;
         
         return valor;
     }
 }
 
 
 public double removeMeio(int pos) {
     if (isEmpty()) {
         System.out.println("Lista Vazia");
         return 0;
     }
     else if (pos == 0) {
         return removeComeco();
     }
     else if (pos == length()-1) {
         return removeFinal();
     }
     else if(length() == 1) {
         return removeUltimo();
     }
     else if (pos < 0 || pos > (length()-1)) {
         System.out.println("posição invalida");
         return 0;
     }
     else {
        
         No ant = this.inicio;
         No prox = ant.getProx();
         
         for (int i = 1; i < pos; i++) {
             ant = prox;
             prox = ant.getProx();
         }
         
         ant.setProx(prox.getProx());
         double valor = prox.getValor();
         
         prox = null;
         System.gc();
         this.tamanho--;
         
         return valor;
     }
 }
 
 
 public double removeComeco() {
     if (isEmpty()) {
         System.out.println("Lista vazia");
         return 0;
     }
     else if (length() == 1) {
         return removeUltimo();
     }
     else {
         No temp = this.inicio;
         
         this.inicio = temp.getProx();
         this.tamanho--;
         
         double valor = temp.getValor();
         temp = null;
         System.gc();
         
         return valor;
     }
 }
 
 
 public double removeFinal() {
     if (isEmpty()) {
         System.out.println("Lista vazia");
         return 0;
     }
     else if (length() == 1) {
         return removeUltimo();
     }
     else {
         
         No ant = this.inicio;
         No prox = ant.getProx();
         
         /*
         for (int i = 1; i < length(); i++) {
             ant = prox;
             prox = ant.getProx();
         }
         */
         
         while(prox.getProx() != null) {
             ant = prox;
             prox = ant.getProx();
         }
         
         double valor = prox.getValor();
         this.fim = ant;
         ant.setProx(null);
         this.tamanho--;
         
         prox = null;
         System.gc();
         
         return valor;
    }   
 }
    
 public void destroy() {
     
     int tam = length();
     for (int i =0; i < tam; i++) {
         removeComeco();
     }
     this.tamanho = 0;
     this.inicio = null;
     this.fim = null;
 }   
 
 
 
 public double leElemento(int pos) {
     if (isEmpty()) {
         System.out.println("Lista vazia");
         return 0;
     }
     else if (pos == 0) {
         return this.inicio.getValor();
     }
     else if (pos < 0 || pos > (length()-1)) {
         System.out.println("posição invalida");
         return 0;
     }
     else {
         No ant = this.inicio;
         No prox = ant.getProx();
         
         for (int i = 1; i < pos; i++) {
             ant = prox;
             prox = ant.getProx();
         }
         
         return prox.getValor();
     }
     
 }
 
 
 public void atualizaElemento2(int pos, double valor) {
     if (isEmpty()) {
         System.out.println("Lista vazia");
     }
     else if (pos == 0) {
         this.inicio.setValor(valor);
     }
     else if (pos < 0 || pos > (length()-1)) {
         System.out.println("posição invalida");
     }
     else {
         No ant = this.inicio;
         No prox = ant.getProx();
         
         for (int i = 1; i < pos; i++) {
             ant = prox;
             prox = ant.getProx();
         }
         
         prox.setValor(valor);
     }
     
 }
 
 
 
 
 
 
 
}
 
