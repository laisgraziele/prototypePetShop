
public class ShihTzu extends DogPrototype{


	protected ShihTzu( ShihTzu cachorroShihtzu) {
		
		this.nome = "Shih Tzu";
		this.pelagem = cachorroShihtzu.getPelagem();
		this.porte = cachorroShihtzu.getPorte();
		
	}
	
	public ShihTzu() {
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
		
		return new ShihTzu(this);
	}
	
	

}
