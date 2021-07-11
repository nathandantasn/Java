public class Main {

    public static void main (String[]args){

        Carro golf = new Carro();
        golf.setMarca("Volkswagem");
        golf.setNome("Golf");
        golf.setQuantidadeDePessoas(5);
        golf.adicionarPessoa(6);
        golf.adicionarPessoa(5);
        golf.removerPessoa();
        System.out.println(golf.imprimirDados());

    }
}
