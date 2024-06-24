package exemplos.unidadeI.fila;

public class FilaVetor implements Fila {

	int[] info;
	int limite;
	int tamanho;
	int inicio;
	
	public FilaVetor(int limite) {
		info = new int[limite];
		tamanho = 0;
		inicio = 0;
		this.limite = limite;
	}
	
	@Override
	public void inserir(int valor) {
		if (tamanho == limite) {
			throw new RuntimeException("Fila está cheia");
		}
		
		int posicaoInserir = (inicio + tamanho) % limite;
		info[posicaoInserir] = valor;
		tamanho++;
	}

	@Override
	public boolean estaVazia() {
		return tamanho == 0;
	}

	@Override
	public int peek() {
		if (estaVazia()) {
			throw new RuntimeException("Fila está vazia");
		}
		return info[inicio];
		
		
	}

	@Override
	public int retirar() {
		int valor = peek();
		info[inicio] = 0;
		
		inicio = (inicio + 1) % limite;
		tamanho--;
		
		return valor;
		
	}

	@Override
	public void liberar() {
		info = new int[limite];
		tamanho = 0;
		inicio = 0;
	}

	@Override
	public String toString() {
		String retorno = "";

		int indice = inicio;
		for (int i = 0; i < tamanho; i++) {
			if (i > 0) {
				retorno += ",";
			}
			retorno = retorno + info[indice];
			indice = (indice + 1) % limite;
		}

		return retorno;
	}
	
	public int getInicio() {
		return inicio;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public int getLimite() {
		return limite;
	}
	
	// Método criado só pra auxiliar na visualização
		public String imprimirVetor() {
			String vetor = "";
			
			for (int i = 0; i < info.length; i++) {
				int t = info[i];
				vetor += t + ", ";
			}
			
			return vetor;
		}
}
