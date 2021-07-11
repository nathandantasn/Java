public class Main {

    public static void main (String[]args){

        Carro golf = new Carro("Volkswagem", "Golf", 2019);
        golf.setQuantidadeDePessoas(5);
        golf.adicionarPessoa(6);
        golf.adicionarPessoa(5);
        golf.removerPessoa();
        System.out.println(golf.imprimirDados());

    }
}
