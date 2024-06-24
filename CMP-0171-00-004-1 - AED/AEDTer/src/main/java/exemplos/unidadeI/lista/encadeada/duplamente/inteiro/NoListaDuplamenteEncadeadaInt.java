package exemplos.unidadeI.lista.encadeada.duplamente.inteiro;

public class NoListaDuplamenteEncadeadaInt {
	
	private int info;
	private NoListaDuplamenteEncadeadaInt proximo;
	private NoListaDuplamenteEncadeadaInt anterior;
	
	public int getInfo() {
		return info;
	}
	
	public void setInfo(int info) {
		this.info = info;
	}
	
	public NoListaDuplamenteEncadeadaInt getProximo() {
		return proximo;
	}
	
	public void setProximo(NoListaDuplamenteEncadeadaInt proximo) {
		this.proximo = proximo;
	}
	
	public NoListaDuplamenteEncadeadaInt getAnterior() {
		return anterior;
	}
	
	public void setAnterior(NoListaDuplamenteEncadeadaInt anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String toString() {
		return String.valueOf(info);
	}
}
