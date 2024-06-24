package exemplos.unidadeI.fila;

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
	
	// ######################### Questão 5 - Teórica  ##############################################
	public void inserirNoFinal(int v) {
		NoListaInt x = null;
		NoListaInt p = primeiro;
		
		while (p != null) {
			x = p;
			p = p.getProximo();
		}
		
		NoListaInt obj = new NoListaInt();
		obj.setInfo(v);
		
		if (x == null) {
			primeiro = obj;
		} else {
			x.setProximo(obj);
		}
	}
	
	public NoListaInt metodo1() {
		NoListaInt p1 = primeiro;
		NoListaInt p2 = null;
		
		int temp = 0;
		
		if (p1 != null) {
			temp = p1.getInfo();
			p2 = p1;
		}
		
		while (p1 != null) {
			if (p1.getInfo() < temp) {
				temp = p1.getInfo();
				p2 = p1;
			}
			p1 = p1.getProximo();
		}
		
		return p2;
	}
}
