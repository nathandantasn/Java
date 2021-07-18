package FuncoesJava;

public class FuncaoAltaOrdem {
    public static void main(String[]args){
        Calculo soma = (a,b) -> a+b;
        Calculo subtrai = (a,b) -> a-b;
        Calculo multiplica = (a,b) -> a*b;
        Calculo divide = (a,b) -> a/b;
        System.out.println(executarOperacao(soma, 1, 3));
        System.out.println(executarOperacao(subtrai, 4, 3));
        System.out.println(executarOperacao(divide, 4, 2));
        System.out.println(executarOperacao(multiplica, 7, 3));

    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}
interface Calculo {
    public int calcular(int a, int b);
}
