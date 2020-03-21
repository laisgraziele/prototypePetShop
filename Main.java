
public class Main {

	public static void main(String[] args) {
		
		ShihTzu raca1 = new ShihTzu();
		DogPrototype cadastroRaca = raca1.clonar();
		cadastroRaca.setPelagem("longa");
		cadastroRaca.setPorte("pequeno");
		cadastroRaca.infoDog();
		
		
		
		
		Pug raca2 = new Pug();
		DogPrototype cadastroRaca2 = raca2.clonar();
		cadastroRaca2.setPelagem("curta");
		cadastroRaca2.setPorte("pequeno");
		cadastroRaca2.infoDog();
	}
}
