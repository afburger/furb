package exercicios.lista06.fila;

public interface Fila <T> {

	void inserir(T v);

	T peek();

	T retirar();

	boolean estaVazia();

	void liberar();

}
