
public class Main {

	public static void main(String[] args) {
		Proprietario dono = new Proprietario();
		dono.setNome("Nathan");
		dono.setTelefone(961934058);
		
		Cachorro dog = new Cachorro("Frederico", 2016, dono );
		
		dog.setRaca("Yorkshire");
		dog.setCor("Cinza");
			
		System.out.println(dog.toString());

	}

}
