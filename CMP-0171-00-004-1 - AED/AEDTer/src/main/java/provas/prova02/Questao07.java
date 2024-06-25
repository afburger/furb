package provas.prova02;

import exemplos.unidadeII.arvore.binaria.ArvoreBinaria;
import exemplos.unidadeII.arvore.binaria.NoArvoreBinaria;

public class Questao07 {

	public static void main(String[] args) {
		questaoA();
		
//		System.out.println("");
//		
//		questaoB();
	}
	
	public static void questaoA() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		NoArvoreBinaria no2 = new NoArvoreBinaria(2, null, null);
		
		NoArvoreBinaria no4 = new NoArvoreBinaria(4, null, null);
		NoArvoreBinaria no5 = new NoArvoreBinaria(5, null, null);
		NoArvoreBinaria no3 = new NoArvoreBinaria(3, no4, no5);
		
		NoArvoreBinaria no1 = new NoArvoreBinaria(1, no2, no3);
	
		arvore.setRaiz(no1);
		
		arvore.pertenceContador(10);
	}

	public static void questaoB() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		NoArvoreBinaria no4 = new NoArvoreBinaria(4, null, null);
		NoArvoreBinaria no2 = new NoArvoreBinaria(2, null, no4);
		
		NoArvoreBinaria no6 = new NoArvoreBinaria(6, null, null);
		NoArvoreBinaria no5 = new NoArvoreBinaria(5, null, null);
		NoArvoreBinaria no3 = new NoArvoreBinaria(3, no5, no6);
		
		NoArvoreBinaria no1 = new NoArvoreBinaria(1, no2, no3);
	
		arvore.setRaiz(no1);
		
		arvore.pertenceContador(10);
		
	}
	
	
}
