package exemplos.unidadeI.pilha;

public class AppPilhas {

	public static void main(String[] args) {
		
		Pilha pilhaEstatica = new PilhaDinamica();
		pilhaEstatica.push(1);
		System.out.println(pilhaEstatica.peek());
		pilhaEstatica.push(2);
		System.out.println(pilhaEstatica.peek());
		pilhaEstatica.push(3);
		System.out.println(pilhaEstatica.peek());
		System.out.println("Topo removido: " + pilhaEstatica.pop());
		System.out.println("Top atualizado: " + pilhaEstatica.peek());
		
		
	}
}
