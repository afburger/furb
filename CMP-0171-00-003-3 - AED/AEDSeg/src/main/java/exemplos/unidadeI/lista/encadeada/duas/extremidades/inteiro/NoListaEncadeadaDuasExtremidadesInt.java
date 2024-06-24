package exemplos.unidadeI.lista.encadeada.duas.extremidades.inteiro;

public class NoListaEncadeadaDuasExtremidadesInt {

	private int info;
	private NoListaEncadeadaDuasExtremidadesInt proximo;

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public NoListaEncadeadaDuasExtremidadesInt getProximo() {
		return proximo;
	}

	public void setProximo(NoListaEncadeadaDuasExtremidadesInt proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String toString() {
		return String.valueOf(info);
	}
}
