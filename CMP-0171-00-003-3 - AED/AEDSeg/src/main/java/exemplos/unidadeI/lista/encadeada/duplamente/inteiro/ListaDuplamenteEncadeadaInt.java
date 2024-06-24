package exemplos.unidadeI.lista.encadeada.duplamente.inteiro;

public class ListaDuplamenteEncadeadaInt {

	private NoListaDuplamenteEncadeadaInt primeiro;

	public NoListaDuplamenteEncadeadaInt getPrimeiro() {
		return primeiro;
	}

	/**
	 * Inclui um novo dado na estrutura de dados
	 * 
	 * @param valor Dado a ser inserido na lista encadeada
	 */
	public void inserir(int valor) {
		NoListaDuplamenteEncadeadaInt novo = new NoListaDuplamenteEncadeadaInt();
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
	public NoListaDuplamenteEncadeadaInt buscar(int valor) {
		NoListaDuplamenteEncadeadaInt atual = getPrimeiro();

		while (atual != null) {
			if (atual.getInfo() == valor) {
				return atual;
			}
			atual = atual.getProximo();
		}

		return null;
	}

	/**
	 * Retira da estrutura de dados um dado armazenado na lista
	 * 
	 * @param valor Valor a ser retirado
	 */
	public void retirar(int valor) {
		NoListaDuplamenteEncadeadaInt atual = buscar(valor);

		if (atual != null) {
			if (primeiro == atual) {
				primeiro = atual.getProximo();
			}
			else
				atual.getAnterior().setProximo(atual.getProximo());

			if (atual.getProximo() != null) {
				atual.getProximo().setAnterior(atual.getAnterior());
			}
		}
	}

	/**
	 * Retorna o último elemento da lista encadeada
	 * 
	 * @return Nó armazenado na última posição
	 */
	public NoListaDuplamenteEncadeadaInt obterUltimo() {
		NoListaDuplamenteEncadeadaInt ultimo = primeiro;

		NoListaDuplamenteEncadeadaInt p = primeiro;
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
		NoListaDuplamenteEncadeadaInt p = obterUltimo();

		while (p != null) {
			System.out.println(p.getInfo());
			p = p.getAnterior();
		}
	}

	public void liberar() {
		NoListaDuplamenteEncadeadaInt atual = primeiro;
		while (atual!=null) {
			NoListaDuplamenteEncadeadaInt proximo = atual.getProximo();
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
		NoListaDuplamenteEncadeadaInt p = primeiro;

		while (p != null) {
			if (p != primeiro) {
				resultado += ",";
			}

			resultado += p.getInfo();
			p = p.getProximo();
		}

		return resultado;
	}

}
