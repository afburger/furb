package exercicios.lista05.pilha;

public class App {

	public static void main(String[] args) {
		Pilha<String> p = new PilhaLista<>();
		p.push("Janela");
		p.push("Porta");

		System.out.println(p.pop());
	}
}
