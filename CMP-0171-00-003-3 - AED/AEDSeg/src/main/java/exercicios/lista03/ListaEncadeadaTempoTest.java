package exercicios.lista03;

public class ListaEncadeadaTempoTest {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		ListaEncadeada lista = new ListaEncadeada();

		for (int i = 0; i < 1000000; i++) {
			lista.adicionar(i);
		}

		for (int i = 0; i < 1000000; i++) {
			int elemento = lista.obter(i);
		}

		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
		System.out.println("Tempo total para lista encadeada: " + duration + "ms");
	}

}
