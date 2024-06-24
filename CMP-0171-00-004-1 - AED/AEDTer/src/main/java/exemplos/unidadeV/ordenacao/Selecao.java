package exemplos.unidadeV.ordenacao;

public class Selecao {
	
	private int[] info;
	
	public static void main(String[] args) {
		new Selecao();
	}
	
	public Selecao() {
		info = new int[] {25, 48, 37, 12, 57, 4, 86, 33, 92};
		ordenar();
		
		for (int i = 0; i < info.length; i++) {
			 System.out.println(info[i]);
		}
	}
	
	private void ordenar() {
		int i;   
		int j;
		
		int n = info.length;

		for (i=n-1; i>=1; i--) {

			int idxMaiorValor = 0;

			for (j=0; j<=i-1; j++) {
				if (info[j] > info[idxMaiorValor]) {
					idxMaiorValor = j;
				}
			}

			trocar(info, idxMaiorValor, i);
		}
	}
	
	private void trocar(int[] info, int pos1, int pos2) {
		int temp = info[pos1];
		info[pos1] = info[pos2];
		info[pos2] = temp;
	}
}
