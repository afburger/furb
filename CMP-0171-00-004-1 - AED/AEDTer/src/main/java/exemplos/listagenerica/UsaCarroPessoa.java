package exemplos.listagenerica;

public class UsaCarroPessoa<V extends Veiculo, P> {

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
	
	public void imprimeAnoVeiculo() {
		System.out.println(veiculo.getAno());
	}
}
