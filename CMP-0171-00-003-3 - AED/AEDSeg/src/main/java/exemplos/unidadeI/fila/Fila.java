package exemplos.unidadeI.fila;

public interface Fila {

	void inserir(int valor);
	
	boolean estaVazia();
	
	int peek();
	
	int retirar();
	
	void liberar();
	
	
}
