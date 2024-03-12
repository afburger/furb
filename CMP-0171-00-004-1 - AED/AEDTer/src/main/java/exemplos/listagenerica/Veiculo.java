package exemplos.listagenerica;

public class Veiculo {

	private int ano;
	private String marca;
	private String modelo;

	public Veiculo(int ano, String marca, String modelo) {
		super();
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return marca + "-" + modelo + "-" + ano;
	}
}
