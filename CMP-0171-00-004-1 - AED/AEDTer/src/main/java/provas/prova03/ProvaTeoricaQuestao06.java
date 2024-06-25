package provas.prova03;

import provas.prova03.auxiliares.OrdenacaoBolha;

public class ProvaTeoricaQuestao06 {

	
	public static void main(String[] args) {
		new ProvaTeoricaQuestao06();
	}
	
	public ProvaTeoricaQuestao06() {

		System.out.println("Possíveis respostas da questão 6");
		questao06a();
		questao06b();
		questao06c();
		questao06d();
		questao06e();
		questao06f();
	}
	
	private void questao06a() {
		System.out.println("Opção A) ");
		
		OrdenacaoBolha<Integer> ordenacao = new OrdenacaoBolha<Integer>();
		Integer[] vetor = new Integer[] {90, 44, 72, 31, 50, 16};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		ordenacao.ordenarSegundaPassagem();
		
		for (Integer integer : vetor) {
			System.out.print(integer);
			System.out.print(",");
		}
		System.out.println();
	}
	
	private void questao06b() {
		System.out.println("Opção B) ");
		
		OrdenacaoBolha<Integer> ordenacao = new OrdenacaoBolha<Integer>();
		Integer[] vetor = new Integer[] {18,9,33,85,15,7,89};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		ordenacao.ordenarSegundaPassagem();
		
		for (Integer integer : vetor) {
			System.out.print(integer);
			System.out.print(",");
		}
		System.out.println();
	}
	
	private void questao06c() {
		System.out.println("Opção C) ");
		
		OrdenacaoBolha<Integer> ordenacao = new OrdenacaoBolha<Integer>();
		Integer[] vetor = new Integer[] {65,12,49,44,18,2};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		ordenacao.ordenarSegundaPassagem();
		
		for (Integer integer : vetor) {
			System.out.print(integer);
			System.out.print(",");
		}
		System.out.println();
	}
	
	private void questao06d() {
		System.out.println("Opção D) ");
		
		OrdenacaoBolha<Integer> ordenacao = new OrdenacaoBolha<Integer>();
		Integer[] vetor = new Integer[] {44,13,59,11,46,32,12};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		ordenacao.ordenarSegundaPassagem();
		
		for (Integer integer : vetor) {
			System.out.print(integer);
			System.out.print(",");
		}
		System.out.println();
	}
	
	
	private void questao06e() {
		System.out.println("Opção E) ");
		
		OrdenacaoBolha<Integer> ordenacao = new OrdenacaoBolha<Integer>();
		Integer[] vetor = new Integer[] {17,94,22,-5,18,1};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		ordenacao.ordenarSegundaPassagem();
		
		for (Integer integer : vetor) {
			System.out.print(integer);
			System.out.print(",");
		}
		System.out.println();
	}
	
	private void questao06f() {
		System.out.println("Opção F) ");
		
		OrdenacaoBolha<Integer> ordenacao = new OrdenacaoBolha<Integer>();
		Integer[] vetor = new Integer[] {12,44,19,50,5,7};
		
		ordenacao.setInfo(vetor);
		// Criei um método que abora a execução na segunda passagem.
		ordenacao.ordenarSegundaPassagem();
		
		for (Integer integer : vetor) {
			System.out.print(integer);
			System.out.print(",");
		}
		System.out.println();
	}
}
