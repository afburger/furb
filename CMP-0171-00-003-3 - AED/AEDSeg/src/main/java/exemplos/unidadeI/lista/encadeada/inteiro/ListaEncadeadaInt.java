package exemplos.unidadeI.lista.encadeada.inteiro;

public class ListaEncadeadaInt {

	private NoListaInt primeiro;

	/**
	 * Getter da variável primeiro
	 * 
	 * @return Primeiro valor da lista
	 */
	public NoListaInt getPrimeiro() {
		return this.primeiro;
	}

	/**
	 * Insere um novo valor na lista
	 * 
	 * @param info Valor a ser inserido na lista
	 */
	public void inserir(int info) {
		NoListaInt novo = new NoListaInt();
		novo.setInfo(info);
		novo.setProximo(getPrimeiro());
		this.primeiro = novo;
	}

	/**
	 * Avalia se a lista está vazia ou não
	 * 
	 * @return true se a lista estiver vazia
	 */
	public boolean estaVazia() {
		return this.primeiro == null;
	}

	/**
	 * Busca um elemento na lista encadeada
	 * 
	 * @param info Dado a ser localizado
	 * @return Elemento contendo o dado localizado
	 */
	public NoListaInt buscar(int info) {
		NoListaInt atual = getPrimeiro();
		while (atual != null) {
			if (atual.getInfo() == info) {
				return atual;
			}
			atual = atual.getProximo();
		}
		return null;
	}



	/**
	 * Retira um dado da lista encadeada
	 * 
	 * @param valor passado como parâmetro para ser retirado da lista encadeada
	 */
	public void retirar(int valor) {
		NoListaInt anterior = null;
		NoListaInt atual = getPrimeiro();

		while (atual != null && atual.getInfo() != valor) {
			anterior = atual;
			atual = atual.getProximo();
		}

		if (atual != null) {
			if (atual == primeiro) {
				primeiro = atual.getProximo();
			} else {
				anterior.setProximo(atual.getProximo());
			}
		}
	}

	/**
	 * Calcula a quantidade de nós da lista
	 * 
	 * @return quantidade de elementos da lista
	 */
	public int obterComprimento() {
		int qtdeNos = 0;

		NoListaInt atual = getPrimeiro();

		while (atual != null) {
			qtdeNos++;
			atual = atual.getProximo();
		}

		return qtdeNos;
	}

	public NoListaInt obterNo(int posicao) {
		if ((posicao < 0) || (posicao > obterComprimento()-1)) {
			throw new IndexOutOfBoundsException("Indice não existe");
		}

		NoListaInt p = getPrimeiro();
		for (int i=0; i<posicao; i++) {
			p = p.getProximo();
		}

		return p;
	}

	public void exibir() {
		NoListaInt atual = primeiro;
		while (atual != null) {
			System.out.println(atual.getInfo());
			atual = atual.getProximo();
		}
	}
	
	public void liberar() {
		NoListaInt atual = primeiro;
		while (atual!=null) {
			NoListaInt proximo = atual.getProximo();
			atual.setProximo(null);

			atual = proximo;
		}
		primeiro = null;
	}
	
	@Override
	public String toString() {
		String resultado = "";
		NoListaInt atual = getPrimeiro();

		while (atual != null) {
			if (atual != getPrimeiro()) {
				resultado += ",";
			}

			resultado += atual.getInfo();
			atual = atual.getProximo();
		}

		return resultado;
	}

}
