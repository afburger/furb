package provas.prova01;

public class NoListaDuplamenteEncadeada <T> {
	
	private T info;
	private NoListaDuplamenteEncadeada<T> proximo;
	private NoListaDuplamenteEncadeada<T> anterior;
	
	public T getInfo() {
		return info;
	}
	
	public void setInfo(T info) {
		this.info = info;
	}
	
	public NoListaDuplamenteEncadeada<T> getProximo() {
		return proximo;
	}
	
	public void setProximo(NoListaDuplamenteEncadeada<T> proximo) {
		this.proximo = proximo;
	}
	
	public NoListaDuplamenteEncadeada<T> getAnterior() {
		return anterior;
	}
	
	public void setAnterior(NoListaDuplamenteEncadeada<T> anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String toString() {
		return info.toString();
	}
}
