package ClienteUsuario;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = "Nome não cadastrado";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + 
        "\nIdade: " + getIdade() + "\n";
    }
    
}
