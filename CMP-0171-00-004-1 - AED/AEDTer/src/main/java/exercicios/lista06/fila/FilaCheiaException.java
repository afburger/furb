package exercicios.lista06.fila;

public class FilaCheiaException extends RuntimeException {

	public FilaCheiaException() {
		super("A fila já está cheia!");
	}
}
