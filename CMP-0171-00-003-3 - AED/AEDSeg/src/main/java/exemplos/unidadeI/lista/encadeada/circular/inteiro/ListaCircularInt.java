package exemplos.unidadeI.lista.encadeada.circular.inteiro;

public class ListaCircularInt {

	private NoListaCircularInt primeiro;

	/**
	 * Getter da variável primeiro
	 * 
	 * @return Primeiro valor da lista
	 */
	public NoListaCircularInt getPrimeiro() {
		return this.primeiro;
	}

	/**
	 * Insere um novo valor na lista
	 * 
	 * @param info Valor a ser inserido na lista
	 */
	public void inserir(int info) {
		NoListaCircularInt novo = new NoListaCircularInt();
		novo.setInfo(info);
		novo.setProximo(getPrimeiro());
		
		NoListaCircularInt ultimo = obterUltimo();
		if (ultimo != null) {
			ultimo.setProximo(novo);
		}

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
	public NoListaCircularInt buscar(int info) {
		NoListaCircularInt atual = getPrimeiro();
		while (atual != null) {
			if (atual.getInfo() == info) {
				return atual;
			}
			if (primeiro != atual.getProximo()) {
				atual = atual.getProximo();
			} else {
				atual = null;
			}
		}

		return null;
	}



	/**
	 * Retira um dado da lista encadeada
	 * 
	 * @param valor passado como parâmetro para ser retirado da lista encadeada
	 */
	public void retirar(int valor) {
		NoListaCircularInt anterior = null;
		NoListaCircularInt atual = getPrimeiro();

		while ((atual != null) && atual.getInfo() != valor) {
			anterior = atual;
			if (primeiro != atual.getProximo()) {
				atual = atual.getProximo();
			} else {
				atual = null;
			}
		}

		if (atual != null) {
			NoListaCircularInt ultimo = obterUltimo();

			if (atual == primeiro) {
				primeiro = atual.getProximo();
				if (ultimo != null) {
					ultimo.setProximo(primeiro);
				}
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

		NoListaCircularInt atual = getPrimeiro();

		while (atual != null) {
			qtdeNos++;
			if (primeiro != atual.getProximo()) {
				atual = atual.getProximo();
			} else {
				atual = null;
			}
		}

		return qtdeNos;
	}

	public NoListaCircularInt obterNo(int posicao) {
		if ((posicao < 0) || (posicao > obterComprimento()-1)) {
			throw new IndexOutOfBoundsException("Indice não existe");
		}

		NoListaCircularInt p = getPrimeiro();
		for (int i=0; i<posicao; i++) {
			p = p.getProximo();
		}

		return p;
	}

	public void exibir() {
		NoListaCircularInt atual = primeiro;
		while (atual != null) {
			System.out.println(atual.getInfo());
			if (primeiro != atual.getProximo()) {
				atual = atual.getProximo();
			} else {
				atual = null;
			}
		}
	}
	
	/**
	 * Retorna o último elemento da lista encadeada circular
	 * 
	 * @return Nó armazenado na última posição
	 */
	private NoListaCircularInt obterUltimo() {
		NoListaCircularInt ultimo = primeiro;

		NoListaCircularInt p = primeiro;
		while (p != null) {
			
			ultimo = p;

			if (primeiro != p.getProximo()) {
				p = p.getProximo();
			} else {
				p = null;
			}
		}

		return ultimo;
	}
	
	@Override
	public String toString() {
		String resultado = "";
		NoListaCircularInt atual = getPrimeiro();

		while (atual != null) {
			if (atual != getPrimeiro()) {
				resultado += ",";
			}

			resultado += atual.getInfo();
			if (primeiro != atual.getProximo()) {
				atual = atual.getProximo();
			} else {
				atual = null;
			}
		}

		return resultado;
	}
	
}
