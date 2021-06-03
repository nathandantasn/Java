
public class Main {

	public static void main(String[] args) {
		
		Cartao cartao = new Cartao(21460929, 216653, 2020);
		cartao.setNomeCurso("Sistemas de informação");
		cartao.setNomeUniversidade("Universidade Anhembi Morumbi");
	
		Aluno aluno = new Aluno("Nathan Dantas", 22, cartao);
		
		aluno.cartao.setPeriodo("Diurno");
		
		System.out.println(aluno.toString());

	}

}
