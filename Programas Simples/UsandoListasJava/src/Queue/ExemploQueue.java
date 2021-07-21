package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main (String[]args){
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll(); // retorna e remove o primeiro elemento da fila

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        //filaBanco.clear();

        String primeiroCliente = filaBanco.peek(); // retorna o primeiro elemento da fila sem remover

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        //filaBanco.clear(); // limpar a lista

        String primeiroClienteOuErro = filaBanco.element(); // retorna o primeiro elemento da fila sem remover e se estiver vazia, retorna um NoSuchElementException

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        for (String client: filaBanco){
            System.out.println("Usando for ----> "+ client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("Usando while/iterator ----> " + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");

        System.out.println(filaBanco);

    }
}
