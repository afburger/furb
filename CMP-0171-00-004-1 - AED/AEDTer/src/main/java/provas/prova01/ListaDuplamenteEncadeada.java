package provas.prova01;

public class ListaDuplamenteEncadeada<T> {

	private NoListaDuplamenteEncadeada<T> primeiro;

	public NoListaDuplamenteEncadeada<T> getPrimeiro() {
		return primeiro;
	}

	/**
	 * Inclui um novo dado na estrutura de dados
	 * 
	 * @param valor Dado a ser inserido na lista encadeada
	 */
	public void inserir(T valor) {
		NoListaDuplamenteEncadeada<T> novo = new NoListaDuplamenteEncadeada<>();
		novo.setInfo(valor);
		novo.setProximo(primeiro);
		novo.setAnterior(null);
		if (primeiro != null) {
			primeiro.setAnterior(novo);
		}
		primeiro = novo;
	}

	/**
	 * Busca um nó na estrutura de dados que esteja armazenando o dado fornecido
	 * como argumento
	 * 
	 * @param valor Valor a ser localizado
	 * @return Nó contendo o dado
	 */
	public NoListaDuplamenteEncadeada<T> buscar(T valor) {
		NoListaDuplamenteEncadeada<T> atual = getPrimeiro();

		while (atual != null) {
			if (atual.getInfo().equals(valor))
				return atual;
			atual = atual.getProximo();
		}

		return null;
	}

	/**
	 * Retira da estrutura de dados um dado armazenado na lista
	 * 
	 * @param valor Valor a ser retirado
	 */
	public void retirar(T valor) {
		NoListaDuplamenteEncadeada<T> p = buscar(valor);

		if (p != null) {
			if (primeiro == p) {
				primeiro = p.getProximo();
			}
			else
				p.getAnterior().setProximo(p.getProximo());

			if (p.getProximo() != null) {
				p.getProximo().setAnterior(p.getAnterior());
			}
		}
	}

	/**
	 * Retorna o último elemento da lista encadeada
	 * 
	 * @return Nó armazenado na última posição
	 */
	public NoListaDuplamenteEncadeada<T> obterUltimo() {
		NoListaDuplamenteEncadeada<T> ultimo = primeiro;

		NoListaDuplamenteEncadeada<T> p = primeiro;
		while (p != null) {
			
			ultimo = p;

			p = p.getProximo();
		}

		return ultimo;
	}

	/**
	 * Exibe o conteúdo da lista encadeada começando a exibir primeiro o último
	 * elemento
	 */
	public void exibirOrdemInversa() {
		NoListaDuplamenteEncadeada<T> p = obterUltimo();

		while (p != null) {
			System.out.println(p.getInfo());
			p = p.getAnterior();
		}
	}

	public void liberar() {
		NoListaDuplamenteEncadeada<T> atual = primeiro;
		while (atual!=null) {
			NoListaDuplamenteEncadeada<T> proximo = atual.getProximo();
			atual.setAnterior(null);
			atual.setProximo(null);

			atual = proximo;
		}
		primeiro = null;
	}

	/**
	 * Retorna representação textual da lista
	 */
	public String toString() {
		String resultado = "";
		NoListaDuplamenteEncadeada<T> p = primeiro;

		while (p != null) {
			if (p != primeiro) {
				resultado += ",";
			}

			resultado += p.getInfo().toString();
			p = p.getProximo();
		}

		return resultado;
	}

	
	// Questão 2 da prova prática.
	public ListaDuplamenteEncadeada<T> clonar() {
		ListaDuplamenteEncadeada<T> clone = new ListaDuplamenteEncadeada<T>(); 
		NoListaDuplamenteEncadeada<T> ultimo = obterUltimo();
		
		while (ultimo != null) {
			clone.inserir(ultimo.getInfo());
			ultimo = ultimo.getAnterior();
		}
		
		return clone;
	} 
	
	
	
	
	
}
