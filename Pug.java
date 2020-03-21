
public class Pug extends DogPrototype{
	
protected Pug ( Pug dogPug) {
		
		this.nome = "Pug";
		this.pelagem = dogPug.getPelagem();
		this.porte = dogPug.getPorte();
	}
	
	public Pug() {
		pelagem = "";
		porte = "";	
	}
	
	
	@Override
	public String infoDog() {
		System.out.println("A raça " + this.nome + " é de porte " + getPorte() + " e possui pelagem " + getPelagem() + " :)");
		return null;
	}

	@Override
	public DogPrototype clonar() {
		
		return new Pug (this);
	}
	
	

}
