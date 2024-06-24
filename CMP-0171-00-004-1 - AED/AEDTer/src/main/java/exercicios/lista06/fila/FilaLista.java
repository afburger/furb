package exercicios.lista06.fila;

import exercicios.lista06.lista.ListaEncadeada;

public class FilaLista<T> implements Fila<T> {
	
	private ListaEncadeada<T> lista;
	
	public FilaLista() {
		lista = new ListaEncadeada<>();
	}

	/**
	 * Insere um elemento na fila
	 */
	@Override
	public void inserir(T valor) {
		lista.inserirNoFinal(valor);
	}
	
	/**
	 * Avalia se a lista est� vazia
	 */
	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}
	
	/**
	 * Retorna o elemento que est� no in�cio da fila
	 * @return dado que est� no in�cio da fila
	 */
	@Override
	public T peek() {
		if (estaVazia()) {
			throw new FilaVaziaException();
		}
		return lista.getPrimeiro().getInfo();
	}
		

	/**
	 * Retira um elemento da fila
	 */
	@Override
	public T retirar() {
		T valor;
		valor = peek();
		lista.retirar(valor);
		
		return valor;
	}

	/**
	 * Retira todos os elementos da fila
	 */
	@Override
	public void liberar() {
		lista = new ListaEncadeada<>();

		// alternativa 1:
//		lista.liberar(); // precisa implementar este m�todo na lista encadeada
	}

	/**
	 * Retorna representa��o textual da fila, partindo
	 * do in�cio at� o final. Os dados s�o separados por v�rgula
	 * @return conte�do da fila
	 */
	public String toString() {
		return lista.toString();
	}

}
