package ClienteUsuario;

public class Cliente extends Pessoa{
    
    private float saldo;

    public Cliente(String nome, int idade, float saldo){
        super(nome, idade);
        this.saldo = saldo;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float saldoNovo){
        this.saldo = saldoNovo;
    }

    @Override
    public String toString() {
        return super.toString() +
        "Saldo: R$ " + getSaldo() + "\n";
    }
}
