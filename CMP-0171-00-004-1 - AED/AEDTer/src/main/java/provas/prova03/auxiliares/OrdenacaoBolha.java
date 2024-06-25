package provas.prova03.auxiliares;

public class OrdenacaoBolha<T extends Comparable<T>> extends OrdenacaoAbstract<T>{

	@Override
	public void ordenar() {
		int i;
		int j;
		T[] meuInfo = getInfo();
		int n = meuInfo.length; 

		// Percorre o vetor
		for (i=n-1; i>=1; i--) {
			for (j=0; j<=i-1; j++) {
				// Verifica se o vetor[j] é maior que o vetor[j+1]
 				if (meuInfo[j].compareTo(meuInfo[j+1])>0) { 
 					// caso verdadeiro, realiza a troca.
 					trocar(j,j+1);
				}
			}
		}
	}
	
	public void ordenarSegundaPassagem() {
		int i;
		int j;
		T[] meuInfo = getInfo();
		int n = meuInfo.length; 

		int passagens = 0;
		// Percorre o vetor
		for (i=n-1; i>=1; i--) {
			if (passagens == 2) {
				return;
			}
			for (j=0; j<=i-1; j++) {
				// Verifica se o vetor[j] é maior que o vetor[j+1]
 				if (meuInfo[j].compareTo(meuInfo[j+1])>0) { 
 					// caso verdadeiro, realiza a troca.
 					trocar(j,j+1);
				}
			}
			passagens++;
		}
	}
		
}
