
public abstract class DogPrototype {
	
	protected String nome;
	protected String pelagem;
	protected String porte;


	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPelagem() {
		return pelagem;
	}
	
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	
	public abstract String infoDog();
	
	public abstract DogPrototype clonar();

}
