package util;

public class Resposta {
    public final int OK = 0;
    public final int OPERADOR_INVALIDO = 1;
    public final int DIVISAO_POR_0 = 2;
    private int status;
    private double valor;

    public int getStatus() {
        return status;
    }

    public double getValor() {
        return valor;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
