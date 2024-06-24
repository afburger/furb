package exemplos.unidadeV.ordenacao;

public class Bubblesort {

	public static void main(String[] args) {
		new Bubblesort();
	}
	
	public Bubblesort() {
		int[] vetorExemplo = {40, 20, 50, 10};
		
		ordenar(vetorExemplo);
		
		int[] vetorExemplo2 = {5, 8, 90, 12, 15, 22, 29, 34, 44};
		ordenarMelhorado(vetorExemplo2);
		
		for (int i = 0; i < vetorExemplo.length; i++) {
			System.out.println(vetorExemplo[i]);
		}
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
	
	private void trocar(int[] info, int pos1, int pos2) {
		int temp = info[pos1];
		info[pos1] = info[pos2];
		info[pos2] = temp;
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
