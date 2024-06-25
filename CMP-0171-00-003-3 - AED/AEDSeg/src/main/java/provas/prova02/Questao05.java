package provas.prova02;

import exemplos.unidadeII.arvore.binaria.ArvoreBinaria;
import exemplos.unidadeII.arvore.binaria.NoArvoreBinaria;

public class Questao05 {

	public static void main(String[] args) {
		questaoA();
		questaoB();
		questaoC();
		questaoD();
		questaoE();
	}
	
	public static void questaoA() {
		ArvoreBinaria arvore = new ArvoreBinaria();
	
		NoArvoreBinaria no80 = new NoArvoreBinaria(80, null, null);
		NoArvoreBinaria no30 = new NoArvoreBinaria(30, no80, null);
		
		NoArvoreBinaria no10 = new NoArvoreBinaria(10, null, null);
		NoArvoreBinaria no25 = new NoArvoreBinaria(25, null, null);
		
		NoArvoreBinaria no20 = new NoArvoreBinaria(20, no10, no25);
		
		NoArvoreBinaria no70 = new NoArvoreBinaria(70, no30, no20);
		
		arvore.setRaiz(no70);
		
		System.out.println("Questão A: " + arvore.visitarOrdemSimetrica());
	}

	public static void questaoB() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		NoArvoreBinaria no80 = new NoArvoreBinaria(80, null, null);
		NoArvoreBinaria no30 = new NoArvoreBinaria(30, null, no80);
		
		NoArvoreBinaria no10 = new NoArvoreBinaria(10, null, null);
		NoArvoreBinaria no25 = new NoArvoreBinaria(25, null, null);
		
		NoArvoreBinaria no20 = new NoArvoreBinaria(20, no10, no25);
		
		NoArvoreBinaria no70 = new NoArvoreBinaria(70, no30, no20);
		
		arvore.setRaiz(no70);
		
		System.out.println("Questão B: " + arvore.visitarOrdemSimetrica());	
	}
	
	public static void questaoC() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		NoArvoreBinaria no30 = new NoArvoreBinaria(30, null, null);
		
		NoArvoreBinaria no80 = new NoArvoreBinaria(80, null, null);
		NoArvoreBinaria no10 = new NoArvoreBinaria(10, no80, null);
		NoArvoreBinaria no25 = new NoArvoreBinaria(25, null, null);
		
		NoArvoreBinaria no20 = new NoArvoreBinaria(20, no10, no25);
		
		NoArvoreBinaria no70 = new NoArvoreBinaria(70, no30, no20);
		
		arvore.setRaiz(no70);
		
		System.out.println("Questão C: " + arvore.visitarOrdemSimetrica());	
	}
	
	public static void questaoD() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		NoArvoreBinaria no30 = new NoArvoreBinaria(30, null, null);
		
		NoArvoreBinaria no80 = new NoArvoreBinaria(80, null, null);
		NoArvoreBinaria no25 = new NoArvoreBinaria(25, null, null);
		NoArvoreBinaria no10 = new NoArvoreBinaria(10, no80, no25);
		
		NoArvoreBinaria no20 = new NoArvoreBinaria(20, no10, null);
		
		NoArvoreBinaria no70 = new NoArvoreBinaria(70, no30, no20);
		
		arvore.setRaiz(no70);
		
		System.out.println("Questão D: " + arvore.visitarOrdemSimetrica());	
	}
	
	public static void questaoE() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		NoArvoreBinaria no30 = new NoArvoreBinaria(30, null, null);
		
		NoArvoreBinaria no80 = new NoArvoreBinaria(80, null, null);
		NoArvoreBinaria no25 = new NoArvoreBinaria(25, null, null);
		NoArvoreBinaria no10 = new NoArvoreBinaria(10, no80, no25);
		
		NoArvoreBinaria no20 = new NoArvoreBinaria(20, null, no10);
		
		NoArvoreBinaria no70 = new NoArvoreBinaria(70, no30, no20);
		
		arvore.setRaiz(no70);
		
		System.out.println("Questão E: " + arvore.visitarOrdemSimetrica());	
	}
	
}
