package exercicios.lista05.pilha;

public class PilhaCheiaException extends RuntimeException {

	public PilhaCheiaException() {
		super("Capacidade esgotada da pilha");
	}
	
}
