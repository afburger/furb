package provas.prova03.auxiliares;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;
	private NoLista<T> ultimo;

	public ListaEncadeada() {
		primeiro = null; 
		ultimo = null;
	}

	/**
	 * Getter da vari�vel primeiro
	 * 
	 * @return Primeiro n� da lista
	 */
	public NoLista<T> getPrimeiro() {
		return primeiro;
	}

	/**
	 * Insere um novo valor na lista
	 * 
	 * @param info Valor a ser inserido na lista
	 */
	public void inserir(T info) {
		NoLista<T> novo = new NoLista<>();
		novo.setInfo(info);
		novo.setProximo(primeiro);

		if (estaVazia()) {// o novo n� tamb�m ser� o �ltimo
			ultimo = novo;
		}

		this.primeiro = novo;
	}

	/**
	 * Insere um dado no final da lista encadeada
	 * 
	 * @param valor a ser inserido
	 */
	public void inserirNoFinal(T valor) {
		NoLista<T> novo = new NoLista<>();
		novo.setInfo(valor);
		novo.setProximo(null);
		if (estaVazia())
			primeiro = novo;
		else
			ultimo.setProximo(novo);

		ultimo = novo;
	}

	/**
	 * Exibe o conte�do da lista encadeada
	 */
	public void exibir() {
		NoLista<T> p = primeiro;
		while (p != null) {
			System.out.println(p.getInfo());
			p = p.getProximo();
		}
	}

	/**
	 * Avalia se a lista est� vazia ou n�o
	 * 
	 * @return True se a lista estiver vazia
	 */
	public boolean estaVazia() {
		return primeiro == null;
	}

	/**
	 * Busca um n� na lista encadeada
	 * 
	 * @param info
	 *            dado a ser localizado
	 * @return N� contendo o dado a ser localizado
	 */
	public NoLista<T> buscar(T info) {
		NoLista<T> p = primeiro;

		while (p != null) {
			if (p.getInfo().equals(info))
				return p;
			p = p.getProximo();
		}

		return null;
	}

	/**
	 * Retira um dado da lista encadeada
	 * 
	 * @param info
	 * Dado a ser retirado da lista encadeada
	 */
	public void retirar(T info) {
		NoLista<T> anterior = null;
		NoLista<T> p = primeiro;

		while ((p != null) && (!p.getInfo().equals(info))) {
			anterior = p;
			p = p.getProximo();
		}

		if (p != null) {
			if (anterior == null)
				this.primeiro = p.getProximo();
			else
				anterior.setProximo(p.getProximo());

			if (p == ultimo) { // removendo o �ltimo n�
				ultimo = anterior;
			}
		}
	}

	/**
	 * Calcula a quantidade de n�s da lista
	 * 
	 * @return quantidade de elementos da lista
	 */
	public int obterComprimento() {
		int qtdeNos = 0;

		NoLista<T> p = primeiro;

		while (p != null) {
			qtdeNos++;
			p = p.getProximo();
		}

		return qtdeNos;
	}

	/**
	 * Retorna o valor armazenado no �ltimo n�.
	 * 
	 * @return valor armazenado
	 */
	public T obterUltimo() {
		if (estaVazia())
			throw new ListaVaziaException();

//		 NoLista<T> ultimo = null;
//		
//		 NoLista<T> p = primeiro;
//		 while (p != null) {
//		 ultimo = p;
//		 p = p.getProximo();
//		 }

		return ultimo.getInfo();
	}

	// @Override
	public boolean equals(Object lista) {
		if (this == lista)
			return true;
		if (lista == null)
			return false;
		if (getClass() != lista.getClass())
			return false;

		ListaEncadeada<T> outraLista = (ListaEncadeada<T>) lista;

		// if (this.obterComprimento() != outraLista.obterComprimento())
		// return false;

		NoLista<T> p1 = this.getPrimeiro();
		NoLista<T> p2 = outraLista.getPrimeiro();

		while ((p1 != null) && (p2 != null)) {
			if (!(p1.getInfo().equals(p2.getInfo())))
				return false;

			p1 = p1.getProximo();
			p2 = p2.getProximo();
		}

		if ((p1 == null) && (p2 == null))
			return true;
		else
			return false;
		// return (p1==null) && (p2==null);
	}

	/**
	 * Obt�m um n� da lista, partindo da posi��o do n� na lista
	 * 
	 * @param idx
	 *            Posi��o do n� na lista
	 * @return N�
	 */
	public NoLista<T> getNo(int idx) {
		if (idx < 0)
			throw new IndexOutOfBoundsException();

		NoLista<T> p = getPrimeiro();
		while ((p != null) && (idx > 0)) {
			idx--;
			p = p.getProximo();
		}

		// NoLista<T> p = getPrimeiro();
		// for (int i=0; (p!=null) && (i<idx); i++) {
		// p = p.getProximo();
		// }

		if (p == null)
			throw new IndexOutOfBoundsException();

		return p;
	}

	/**
	 * Cria uma nova lista encadeada, cujo conte�do � igual ao do objeto atual,
	 * por�m com os dados armazenados em ordem invertida
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

	public void liberar() {
		primeiro = null;
		ultimo = null;
	}

}
