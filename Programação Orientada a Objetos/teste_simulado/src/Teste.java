
public class Teste {
	
	private static void testarLampada() {
        int totalTestes = 8;
        int testesCorretos = 0;
        System.out.println("### Lampada\n");
        Lampada l = new Lampada(109);
        testesCorretos += rodarTeste("Valores iniciais", !l.getEstado());
        l.setEstado(true);
        testesCorretos += rodarTeste("Lâmpada liga", l.getEstado());
        l.setEstado(false);
        testesCorretos += rodarTeste("Lâmpada desliga", !l.getEstado());

        l.setEstado(true);
        for (int i = 0; i < 3; i++) {
            l.setEstado(false);
            l.setEstado(true);
        }
        testesCorretos += rodarTeste("Lâmpada não queima antes da hora", l.getEstado());
        l.setEstado(false);
        l.setEstado(true);
        testesCorretos += rodarTeste("Lâmpada queima na hora certa", !l.getEstado());

        l = new Lampada(10);
        l.setEstado(true);
        testesCorretos += rodarTeste("Lâmpada de 10W queima de primeira", !l.getEstado());

        l = new Lampada(20);
        for (int i = 0; i < 10; i++) {
            l.setEstado(true);
        }
        testesCorretos += rodarTeste("Ligar a lâmpada repetidamente não conta como mudança de estado", l.getEstado());


        l = new Lampada(40);
        l.setEstado(true);
        for (int i = 0; i < 10; i++) {
            l.setEstado(false);
        }
        l.setEstado(true);
        testesCorretos += rodarTeste("Desligar a lâmpada repetidamente não conta como mudança de estado", l.getEstado());

        mostrarResultado(testesCorretos, totalTestes);
    }

    private static void testarProduto() {
        int totalTestes = 17;
        int testesCorretos = 0;
        System.out.println("### Produto\n");
        Produto p = new Produto(4, 100);
        testesCorretos += rodarTeste("Estoque é inicializado corretamente", p.getEstoque() == 4);
        testesCorretos += rodarTeste("Preço é inicializado corretamente", p.getPreco() == 100);
        testesCorretos += rodarTeste("Receita é inicializada corretamente", p.getReceita() == 0);

        p.ajustarPreco(-10);
        testesCorretos += rodarTeste("Preço pode ser reduzido", p.getPreco() == 90);

        p.ajustarPreco(10);
        testesCorretos += rodarTeste("Preço pode ser aumentado", p.getPreco() == 99);

        double troco = p.tentarCompra(150);
        testesCorretos += rodarTeste("Troco é calculado corretamente", troco == 51);
        testesCorretos += rodarTeste("Produto é descontado do estoque", p.getEstoque() == 3);
        testesCorretos += rodarTeste("Receita é calculada corretamente", p.getReceita() == 99);

        troco = p.tentarCompra(50);
        testesCorretos += rodarTeste("O valor precisa ser maior que o preço atual", troco == 50);
        testesCorretos += rodarTeste("Produto não é descontado do estoque", p.getEstoque() == 3);
        testesCorretos += rodarTeste("Receita é calculada corretamente", p.getReceita() == 99);

        for (int i = 0; i < 2; i++) {
            p.tentarCompra(100);
        }

        troco = p.tentarCompra(150);
        testesCorretos += rodarTeste("Posso comprar o último produto do estoque", troco == 51);
        testesCorretos += rodarTeste("Produto é descontado do estoque", p.getEstoque() == 0);
        testesCorretos += rodarTeste("Receita é calculada corretamente", p.getReceita() == 99 * 4);

        troco = p.tentarCompra(150);
        testesCorretos += rodarTeste("Não posso comprar se não houver estoque", troco == 150);
        testesCorretos += rodarTeste("Produto não é descontado do estoque se estiver vazio", p.getEstoque() == 0);
        testesCorretos += rodarTeste("Receita é calculada corretamente", p.getReceita() == 99 * 4);

        mostrarResultado(testesCorretos, totalTestes);
    }

    private static int rodarTeste(String titulo, boolean resultado) {
        System.out.println("- " + (resultado ? "OK" : "X ") + "\t" + titulo);
        return resultado ? 1 : 0;
    }

    private static void mostrarResultado(int testesCorretos, int totalTestes) {
        System.out.println("\n> Testes corretos: " + testesCorretos + "/" + totalTestes + " (" + (100 * testesCorretos / totalTestes) + "%)");
        if (testesCorretos == totalTestes) {
            System.out.println("> Tudo certo!!!");
        } else {
            System.out.println("> Ainda falta um pouquinho, mas você consegue!");
        }
    }

    public static void main(String[] args) {
        testarLampada();
        System.out.println();
        testarProduto();
    }
}
