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
public class ordenacao2 {
    
    public static void heapSort2(Lista a){
	int count = a.length();
 
	//first place a in max-heap order
	heapify2(a, count);
 
	int end = count - 1;
	while(end > 0){
		double tmp = a.leElemento(end);  
		atualizaElemento(end, a.leElemento(0),a);
		atualizaElemento(0, tmp,a);
		siftDown2(a, 0, end - 1);
		end--;
	}
}
    
    
    
    
    public static void heapify2(Lista a, int count){
	int start = (count - 2) / 2; 
 
	while(start >= 0){
		siftDown2(a, start, count - 1);
		start--;
	}
}
    
    
    public static void siftDown2(Lista a, int start, int end){
        int root = start;

        while((root * 2 + 1) <= end){      
                int child = root * 2 + 1;           
                if(child + 1 <= end && a.leElemento(child) < a.leElemento(child + 1))
                        child = child + 1;          
                if(a.leElemento(root) < a.leElemento(child)){     
                        double tmp = a.leElemento(root);
                        atualizaElemento(root, a.leElemento(child),a);
                        atualizaElemento(child, tmp,a);
                        root = child;                
                }else
                        return;
        }
    }
    
    
    public static void atualizaElemento(int pos, double valor, Lista a) {
     if (a.isEmpty()) {
         System.out.println("Lista vazia");
     }
     else if (pos == 0) {
         a.removeComeco();
         a.insereComeco(valor);  
     }
     else if (pos < 0 || pos > (a.length()-1)) {
         System.out.println("posição invalida");
     }
     else {
         a.removeMeio(pos);
         a.insereMeio(valor, pos);   
     }
 }
    
}
