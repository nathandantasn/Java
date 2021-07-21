package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[]args){
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa"); // atualizar a poisção com Larissa

        System.out.println(nomes);

        Collections.sort(nomes); // fazendo ordenação em collections.sort()

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4); // removendo posição

        System.out.println(nomes);

        nomes.remove("Wesley"); // remove o objeto

        System.out.println(nomes);

        String nome = nomes.get(1); // retorna o elemento na posição

        System.out.println(nome);

        int tamanho = nomes.size(); // retorna o tamanho da lista

        System.out.println(tamanho);




    }
}
