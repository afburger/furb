package provas.prova03;

import provas.prova03.auxiliares.ListaEstatica;

public class ProvaTeoricaQuestao03 {

	
	public static void main(String[] args) {
		new ProvaTeoricaQuestao03();
	}
	
	public ProvaTeoricaQuestao03() {

		System.out.println("Possíveis respostas da questão 3");
		questao03a();
		questao03b();
		questao03c();
		questao03d();
		
	}
	
	private void questao03a() {
		System.out.println("Opção A) ");
		ListaEstatica<Integer> listaEstatica = new ListaEstatica<Integer>();
		listaEstatica.inserir(1);
		listaEstatica.inserir(7);
		listaEstatica.inserir(20);
		listaEstatica.inserir(28);
		listaEstatica.inserir(33);
		listaEstatica.inserir(43);
		listaEstatica.inserir(55);
		listaEstatica.inserir(62);
		listaEstatica.inserir(66);
		listaEstatica.inserir(75);
		listaEstatica.inserir(98);
		// Fiz a implementação para imprimir a quantidade de vezes dentro do buscar
		listaEstatica.buscar(35);
	}
	
	private void questao03b() {
		System.out.println("Opção B) ");
		ListaEstatica<Integer> listaEstatica = new ListaEstatica<Integer>();
		listaEstatica.inserir(1);
		listaEstatica.inserir(20);
		listaEstatica.inserir(28);
		listaEstatica.inserir(30);
		listaEstatica.inserir(40);
		listaEstatica.inserir(45);
		listaEstatica.inserir(55);
		listaEstatica.inserir(62);
		listaEstatica.inserir(66);
		listaEstatica.inserir(75);
		listaEstatica.inserir(98);
		
		// Fiz a implementação para imprimir a quantidade de vezes dentro do buscar
		listaEstatica.buscar(44);
	}
	
	private void questao03c() {
		System.out.println("Opção C) ");
		ListaEstatica<Integer> listaEstatica = new ListaEstatica<Integer>();
		listaEstatica.inserir(1);
		listaEstatica.inserir(20);
		listaEstatica.inserir(28);
		listaEstatica.inserir(30);
		listaEstatica.inserir(40);
		listaEstatica.inserir(45);
		listaEstatica.inserir(55);
		listaEstatica.inserir(62);
		listaEstatica.inserir(66);
		listaEstatica.inserir(75);
		listaEstatica.inserir(98);
		
		listaEstatica.buscar(5);
	}
	
	private void questao03d() {
		System.out.println("Opção D) ");
		ListaEstatica<Integer> listaEstatica = new ListaEstatica<Integer>();
		listaEstatica.inserir(1);
		listaEstatica.inserir(20);
		listaEstatica.inserir(28);
		listaEstatica.inserir(30);
		listaEstatica.inserir(40);
		listaEstatica.inserir(45);
		listaEstatica.inserir(55);
		listaEstatica.inserir(62);
		listaEstatica.inserir(66);
		listaEstatica.inserir(75);
		listaEstatica.inserir(98);
		
		listaEstatica.buscar(60);
	}
	
}
