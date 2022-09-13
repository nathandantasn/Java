import ClienteUsuario.Pessoa;
import ClienteUsuario.Cliente;
import Dado.GerenciaCliente;

public class Main {

    public static void main(String[] args) {

        GerenciaCliente clientes = new GerenciaCliente();

        clientes.cadastrarCliente("Nathan Dantas Nascimento", 23, 6000);

        System.out.println(clientes.consultarCliente("Nascimento"));
        System.out.println(clientes.consultarCliente("Lucas"));
        
    }
    
}
