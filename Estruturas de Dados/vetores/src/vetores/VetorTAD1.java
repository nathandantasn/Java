package vetores;

import entities.TADvetor;

public class VetorTAD1 {

	public static void main(String[] args) {

		TADvetor dados = new TADvetor(10);
		
		dados.escreveValor(10, 2);
		dados.escreveValor(5, 9);
		
		String msg = dados.toString();
		System.out.println(msg);
	}

}
