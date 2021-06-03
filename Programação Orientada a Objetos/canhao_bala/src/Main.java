
public class Main {

	public static void main(String[] args) {
	
		Bala bala = new Bala();
		bala.setPosicaoX(0);
		Canhao canhao = new Canhao(bala);
		
		canhao.disparar(15, 30);
		
		System.out.println(canhao.getAlcanceMaximo());
	}

}
