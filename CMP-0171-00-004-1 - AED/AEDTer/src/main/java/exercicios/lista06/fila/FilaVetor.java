package exercicios.lista06.fila;

public class FilaVetor<T> implements Fila<T> {

	private T[] info;
	private int limite;
	private int tamanho;
	private int inicio;

	
	/**
	 * Cria uma fila com determinada capacidade de armazenamento
	 * 
	 * @param limite Quantidade m�xima de dados que poder�o ser enfileirados
	 */
	public FilaVetor(int limite) {
		info = (T[]) new Object[limite];
		tamanho = 0;
		inicio = 0;
		this.limite = limite;
	}

	public int getLimite() {
		return limite;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	public int getInicio() {
		return inicio;
	}
	
	/**
	 * Avalia se a fila est� vazia
	 */
	public boolean estaVazia() {
		return (tamanho == 0);
	}

	/**
	 * Retorna o elemento que est� no in�cio da fila
	 * 
	 * @return dado que est� no in�cio da fila
	 */
	public T peek() {
		if (estaVazia()) {
			throw new FilaVaziaException();
		}
		return info[inicio];
	}

	/**
	 * Insere um novo dado na fila
	 * 
	 * @param valor Dado a ser enfileirado
	 */
	@Override
	public void inserir(T valor) {
		if (tamanho == limite) {
			throw new FilaCheiaException();
		}

		int posicaoInserir;
		posicaoInserir = (inicio + tamanho) % limite;

		info[posicaoInserir] = valor;
		tamanho++;
	}

	/**
	 * Retira um elemento da fila
	 * 
	 * @return dado retirado
	 */
	public T retirar() {
		T backup = peek();
		info[inicio] = null;

		inicio = (inicio + 1) % limite;
		tamanho--;

		return backup;
	}

	/**
	 * Desinfilera todos os itens da fila
	 */
	public void liberar() {
		// uma forma de implementar
		info = (T[]) new Object[limite];
		tamanho = 0;
		inicio = 0;

		// 2a. implementa��o
//		while (!estaVazia()) {
//			retirar();
//		}

	}

	/**
	 * Retorna representa��o textual da fila, partindo do in�cio at� o final. Os
	 * dados s�o separados por v�rgula
	 * 
	 * @return conte�do da fila
	 */
	public String toString() {
		String retorno = "";

		int indice = inicio;
		for (int i = 0; i < tamanho; i++) {
			if (i > 0) {
				retorno += ",";
			}
			retorno = retorno + info[indice].toString();
			indice = (indice + 1) % limite;
		}

		return retorno;
	}

	/**
	 * Cria uma nova fila, tomando como base uma fila pr�-existente
	 * 
	 * @param f2 Fila a ser concatenada � atual
	 * @return
	 */
	public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
		FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite);

		int indice;

		indice = this.inicio;
		for (int i = 0; i < this.tamanho; i++) {
			if (this.info[indice] != null) {
				f3.inserir(this.info[indice]);
			}
			indice = (indice + 1) % this.limite;
		}

		// copia dados da fila atual
		indice = f2.inicio;
		for (int i = 0; i < f2.tamanho; i++) {
			if (this.info[indice] != null) {
				f3.inserir(f2.info[indice]);
			}
			indice = (indice + 1) % f2.limite;
		}

		return f3;
	}

	/**
	 * Cria uma nova fila, tomando como base uma fila pr�-existente
	 * 
	 * @param f2
	 * @return
	 */
	public FilaVetor<T> criarFilaConcatenada2(FilaVetor<T> f2) {
		FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite);

		copiarDadosFila(this, f3);
		copiarDadosFila(f2, f3);

		return f3;
	}

	/**
	 * Copia os dados de uma fila para outra.
	 * 
	 * @param origem  Fila de origem. Os dados ser�o copiados desta fila
	 * @param destino Fila de destino. Os dados ser�o copiados para esta fila
	 */
	private void copiarDadosFila(FilaVetor<T> origem, FilaVetor<T> destino) {
		int indice = origem.inicio;
		for (int i = 0; i < origem.tamanho; i++) {
			destino.inserir(this.info[indice]);
			indice = (indice + 1) % limite;
		}

	}
	
	// Método criado só pra auxiliar na visualização
	public String imprimirVetor() {
		String vetor = "";
		
		for (int i = 0; i < info.length; i++) {
			T t = info[i];
			if (t != null) {
				vetor += t.toString() + ", ";
			} else {
				vetor += "null" + ", ";
			}
		}
		
		return vetor;
	}

//	// Questão 02 da prova prática.
//	public void encolher() {
//		T[] novoVetor = (T[]) new Object[tamanho];
//		
//		int contator = 0;
//		int fim = inicio + tamanho;
//		for (int i = inicio; i < fim; i++) {
//			novoVetor[contator] = info[i];
//			contator++;
//		}
//		
//		this.info = novoVetor;
//		this.inicio = 0;
//		this.limite = tamanho; 
//	}
	
	public T[] getInfo() {
		return info;
	}
	
	public void encolher() {
		Object[] novoInfo = new Object[this.tamanho];

		for (int i = 0; i < this.tamanho; i++) {
			novoInfo[i] = info[(inicio + i) % limite];
		}

		this.info = (T[]) novoInfo;
		this.limite = tamanho;
		this.inicio = 0;
	}

}
