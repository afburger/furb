package exemplos.classesgenericas;

public class UsaVeiculoPessoa<V extends Veiculo, P> {

	private V veiculo;
	
	private P proprietario;

	public V getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(V veiculo) {
		this.veiculo = veiculo;
	}

	public P getProprietario() {
		return proprietario;
	}

	public void setProprietario(P proprietario) {
		this.proprietario = proprietario;
	}
	
	public int getCodigoVeiculo() {
		return veiculo.getCodigo();
	}
	
	
}
