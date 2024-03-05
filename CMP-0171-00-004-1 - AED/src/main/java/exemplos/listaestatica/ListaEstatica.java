package exemplos.listaestatica;

public class ListaEstatica {

	private int[] info;
	private int tamanho;
	
	public ListaEstatica() {
		info = new int[10];
		tamanho = 0;
	}
	
	public void inserir(int valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}
	
	private void redimensionar() {
		int[] novoInfo = new int[info.length + 10];
		
		for (int indice = 0; indice < info.length; indice++) {
			novoInfo[indice] = info[indice];
		}
		
		info = novoInfo;
	}
	
	public int buscar(int valor) {
		for (int i = 0; i < tamanho; i++) {
			if (valor == info[i]) {
				return i;
			}
		}
		return -1;
	}
	
	
	public void retirar(int valor) {
		int posicao = buscar(valor);
		
		if (posicao > -1) {
			for (int i=posicao; i<=tamanho; i++) {
				info[i] = info[i+1];
			}
			
			tamanho--;
		}
	}
}
