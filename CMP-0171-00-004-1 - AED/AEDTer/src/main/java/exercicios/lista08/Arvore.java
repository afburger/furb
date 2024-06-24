package exercicios.lista08;


public class Arvore<T> {

	private NoArvore<T> raiz;

	public Arvore() {
		raiz = null;
	}

	/**
	 * Retorna a raiz da árvore
	 * 
	 * @return Raiz da árvore
	 */
	public NoArvore<T> getRaiz() {
		return raiz;
	}

	/**
	 * Define a raiz da árvore
	 * 
	 * @param raiz Nova raiz da árvore
	 */
	public void setRaiz(NoArvore<T> raiz) {
		this.raiz = raiz;
	}

	/**
	 * Devolve a representação textual da árvore
	 * <raiz sa1 sa2 ... san>
	 * 
	 * @return Representação da árvore
	 */
	public String toString() {
		if (estaVazia())
			return "";
		else {
			return obterRepresentacaoTextual(raiz);
		}
	}

	// <raiz sa1 sa2 ... san>
	private String obterRepresentacaoTextual(NoArvore<T> no) {
		String s = "<";
		s += no.getInfo();

		NoArvore<T> p;
		p = no.getPrimeiro();
		while (p != null) {
			s += obterRepresentacaoTextual(p);
			p = p.getProximo();
		}

		s += ">";

		return s;
	}

	public boolean estaVazia() {
		return getRaiz()==null;
	}

	/**
	 * Avalia se um determinado dado está armazenado na árvore
	 * 
	 * @param info Dado a ser pesquisado
	 * @return <code>true</code> se o dado constar na árvore e <code>false</code> caso contrário
	 */
	public boolean pertence(T info) {
		if (estaVazia()) {
			return false;
		} else {
			return pertence(raiz, info);
		}
	}
	
	private boolean pertence(NoArvore<T> no, T info) {
		if (no.getInfo().equals(info))
			return true;
		else {
			NoArvore<T> p = no.getPrimeiro();
			while (p != null) {
				if (pertence(p, info))
					return true;
				else
					p = p.getProximo();
			}

//			for (NoArvore p=no.getPrimeiro(); p!=null; p=p.getProximo()) {
//				if (pertence(p,info)) {
//					return true;
//				}
//			}
			return false;
		}
	}


	/**
	 * Conta a quantidade de nós existentes na árvore
	 * 
	 * @return Quantidade de nós
	 */
	public int contarNos() {
		if (estaVazia())
			return 0;
		else {
			return contarNos(getRaiz());
		}
	}

	/**
	 * Conta os nós de uma sub-árvore não vazia
	 * @param no Raiz da sub-árvore 
	 * @return Quantidade de nós contabilizados para a sub-árvore
	 */
	private int contarNos(NoArvore<T> no) {
		int qtde = 1;

		NoArvore<T> p = no.getPrimeiro();
		while (p != null) {
			qtde += contarNos(p);
			p = p.getProximo();
		}

		return qtde;
	}
	
	
	public int altura() {
		return altura(raiz);
	}

	private int altura(NoArvore<T> no) {
		int hmax = -1;
		NoArvore<T> p;

		p = no.getPrimeiro();
		while (p != null) {
			int h = altura(p);
			if (h > hmax) {
				hmax = h;
			}
			p = p.getProximo();
		}

		return hmax + 1;
	}

}
