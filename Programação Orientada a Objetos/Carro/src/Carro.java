public class Carro {
    private int quantidadeDePessoas;
    private String marca;
    private String modelo;
    private int ano;
    private int pessoasNoCarro =0;

    public Carro (final String marca, final String modelo, final int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void setModelo(final String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(final String marca){
        this.marca = marca;
    }

    public void setQuantidadeDePessoas(final int quantidadeDePessoas){
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    public void removerPessoa(){
        if(this.pessoasNoCarro > 0){
            this.pessoasNoCarro--;
        } else {
            System.out.println("A quantidade de pessoas no carro é 0");
        }
    }

    public void adicionarPessoa(final int quantidadeDePessoas){
        if (this.pessoasNoCarro + quantidadeDePessoas <= this.quantidadeDePessoas){
            this.pessoasNoCarro += quantidadeDePessoas;
        } else {
            System.out.println("Não há espaco no carro");
        }
    }

    public String imprimirDados(){
        return "Marca: " + this.marca + "\n"
                + "Modelo: " + this.modelo + "\n"
                + "Ano: " + this.ano + "\n"
                + "Suporta " + this.quantidadeDePessoas + " pessoas\n"
                + "Quantidade de pessoas no carro: " + this.pessoasNoCarro;
    }
}
