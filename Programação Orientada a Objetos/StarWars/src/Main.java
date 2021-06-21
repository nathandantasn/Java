import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Padawan> padawans = new ArrayList<>();
		
		Padawan luke = new Padawan("Luke Skywalker");
		Padawan obiWan = new Jedi("Obi-Wan Kenobi");
		Padawan fulano = new Padawan("Luke Fulano");
		Padawan ciclano = new Padawan("Luke Ciclano");
		Padawan beltrano = new Jedi("Obi-Wan Beltrano");

		padawans.add(luke);
		padawans.add(obiWan);
		padawans.add(fulano);
		padawans.add(ciclano);
		padawans.add(beltrano);

		for (int i=0; i < padawans.size(); i++){
			
			padawans.get(i).usarForca();
			
			if (padawans.get(i) instanceof Jedi){
				Jedi j = (Jedi) padawans.get(i);
				j.convencer();
			}
		}

	}

}
