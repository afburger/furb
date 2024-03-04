package listaestatica;

public class ListaEstatica {
	
	// Define a lista que vai armazenar os valores
	private int[] info;
	// Variável que controla o tamanho da lista.
	private int tamanho;
	
	// Inicia a lista
	public ListaEstatica() {
		info = new int[10];
		tamanho = 0;
	}

	// Insere um valor na lista, verificando se precisa redimensionar ou não.
	public void inserir(int valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}
	
	// Realiza o redimensionamento da lista, sempre incrementando 10 posições
	private void redimensionar() {
		int[] novaInfo = new int[info.length + 10];

		for (int i=0; i<info.length; i++) {
			novaInfo[i] = info[i];
		}
		
		info = novaInfo;
	}
	
	// Realiza a busca de um valor, e retorna a posição do mesmo.
	public int buscar(int valor) {
		for (int i=0; i<tamanho; i++) {
			if (info[i] == valor) {
				return i;
			}
		}
		
		return -1;
	}
	
	// Retira um elemento da lista
	public void retirar(int valor) {
		int posicao = buscar(valor);
		
		if (posicao > -1) {
			for (int i=posicao; i<tamanho-1; i++) {
				info[i] = info[i+1];
			}
			
			tamanho--;
		}
	}
	
	// Exibe os elementos da lista
	public void exibir() {
		for (int i=0; i<tamanho; i++) {
			System.out.println(info[i]);
		}
	}
	
	// Informa se a lista está vazia ou não.
	public boolean estaVazia() {
		return tamanho==0;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void liberar() {
		info = new int[10];
		tamanho = 0;
	}
	
	@Override
	public String toString() {
		String resultado = "";

		for (int i = 0; i < tamanho; i++) {
			if (i > 0) {
				resultado += ",";
			}
			resultado += info[i];
		}

		return resultado;
	}
}
