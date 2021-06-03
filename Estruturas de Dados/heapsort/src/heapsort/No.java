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
public class No {
     //atributos
    private double valor;
    private No prox;
        
    //construtor
    public No() {  };
        
    //metodos
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public void setProx(No prox) {
        this.prox = prox;
    }
    
    public No getProx() {
        return this.prox;
    }
   
}
