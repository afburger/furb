package exemplos.unidadeV.ordenacao;

public class BubblesortComparacao {

	public static void main(String[] args) {
		new BubblesortComparacao();
	}
	
	public BubblesortComparacao() {
		int tamanhoVetor = 100000;
		int[] vetorExemplo = new int[tamanhoVetor];
		int[] vetorExemplo2 = new int[tamanhoVetor];
		
		for (int i = 0; i < tamanhoVetor; i++) {
			vetorExemplo[i] = i + 1;
			vetorExemplo2[i] = i + 1;
		}
		
		vetorExemplo[5] = tamanhoVetor + 5;
		vetorExemplo2[5] = tamanhoVetor + 5;
		
		long startTimeInsert = System.nanoTime();
		
		ordenar(vetorExemplo);

		long endTimeInsert = System.nanoTime();
		long durationInsert = (endTimeInsert - startTimeInsert) / 1000000; 
	    System.out.println("Tempo total para ordenar utilizando o Bubblesort padrão " + durationInsert + "ms");
		
	    long startTimeInsert2 = System.nanoTime();
		
	    ordenarMelhorado(vetorExemplo2);
		
		long endTimeInsert2 = System.nanoTime();
		long durationInsert2 = (endTimeInsert2 - startTimeInsert2) / 1000000; 
	    System.out.println("Tempo total para ordenar utilizando o Bubblesort melhorado " + durationInsert2 + "ms");
		
	}

	private void trocar(int[] info, int pos1, int pos2) {
		int temp = info[pos1];
		info[pos1] = info[pos2];
		info[pos2] = temp;
	}
	
	private void ordenar(int[] info) {
		int n = info.length;
		
		for (int i = n-1; i >= 1; i--) {
			for (int j = 0; j <= i-1; j++) {
 				if (info[j] > info[j+1]) {
 					trocar(info, j, j+1);
				}
			}
		}
	}
	
	private void ordenarMelhorado(int[] info) {
		int n = info.length;
		
		for (int i= n-1; i >= 1; i--) {
			boolean trocou = false;
			for (int j=0; j <= i-1; j++) {
 				if (info[j] > info[j+1]) {
 					trocar(info, j, j+1);
					trocou = true;
				}
			}
			if (!trocou) {
				break;
			}
		}
	}
	
}
