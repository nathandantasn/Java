import java.util.ArrayList;

public class Departamento {

	private ArrayList <Funcionario> funcionarios;
	
	public Departamento () {
		this.funcionarios = new ArrayList<>();
	}
	
	
	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public void aumentarSalarioEquipe(double percentual) {
		for (int i =0; i < this.funcionarios.size(); i++) {
			Funcionario f = this.funcionarios.get(i);
			f.aumentarSalario(percentual);
		}
	}
	
	public void imprimir() {
		for (int i =0; i < this.funcionarios.size(); i++) {
			Funcionario f = this.funcionarios.get(i);
			System.out.print(f.toString()+ "\n");
		}
	}
}
