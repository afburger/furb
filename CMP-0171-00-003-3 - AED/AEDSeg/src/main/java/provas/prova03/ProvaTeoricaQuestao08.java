package provas.prova03;

import provas.prova03.auxiliares.OrdenacaoMergeSort;

public class ProvaTeoricaQuestao08 {

	
	public static void main(String[] args) {
		new ProvaTeoricaQuestao08();
	}
	
	public ProvaTeoricaQuestao08() {

		System.out.println("Possíveis respostas da questão 8");
		questao08a();
		questao08b();
		questao08c();
		questao08d();
		questao08e();
		questao08f();
		
	}
	
	/**
	 * O algoritmo mergesort tem algumas etapas, entre elas, a mesclagem/intercalação dos dados de sub-vetores ordenados. 
	 * Considere que o algoritmo mergesort possui estes dois subvetores para mesclar/intercalar:
	 * à esquerda: [10,70,80,90]
	 * à direita: [20,45,60]
	 * Após executada a mesclagem/intercalação, quais são os valores que "sobram"? Escreva os valores separando por vírgula e sem espaços.
	 */
	private void questao08a() {
		System.out.println("Opção A) ");
		
		OrdenacaoMergeSort<Integer> ordenacao = new OrdenacaoMergeSort<Integer>();
		Integer[] vetor = new Integer[] {10,70,80,90,20,45,60};
		
		ordenacao.setInfo(vetor);
		// Criei uma função dentro do método merge, para printar os valores que sobraram.
		ordenacao.ordenar();
	}
	
	/**
	 * O algoritmo mergesort tem algumas etapas, entre elas, a mesclagem/intercalação dos dados de sub-vetores ordenados. 
	 * Considere que o algoritmo mergesort possui estes dois subvetores para mesclar/intercalar:
	 * à esquerda: [15,40,56,90]
	 * à direita: [12,30,45]
	 * Após executada a mesclagem/intercalação, quais são os valores que "sobram"? Escreva os valores separando por vírgula e sem espaços.
	 */
	private void questao08b() {
		System.out.println("Opção B) ");
		
		OrdenacaoMergeSort<Integer> ordenacao = new OrdenacaoMergeSort<Integer>();
		Integer[] vetor = new Integer[] {15,40,56,90,12,30,45};
		
		ordenacao.setInfo(vetor);
		// Criei uma função dentro do método merge, para printar os valores que sobraram.
		ordenacao.ordenar();
	}
	
	/**
	 * O algoritmo mergesort tem algumas etapas, entre elas, a mesclagem/intercalação dos dados de sub-vetores ordenados. 
	 * Considere que o algoritmo mergesort possui estes dois subvetores para mesclar/intercalar:
	 * à esquerda: [12,14,15,40]
	 * à direita: [8,19,35,38]
	 * Após executada a mesclagem/intercalação, quais são os valores que "sobram"? Escreva os valores separando por vírgula e sem espaços.
	 */
	private void questao08c() {
		System.out.println("Opção C) ");
		
		OrdenacaoMergeSort<Integer> ordenacao = new OrdenacaoMergeSort<Integer>();
		Integer[] vetor = new Integer[] {12,14,15,40,8,19,35,38};
		
		ordenacao.setInfo(vetor);
		// Criei uma função dentro do método merge, para printar os valores que sobraram.
		ordenacao.ordenar();
	}
	
	/**
	 * O algoritmo mergesort tem algumas etapas, entre elas, a mesclagem/intercalação dos dados de sub-vetores ordenados. 
	 * Considere que o algoritmo mergesort possui estes dois subvetores para mesclar/intercalar:
	 * à esquerda: [34,45,60,71]
	 * à direita: [53,61,80]
	 * Após executada a mesclagem/intercalação, quais são os valores que "sobram"? Escreva os valores separando por vírgula e sem espaços.
	 */
	private void questao08d() {
		System.out.println("Opção D) ");
		
		OrdenacaoMergeSort<Integer> ordenacao = new OrdenacaoMergeSort<Integer>();
		Integer[] vetor = new Integer[] {34,45,60,71,53,61,80};
		
		ordenacao.setInfo(vetor);
		// Criei uma função dentro do método merge, para printar os valores que sobraram.
		ordenacao.ordenar();
	}
	
	/**
	 * O algoritmo mergesort tem algumas etapas, entre elas, a mesclagem/intercalação dos dados de sub-vetores ordenados. 
	 * Considere que o algoritmo mergesort possui estes dois subvetores para mesclar/intercalar:
	 * à esquerda: [33,60,70,71]
	 * à direita: [12,25,65]
	 * Após executada a mesclagem/intercalação, quais são os valores que "sobram"? Escreva os valores separando por vírgula e sem espaços.
	 */
	private void questao08e() {
		System.out.println("Opção E) ");
		
		OrdenacaoMergeSort<Integer> ordenacao = new OrdenacaoMergeSort<Integer>();
		Integer[] vetor = new Integer[] {33,60,70,71,12,25,65};
		
		ordenacao.setInfo(vetor);
		// Criei uma função dentro do método merge, para printar os valores que sobraram.
		ordenacao.ordenar();
	}
	
	/**
	 * O algoritmo mergesort tem algumas etapas, entre elas, a mesclagem/intercalação dos dados de sub-vetores ordenados. 
	 * Considere que o algoritmo mergesort possui estes dois subvetores para mesclar/intercalar:
	 * à esquerda: [14,30,39,45]
	 * à direita: [20,25,51,52]
	 * Após executada a mesclagem/intercalação, quais são os valores que "sobram"? Escreva os valores separando por vírgula e sem espaços.
	 */
	private void questao08f() {
		System.out.println("Opção F) ");
		
		OrdenacaoMergeSort<Integer> ordenacao = new OrdenacaoMergeSort<Integer>();
		Integer[] vetor = new Integer[] {14,30,39,45,20,25,51,52};
		
		ordenacao.setInfo(vetor);
		// Criei uma função dentro do método merge, para printar os valores que sobraram.
		ordenacao.ordenar();
	}
	
}
