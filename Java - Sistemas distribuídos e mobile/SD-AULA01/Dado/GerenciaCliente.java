package Dado;

import java.util.ArrayList;

import ClienteUsuario.Cliente;

public class GerenciaCliente {

   private ArrayList<Cliente>listaClientes;

   public GerenciaCliente () {
       listaClientes = new ArrayList<>();
   }

   public void cadastrarCliente(String nome, int idade, float saldo){
        Cliente cliente = new Cliente (nome, idade, saldo);
        listaClientes.add(cliente);
   }
    
   public String consultarCliente(String nome){
        for (Cliente cliente : listaClientes){
            if (cliente.getNome().contains(nome)){
                return cliente.toString();
            }
        }    
    return "Cliente não encontrado\n";
   }


}
