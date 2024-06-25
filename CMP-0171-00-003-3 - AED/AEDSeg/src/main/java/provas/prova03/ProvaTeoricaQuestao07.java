package provas.prova03;

import provas.prova03.auxiliares.OrdenacaoQuickSort;

public class ProvaTeoricaQuestao07 {

	
	public static void main(String[] args) {
		new ProvaTeoricaQuestao07();
	}
	
	public ProvaTeoricaQuestao07() {

		System.out.println("Possíveis respostas da questão 7");
		questao07a();
		questao07b();
		questao07c();
		questao07d();
		questao07e();
		questao07f();
		
	}
	
	/**
	 * Um vetor possui a seguinte composição [90,44,72,31,50,16].
	 *
	 * Ao submeter este vetor ao algoritmo de ordenação Quicksort, 
	 * após selecionar o primeiro pivô e particionar o vetor em dois sub-vetores, 
	 * em que posição do vetor se encontrará o pivô?
	 */
	private void questao07a() {
		System.out.println("Opção A) ");
		
		OrdenacaoQuickSort<Integer> ordenacao = new OrdenacaoQuickSort<Integer>();
		Integer[] vetor = new Integer[] {90, 44, 72, 31, 50, 16};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		System.out.println(ordenacao.retornaPivoExecucao());
		
		System.out.println();
		
	}
	
	/**
	 * Um vetor possui a seguinte composição [50,14,80,66,72,12].
	 *
	 * Ao submeter este vetor ao algoritmo de ordenação Quicksort, 
	 * após selecionar o primeiro pivô e particionar o vetor em dois sub-vetores, 
	 * em que posição do vetor se encontrará o pivô?
	 */
	private void questao07b() {
		System.out.println("Opção B) ");
		
		OrdenacaoQuickSort<Integer> ordenacao = new OrdenacaoQuickSort<Integer>();
		Integer[] vetor = new Integer[] {50,14,80,66,72,12};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		System.out.println(ordenacao.retornaPivoExecucao());
		
		System.out.println();
		
	}
	
	/**
	 * Um vetor possui a seguinte composição [50,14,80,66,72,12].
	 *
	 * Ao submeter este vetor ao algoritmo de ordenação Quicksort, 
	 * após selecionar o primeiro pivô e particionar o vetor em dois sub-vetores, 
	 * em que posição do vetor se encontrará o pivô?
	 */
	private void questao07c() {
		System.out.println("Opção C) ");
		
		OrdenacaoQuickSort<Integer> ordenacao = new OrdenacaoQuickSort<Integer>();
		Integer[] vetor = new Integer[] {50,14,80,66,72,12};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		System.out.println(ordenacao.retornaPivoExecucao());
		
		System.out.println();
		
	}
	
	/**
	 * Um vetor possui a seguinte composição [50,20,70,80,10,99,60].
	 *
	 * Ao submeter este vetor ao algoritmo de ordenação Quicksort, 
	 * após selecionar o primeiro pivô e particionar o vetor em dois sub-vetores, 
	 * em que posição do vetor se encontrará o pivô?
	 */
	private void questao07d() {
		System.out.println("Opção D) ");
		
		OrdenacaoQuickSort<Integer> ordenacao = new OrdenacaoQuickSort<Integer>();
		Integer[] vetor = new Integer[] {50,20,70,80,10,99,60};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		System.out.println(ordenacao.retornaPivoExecucao());
		
		System.out.println();
		
	}
	
	/**
	 * Um vetor possui a seguinte composição [60,36,89,56,90,44,1].
	 *
	 * Ao submeter este vetor ao algoritmo de ordenação Quicksort, 
	 * após selecionar o primeiro pivô e particionar o vetor em dois sub-vetores, 
	 * em que posição do vetor se encontrará o pivô?
	 */
	private void questao07e() {
		System.out.println("Opção E) ");
		
		OrdenacaoQuickSort<Integer> ordenacao = new OrdenacaoQuickSort<Integer>();
		Integer[] vetor = new Integer[] {60,36,89,56,90,44,1};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		System.out.println(ordenacao.retornaPivoExecucao());
		
		System.out.println();
		
	}
	
	/**
	 * Um vetor possui a seguinte composição [80,50,90,85,95,102].
	 *
	 * Ao submeter este vetor ao algoritmo de ordenação Quicksort, 
	 * após selecionar o primeiro pivô e particionar o vetor em dois sub-vetores, 
	 * em que posição do vetor se encontrará o pivô?
	 */
	private void questao07f() {
		System.out.println("Opção F) ");
		
		OrdenacaoQuickSort<Integer> ordenacao = new OrdenacaoQuickSort<Integer>();
		Integer[] vetor = new Integer[] {80,50,90,85,95,102};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		System.out.println(ordenacao.retornaPivoExecucao());
		
		System.out.println();
		
	}
}
