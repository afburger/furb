package exemplos.unidadeI.pilha;

public class PilhaEstatica implements Pilha {

	private int limite;
	private int tamanho;
	private int[] info;
	
	public PilhaEstatica(int limite) {
		info = new int[limite];
		this.limite = limite;
		this.tamanho = 0;
	}
	
	@Override
	public void push(int valor) {
		if (tamanho == limite) {
			throw new RuntimeException("Capacidade da pilha esgotada");
		}
		info[tamanho] = valor;
		tamanho++;
	}
	
	@Override
	public int peek() {
		if (estaVazia()) {
			throw new RuntimeException("Pilha está vazia");
		}
		return info[tamanho-1];
	}
	
	@Override
	public int pop() {
		int valor = peek();
		tamanho--;
		return valor;
	}
	
	@Override
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	@Override
	public void liberar() {
		info = new int[limite];
		tamanho = 0;
	}
	
	@Override
	public String toString() {
		String resultado = "";

		for (int i = tamanho-1; i >= 0; i--) {
			resultado += info[i];
			if (i > 0) {
				resultado = resultado + ",";
			}
		}

		return resultado;
	}
}
