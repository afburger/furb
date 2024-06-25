package exercicios.lista07;

public class ArvoreBinaria <T> {
	
	private NoArvoreBinaria<T> raiz;
	
	/**
	 * Cria uma árvore vazia
	 */
	public ArvoreBinaria() {
		 raiz = null;
	}
	
	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}
	
	/**
	 * Define a raiz da árvore
	 * @param raiz Raiz da árvore binária
	 */
	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}
	

	/**
	 * Avalia se a árvore está vazia
	 * @return True se a árvore estiver vazia, se não false
	 */
	public boolean estaVazia () {
		return (raiz == null);
	}
	

	/**
	 * Avalia se um determinado dado está armazenado na árvore.
	 * Inicia a busca, partindo da raiz da árvore
	 * @param info valor a ser pesquisado
	 * @return True se o dado foi localizado
	 */
	public boolean pertence(T info) {
		return pertence(raiz, info);
	}


	/**
	 * Avalia se um dado pertence a árvore cuja raiz é fornecida
	 * como argumento
	 * @param no Nó raiz a ser pesquisado
	 * @param info Dado a ser procurado na árvore
	 * @return True se o dado foi localizado na árvore
	 */
	private boolean pertence(NoArvoreBinaria<T> no, T info){
		if (no == null)
			return false;
		else {
			return (no.getInfo().equals(info)) ||
					pertence(no.getEsquerda(), info) ||
					pertence(no.getDireita(), info);
		}
	}


	public String toString() {
		return arvorePre(raiz);
	}

	private String arvorePre(NoArvoreBinaria<T> no) {
		if (no == null)
			return "<>";
		else 
			return "<" + 
					no.getInfo() + 
					arvorePre(no.getEsquerda()) +
					arvorePre(no.getDireita()) +
					">";
	}

	public int contarNos() {
		return contarNos(raiz);
	}

	private int contarNos(NoArvoreBinaria<T> no) {
		if (no == null) {
			return 0;
		} else {
			return 1 + 	contarNos(no.getEsquerda()) +
						contarNos(no.getDireita());
		}
	}
	
	
	
	
	
	
	// ####################### OUTROS MÉTODOS ################################

	/**
	 * Conta a quantidade de nós folhas da árvore
	 * @return
	 */
	public int contarFolhas() {
		return contarFolhas(raiz);
	}
	
	
	private int contarFolhas(NoArvoreBinaria<T> no) {
		if (no == null)
			return 0;
		if (no.getEsquerda()==null && no.getDireita()==null)
			return 1;
		else {
			return contarFolhas(no.getEsquerda()) + contarFolhas(no.getDireita());
		}
	}
	
	
	/**
	 * Conta a quantidade de nós internos da �rvore
	 */
	public int contarNosInternos() {
		return contarNosInternos(raiz);
	}
	
	
	private int contarNosInternos(NoArvoreBinaria<T> no) {
		if (no == null) {
			return 0;
		} else if (no.getEsquerda()==null && no.getDireita()==null) {
			return 0;
		} else 
			return 1 + contarNosInternos(no.getEsquerda()) + contarNosInternos(no.getDireita());
	}
	

	/**
	 * Retorna a altura da árvore
	 * @return altura da árvore
	 */
	public int altura(){
		return altura(raiz);
	}
	
	private int altura(NoArvoreBinaria<T> no){
		if (no == null)
			return -1;
		else 
			return 1 + Math.max(altura(no.getEsquerda()), altura(no.getDireita()));
	}
	
	
	public void printPreOrdem() {
		printPreOrdem(raiz);
	}
	
	
	private void printPreOrdem(NoArvoreBinaria<T> no) {
		if (no != null) {
			System.out.print(no.getInfo()+"-");
			printPreOrdem(no.getEsquerda());
			printPreOrdem(no.getDireita());
		}
	}
	
	public void printPosOrdem() {
		printPosOrdem(raiz);
	}
	
	
	private void printPosOrdem(NoArvoreBinaria<T> no) {
		if (no != null) {
			printPosOrdem(no.getEsquerda());
			printPosOrdem(no.getDireita());
			System.out.print(no.getInfo()+"-");
		}
	}
	
	// Método auxiliar só para demonstrar na correção da prova
	public void printOrdemSimetrica() {
		printOrdemSimetrica(raiz);
	}
	
	// Método auxiliar só para demonstrar na correção da prova
	private void printOrdemSimetrica(NoArvoreBinaria<T> no) {
		if (no != null) {
			printOrdemSimetrica(no.getEsquerda());
			System.out.print(no.getInfo()+"-");
			printOrdemSimetrica(no.getDireita());
		}
	}

	// Método auxiliar só para demonstrar na correção da prova
	private boolean isNoInterno(NoArvoreBinaria<T> no) {
		return no.getEsquerda() != null || no.getDireita() != null;
	}
	
//	// Questão 01 da prova prática.
//	public boolean isDegenerada() {
//		return isDegenerada(raiz);
//	}
//	
//	// Questão 01 da prova prática.
//	private boolean isDegenerada(NoArvoreBinaria<T> no) {
//		if (no == null 
//				|| (no.getEsquerda() != null && no.getDireita() != null)) {
//			return false;
//		}
//
//		if (no.getEsquerda() != null) {
//			if (isNoInterno(no.getEsquerda())) {
//				return isDegenerada(no.getEsquerda());
//			} 
//			return true;
//		} 
//		if (no.getDireita() != null) {
//			if (isNoInterno(no.getDireita())) {
//				return isDegenerada(no.getDireita());
//			}
//			return true;
//		}
//		return false;
//	}
	
	
	public boolean isDegenerada()
	{
	   
	    if ((estaVazia()) || (raiz.getEsquerda() == null) && raiz.getDireita() == null) //Se for vazia nao é degenerada
	    {
	        return false;  
	    }
	    return isDegenerada(raiz);
	}

	private boolean isDegenerada(NoArvoreBinaria<T> no)
	{
	    if (no == null)
	   {
	        return true;
	    }

	    if (no.getEsquerda() != null && no.getDireita() != null) //analisa se ambos os filhos é nulo, se forem não é degenerada
	    {
	        return false;
	    }

	    return isDegenerada(no.getEsquerda()) && isDegenerada(no.getDireita()); //Verifica a arvore de forma recursiva chamando o método para os no da esquerda e direita
	   
	}
	
}
