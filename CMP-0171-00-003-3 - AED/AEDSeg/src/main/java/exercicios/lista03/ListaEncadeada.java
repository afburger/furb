package exercicios.lista03;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;

	/**
	 * Construtor padrão. Cria lista vazia
	 */
	public ListaEncadeada() {
		this.primeiro = null;
	}

	/**
	 * Getter da variável primeiro
	 * 
	 * @return Primeiro valor da lista
	 */
	public NoLista<T> getPrimeiro() {
		return this.primeiro;
	}

	/**
	 * Insere um novo valor na lista
	 * 
	 * @param info Valor a ser inserido na lista
	 */
	public void inserir(T info) {
		NoLista<T> novo = new NoLista<>();
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
	public NoLista<T> buscar(T info) {
		NoLista<T> atual = getPrimeiro();
		while (atual != null) {
			if (atual.getInfo().equals(info)) {
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
	public void retirar(T valor) {
		NoLista<T> anterior = null;
		NoLista<T> atual = getPrimeiro();

		while ((atual != null) && (!atual.getInfo().equals(valor))) {
			anterior = atual;
			atual = atual.getProximo();
		}

		if (atual != null) {
			if (atual == primeiro) {
				primeiro = primeiro.getProximo();
			} else {
				anterior.setProximo(atual.getProximo());
			}
		}
	}

	public void exibir() {
		NoLista<T> atual = primeiro;
		while (atual != null) {
			System.out.println(atual.getInfo());
			atual = atual.getProximo();
		}
	}

	/**
	 * Calcula a quantidade de nós da lista
	 * 
	 * @return quantidade de elementos da lista
	 */
	public int obterComprimento() {
		int qtdeNos = 0;

		NoLista<T> p = getPrimeiro();

		while (p != null) {
			qtdeNos++;
			p = p.getProximo();
		}

		return qtdeNos;
	}

	public NoLista<T> obterNov2(int posicao) {
		if ((posicao < 0) || (posicao > obterComprimento()-1)) {
			throw new IllegalArgumentException("Indice n�o existe");
		}

		NoLista<T> p = getPrimeiro();
		for (int i=0; i<posicao; i++) {
			p = p.getProximo();
		}

		return p;
	}

	/**
	 * Obtém um elemento da lista, 
	 * partindo da posição do elemento na lista
	 * 
	 * @param idx Posição do elemento na lista
	 * @return Nó
	 */
	public NoLista<T> obterNo(int idx) {
		if (idx < 0) {
			throw new IndexOutOfBoundsException();
		}

		NoLista<T> p = getPrimeiro();
		while ((p!= null) && (idx > 0)) {
			idx--;
			p = p.getProximo();
		}

		if (p == null) {
			throw new IndexOutOfBoundsException();
		}

		return p;
	}

	public String toString() {
		String resultado = "";
		NoLista<T> p = getPrimeiro();

		while (p != null) {
			if (p != getPrimeiro()) {
				resultado += ",";
			}

			resultado += p.getInfo().toString();
			p = p.getProximo();
		}

		return resultado;
	}

	/**
	 * Cria uma nova lista encadeada, cujo conteúdo é igual ao do objeto atual,
	 * porém com os dados armazenados em ordem invertida
	 * 
	 * @return nova lista encadeada
	 */
	public ListaEncadeada<T> criarInvertida() {
		ListaEncadeada<T> nova = new ListaEncadeada<>();

		NoLista<T> p = getPrimeiro();
		while (p != null) {
			nova.inserir(p.getInfo());
			p = p.getProximo();
		}

		return nova;
	}

}
