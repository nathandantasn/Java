public class Aula {
    public static void main(String [] args){
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr. "+ valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Nathan"));
    }

    @FunctionalInterface
    interface Funcao {
        String gerar(String valor);
    }
}

// como declarar uma Lambda: interfaceFuncional nomeVariavel = parametro -> logica
