package provas.prova03;

import provas.prova03.auxiliares.ArvoreBinariaBusca;

public class ProvaTeoricaQuestao05 {

	
	public static void main(String[] args) {
		new ProvaTeoricaQuestao05();
	}
	
	public ProvaTeoricaQuestao05() {

		System.out.println("Possíveis respostas da questão 5");
		questao05a();
		questao05b();
		
	}
	
	private void questao05a() {
		System.out.println("Opção A) ");
		ArvoreBinariaBusca<Integer> arvoreBinaria = new ArvoreBinariaBusca<Integer>();
		
		arvoreBinaria.inserir(50);
		arvoreBinaria.inserir(20);
		arvoreBinaria.inserir(10);
		arvoreBinaria.inserir(35);
		arvoreBinaria.inserir(70);
		arvoreBinaria.inserir(60);
		arvoreBinaria.inserir(60);
		
		// Direita de 60
		System.out.println(arvoreBinaria.toString());
		
	}
	
	private void questao05b() {
		System.out.println("Opção B) ");
		ArvoreBinariaBusca<Integer> arvoreBinaria = new ArvoreBinariaBusca<Integer>();
		
		arvoreBinaria.inserir(50);
		arvoreBinaria.inserir(20);
		arvoreBinaria.inserir(10);
		arvoreBinaria.inserir(35);
		arvoreBinaria.inserir(70);
		arvoreBinaria.inserir(60);
		arvoreBinaria.inserir(35);
		
		// Direita de 35
		System.out.println(arvoreBinaria.toString());
	}
	
	
}
