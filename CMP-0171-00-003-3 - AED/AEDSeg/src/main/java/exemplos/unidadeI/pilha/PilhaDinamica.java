package exemplos.unidadeI.pilha;

import exemplos.unidadeI.lista.encadeada.inteiro.ListaEncadeadaInt;

public class PilhaDinamica implements Pilha {

	private ListaEncadeadaInt lista;
	
	public PilhaDinamica() {
		lista = new ListaEncadeadaInt();
	}
	
	@Override
	public void push(int valor) {
		lista.inserir(valor);
	}

	@Override
	public int peek() {
		if (estaVazia()) {
			throw new RuntimeException("Pilha está vaia");
		}
		return lista.getPrimeiro().getInfo();
	}
	
	@Override
	public int pop() {
		int valor = peek();
		lista.retirar(valor);
		return valor;
	}

	
	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}

	@Override
	public void liberar() {
		lista.liberar();
	}

}
