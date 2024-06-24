package exemplos.unidadeI.fila;

import javax.management.RuntimeErrorException;

public class FilaDinamica implements Fila {

	private ListaEncadeadaInt lista;
	
	public FilaDinamica() {
		lista = new ListaEncadeadaInt();
	}
	
	@Override
	public void inserir(int valor) {
		lista.inserirNoFinal(valor);
	}

	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}

	@Override
	public int peek() {
		if (estaVazia()) {
			throw new RuntimeErrorException(null, "Fila está vazia");
		}
		return lista.getPrimeiro().getInfo();
	}

	@Override
	public int retirar() {
		int valor = peek();
		lista.retirar(valor);
		return valor;
	}

	@Override
	public void liberar() {
		lista = new ListaEncadeadaInt();
	}

}
