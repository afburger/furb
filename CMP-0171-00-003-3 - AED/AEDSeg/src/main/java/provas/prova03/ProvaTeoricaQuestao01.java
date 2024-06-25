package provas.prova03;

import java.text.DecimalFormat;

public class ProvaTeoricaQuestao01 {

	private DecimalFormat decimalFormat;
	
	public static void main(String[] args) {
		new ProvaTeoricaQuestao01();
	}
	
	public ProvaTeoricaQuestao01() {
		decimalFormat = new DecimalFormat("0.00");

		System.out.println("Possíveis respostas da questão 1");
		questao01a();
		questao01b();
		questao01c();
		questao01d();
		questao01e();
		questao01f();
		
	}
	
	public DecimalFormat getDecimalFormat() {
		return decimalFormat;
	}

	/**
	 * Um mapa de dispersão tem 101 elementos, sendo que destes, 
	 * 65 tem listas encadeadas com 1 elemento e 3 posições tem lista encadeada com 2 elementos. 
	 * Qual o fator de carga deste mapa de dispersão?
	 * Informar o fator de carga com duas casas decimais.
	 */
	private void questao01a() {
		double tamanho = 101;
		double elementos = 65 + (3*2);
		double fatorCarga = elementos / tamanho; 
		System.out.println("Opção A) " + getDecimalFormat().format(fatorCarga));
	}
	
	/**
	 * Um mapa de dispersão tem 101 elementos, sendo que destes, 
	 * 62 tem listas encadeadas com 1 elemento, três posições tem lista encadeada com 2 elementos. 
	 * Qual o fator de carga deste mapa de dispersão?
	 * Informar o fator de carga com duas casas decimais.
	 */
	private void questao01b() {
		double tamanho = 101;
		double elementos = 62 + (3*2);
		double fatorCarga = elementos / tamanho; 
		System.out.println("Opção B) " + getDecimalFormat().format(fatorCarga));
	}
	
	/**
	 * Um mapa de dispersão tem 101 elementos, sendo que destes, 
	 * 60 tem listas encadeadas com 1 elemento, três posições tem lista encadeada com 2 elementos e uma posição tem lista encadeada com três elementos. 
	 * Qual o fator de carga deste mapa de dispersão?
	 * Informar o fator de carga com duas casas decimais.
	 */
	private void questao01c() {
		double tamanho = 101;
		double elementos = 60 + (3*2) + 3;
		double fatorCarga = elementos / tamanho; 
		System.out.println("Opção C) " + getDecimalFormat().format(fatorCarga));
	}
	
	/**
	 * Um mapa de dispersão tem 101 elementos, sendo que destes, 
	 * 60 tem listas encadeadas com 1 elemento, três posições tem lista encadeada com 2 elementos e uma posição tem lista encadeada com três elementos. 
	 * Qual o fator de carga deste mapa de dispersão?
	 * Informar o fator de carga com duas casas decimais.
	 */
	private void questao01d() {
		double tamanho = 101;
		double ocupadas = tamanho - 20;
		double ocupadasUnicas = ocupadas - 5;
		double elementos = ocupadasUnicas + (5*2);
		double fatorCarga = elementos / tamanho;
		System.out.println("Opção D) " + getDecimalFormat().format(fatorCarga) + " Corrigindo, Na prova está 0,84");
	}
	
	/**
	 * Um mapa de dispersão tem 101 elementos, sendo que destes, 30 posições estão livres. 
	 * Todas as demais posições tem lista encadeada. 
	 * A maior parte tem apenas um elemento enquanto que 3 delas tem dois elementos. 
	 * Qual o fator de carga deste mapa de dispersão?
	 */
	private void questao01e() {
		double tamanho = 101;
		double ocupadas = tamanho - 30;
		double ocupadasUnicas = ocupadas - 3;
		double elementos = ocupadasUnicas + (3*2);
		double fatorCarga = elementos / tamanho;
		System.out.println("Opção E) " + getDecimalFormat().format(fatorCarga) + " Corrigindo, Na prova está 0,72");
	}
	
	/**
	 * Um mapa de dispersão tem 71 elementos, sendo que destes, 30 posições estão livres. 
	 * Todas as demais posições tem lista encadeada. 
	 * A maior parte destas listas tem apenas um elemento porém 4 delas tem dois elementos. 
	 * Qual o fator de carga deste mapa de dispersão?
	 */
	private void questao01f() {
		double tamanho = 71;
		double ocupadas = tamanho - 30;
		double ocupadasUnicas = ocupadas - 4;
		double elementos = ocupadasUnicas + (4*2);
		double fatorCarga = elementos / tamanho;
		System.out.println("Opção F) " + getDecimalFormat().format(fatorCarga));
	}
	
}
