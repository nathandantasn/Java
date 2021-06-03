package vetores;

public class Vetor1 {

	public static void main(String[] args) {

		int pares[] = new int[10];
	    //int i = 0;
		//int numeroPar = 0;

		//while (numeroPar < 10) {
		//	if (i % 2 == 0) {
				//pares[numeroPar] = i;
			//	numeroPar++;
			//}
			//i++;
	//	}
		
		for (int a=0; a<10; a++) {
			pares[a] = 2*a;
			System.out.println(pares[a]);
		}
		
		//for (int n=0; n <10; n++) {
			//System.out.println(pares[n]);
	//	}
	}
}
