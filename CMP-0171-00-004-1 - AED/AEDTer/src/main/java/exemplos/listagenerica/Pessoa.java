package exemplos.listagenerica;

public class Pessoa {

	private String nome;
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}
