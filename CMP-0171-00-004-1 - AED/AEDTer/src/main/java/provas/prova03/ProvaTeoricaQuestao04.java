package provas.prova03;

import provas.prova03.auxiliares.ListaEstaticaInt;

public class ProvaTeoricaQuestao04 {

	
	public static void main(String[] args) {
		new ProvaTeoricaQuestao04();
	}
	
	public ProvaTeoricaQuestao04() {

		System.out.println("Possíveis respostas da questão 4");
		questao04a();
		questao04b();
		
	}
	
	private void questao04a() {
		System.out.println("Opção A) ");
		ListaEstaticaInt listaEstatica = new ListaEstaticaInt(11);
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
		
		// Fiz a implementação para imprimir a quantidade de vezes dentro do busca binária
		listaEstatica.buscaBinaria(75);
	}
	
	private void questao04b() {
		System.out.println("Opção B) ");
		ListaEstaticaInt listaEstatica = new ListaEstaticaInt(11);
		listaEstatica.inserir(1);
		listaEstatica.inserir(17);
		listaEstatica.inserir(20);
		listaEstatica.inserir(33);
		listaEstatica.inserir(43);
		listaEstatica.inserir(75);
		listaEstatica.inserir(80);
		listaEstatica.inserir(88);
		listaEstatica.inserir(92);
		listaEstatica.inserir(95);
		listaEstatica.inserir(98);
		
		// Fiz a implementação para imprimir a quantidade de vezes dentro do busca binária
		listaEstatica.buscaBinaria(75);
	}
	
	
}
