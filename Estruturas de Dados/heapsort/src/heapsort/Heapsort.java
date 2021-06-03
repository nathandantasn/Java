/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

import java.util.Scanner;

/**
 *
 * @author BrunoMulina
 */
public class Heapsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        int[] vetor = {1, 4, 8, 2, 5, 1, 0, 3, 7, 3, 10, 50, 0, 77, -8};
        
        
        Lista lista = new Lista();
        for (int i = 0; i < vetor.length; i++) {
            lista.insereFinal(vetor[i]);
        }
        lista.imprime();
        
        
        //ordenacao.heapSort(vetor);
        //ordenacao2.heapSort2(lista);
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        lista.imprime();
        
        for(int i =0; i < lista.length();i++) {
			for(int j = 0; j < lista.length()-1; j++) {
				if(lista.leElemento(j) > lista.leElemento(j+1)) {
					/*double v1 = lista.removeMeio(j);
					double v2 = lista.removeMeio(j);
					lista.insereMeio(v1, j);
					lista.insereMeio(v2, j);*/
					double v1 = lista.removeMeio(j+1);
					lista.insereMeio(v1,j);
				}
			}
		}
		System.out.println("||===============||");
		lista.imprime();
		
		String senha1 = "A0001";
		String senha2 = "A0002";
		
		if (senha1.compareTo(senha2)>0) {
			System.out.println("Senha maior");
		} else {
			System.out.println("Senha maior");
		}
        
        
     }
    
}
